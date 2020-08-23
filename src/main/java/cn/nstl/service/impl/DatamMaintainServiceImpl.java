package cn.nstl.service.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysDataMaintainDao;
import cn.nstl.dao.SysParamDao;
import cn.nstl.entity.*;
import cn.nstl.repository.SysDataMaintainRepository;
import cn.nstl.utils.DateUtils;
import cn.nstl.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.nstl.service.DataMaintainService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Wuhongjie
 * @Date: Created in 14:45 2018/8/8
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DatamMaintainServiceImpl implements DataMaintainService{

    @Autowired
    SysDataMaintainDao sysDataMaintainDao;

    @Autowired
    HttpServletRequest request;

    @Autowired
    SysDataMaintainRepository sysDataMaintainRepository;

    @Autowired
    private SysParamDao sysParamDao;


    @Override
    public Response subscribeList(Map<String, Object> map, SysUser sysUser) {
        List subscribeList = this.sysDataMaintainDao.findSubscribeList(map,sysUser);
        Response response = Response.createBySuccess("操作成功",subscribeList);
        int count = this.sysDataMaintainDao.findSubscribeCount(map,sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }


    @Override
    public SysOrder findOrderInfo(String uOrderNumber){
        return this.sysDataMaintainDao.findOrderInfo(uOrderNumber);
    }


    @Override
    public SysResourceLog findResourceInfo(String uOrderNumber){
        return this.sysDataMaintainDao.findResourceInfo(uOrderNumber);
    }

    @Override
    public SysOrder getOrderInfo(String id){
        return this.sysDataMaintainDao.getOrderInfo(id);
    }

    /**
     * 获取资源集合
     * */
    @Override
    public Response getResourcesList(Map<String, Object> map, SysUser sysUser) {
        List subscribeList = this.sysDataMaintainDao.getResourcesList(map,sysUser);
        Response response = Response.createBySuccess("操作成功",subscribeList);
        int count = this.sysDataMaintainDao.getResourcesCount(map,sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    /**
     * 获取资源信息
     * */
    @Override
    public SysResourceInfo getResources(String id) {
        return sysDataMaintainDao.getResources(id);
    }

    /**
     * 修改资源信息
     * */
    @Override
    public Response updResourceInfo(SysResourceInfo sysResourceInfo) {
        /**
         * 校验
         * */
        if (StringUtils.isNotEmpty(sysResourceInfo.getId())) {
            Response response = Response.createByErrorMessage("资源错误！");
        }
        SysResourceInfo resources = sysDataMaintainDao.getResources(sysResourceInfo.getId());
        String now = DateUtils.getNow();
        SysUser sysUser = Constant.getSysUser(request);
        if (resources!=null){
            String id = resources.getId();
            String systime = resources.getSystime();
            SysResourceInfoRecord sysResourceInfoRecord = sysDataMaintainDao.resProveExistence(new String[]{id, systime});
            if (sysResourceInfoRecord == null){
                SysResourceInfoRecord resToProve = sysDataMaintainDao.getResToProve(resources.getId());
                resToProve.setInfoId(sysResourceInfo.getId());
                sysDataMaintainDao.resProverSave(resToProve);
            }
            SysResourceInfoRecord resourceInfoRecord = sysDataMaintainDao.getResToProve(resources.getId());
//            替换信息
            resourceInfoRecord.setId(UUIDUtil.getUUID());
            resourceInfoRecord.setInfoId(sysResourceInfo.getId());
            resourceInfoRecord.setCarrier(sysResourceInfo.getCarrier());
            resourceInfoRecord.setSeriesNumber(sysResourceInfo.getSeriesNumber());
            resourceInfoRecord.setSubject(sysResourceInfo.getSubject());
            resourceInfoRecord.setPublisher(sysResourceInfo.getPublisher());
            resourceInfoRecord.setCountry(sysResourceInfo.getCountry());
            resourceInfoRecord.setPubYear(sysResourceInfo.getPubYear());
            resourceInfoRecord.setFoundedYear(sysResourceInfo.getFoundedYear());
            resourceInfoRecord.setLanguage(sysResourceInfo.getLanguage());
            resourceInfoRecord.setType(sysResourceInfo.getType());
            resourceInfoRecord.setPubPattern(sysResourceInfo.getPubPattern());
            resourceInfoRecord.setPubStatus(sysResourceInfo.getPubStatus());
            resourceInfoRecord.setSystime(now);
            resourceInfoRecord.setSysuserid(sysUser.getId());
            resourceInfoRecord.setSysusername(sysUser.getUsername());
            sysDataMaintainDao.resProverSave(resourceInfoRecord);
        }
//        修改资源info状态
        SysResourceInfo resourceInfo = new SysResourceInfo();
        resourceInfo.setId(sysResourceInfo.getId());
        resourceInfo.setReviewStatus("1");
        int i = sysDataMaintainDao.updResourceInfo(resourceInfo);
        if (i <= 0){
            Response response = Response.createByErrorMessage("资源更新失败，请检查！");
        }
        return Response.createBySuccessMessage("资源更新成功！");
    }



    @Override
    public Response updateOrderInfo(SysOrder sysOrder, SysUser sysUser){
        if (StringUtils.isNotEmpty(sysOrder.getId())) {
            return Response.createByErrorMessage("资源错误！");
        }
        sysOrder.setSystime(DateUtils.getNowTime());
        sysOrder.setSysuserId(sysUser.getId());
        sysOrder.setSysuserName(sysUser.getUsername());
        int i = sysDataMaintainDao.updateOrderInfo(sysOrder);
        if (i <= 0){
            return Response.createByErrorMessage("资源更新失败，请检查！");
        }
        return Response.createBySuccessMessage("资源更新成功！");

    }

    /**
     * 获取资源下拉项
     * */
    @Override
    public Map<String, Object> getOptionValue() {
        Map<String, Object> dataMap = new HashMap<>();


        //出版状态
        List publishList = this.sysParamDao.getPublishList();
        //国别
        List countryList = this.sysParamDao.getCountryList();
        //学科
        List subjectList = this.sysParamDao.getSubjectList();
        //出版频率
        List frequencyList = this.sysParamDao.getFrequencyList();
        //载体
        List carrierList = this.sysParamDao.getCarrierList();
        //语种
        List languageList = this.sysParamDao.getLanguageList();
        //套信息
        List coverList = this.sysParamDao.getCoverList();
        //订购类型
        List orderTypeList = this.sysParamDao.getOrderTypeList();
        //订购模式
        List orderingModeList = this.sysParamDao.getOrderingModeList();
        //合同币种
        List currencyList = this.sysParamDao.getCurrencyList();
        //开通范围
        List openRangeList = this.sysParamDao.getOpenRangeList();
        //停订原因
        List stopReasonList = this.sysParamDao.getStopReasonList();
        //经费类型
        List fundTypeList = this.sysParamDao.getFundTypeList();

        dataMap.put("publishList",publishList);
        dataMap.put("countryList",countryList);
        dataMap.put("subjectList",subjectList);
        dataMap.put("frequencyList",frequencyList);
        dataMap.put("carrierList",carrierList);
        dataMap.put("languageList",languageList);
        dataMap.put("coverList",coverList);
        dataMap.put("orderTypeList",orderTypeList);
        dataMap.put("orderingModeList",orderingModeList);
        dataMap.put("currencyList",currencyList);
        dataMap.put("openRangeList",openRangeList);
        dataMap.put("stopReasonList",stopReasonList);
        dataMap.put("fundTypeList",fundTypeList);
        return dataMap;
    }

    @Override
    public Response getResReviewList(Map<String, Object> map, SysUser sysUser) {
        List subscribeList = this.sysDataMaintainDao.getResReviewList(map,sysUser);
        Response response = Response.createBySuccess("操作成功",subscribeList);
        int count = this.sysDataMaintainDao.getResReviewCount(map,sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    /**
     * 资源修改评审通过
     * */
    @Override
    public Response agreeReview(String ids) {
        Integer areeSum = sysDataMaintainDao.agreeReview(SysDefine.SysReview.STATUS_REVIEW_YES,ids);
        if (areeSum>0)
            return Response.createBySuccessMessage("操作成功！");
        return  Response.createBySuccessMessage("操作失败！");
    }

    /**
     * 资源修改评审驳回
     * */
    @Override
    public Response refusalReview(String ids) {
        Integer refusalSum = sysDataMaintainDao.refusalReview(SysDefine.SysReview.STATUS_REVIEW_YES,ids);
        if (refusalSum>0)
            return Response.createBySuccessMessage("操作成功！");
        return  Response.createBySuccessMessage("操作失败！");
    }

    /**
     * 通过ID获取资源修改记录
     * */
    @Override
    public List<SysResUpdRecord> updResView(String id) {
        List<SysResUpdRecord> list = new ArrayList<>();
        SysResourceInfo sysResourceInfo = sysDataMaintainDao.getRes(id);
        SysResourceInfoRecord sysResourceInfoRecord = sysDataMaintainDao.getResUpd(id);
        list.add(new SysResUpdRecord("title",sysResourceInfo.getTitle(),sysResourceInfoRecord.getTitle()));
        list.add(new SysResUpdRecord("载体",sysResourceInfo.getCarrier(),sysResourceInfoRecord.getCarrier()));
        list.add(new SysResUpdRecord("学科",sysResourceInfo.getSubject(),sysResourceInfoRecord.getSubject()));
        list.add(new SysResUpdRecord("出版社",sysResourceInfo.getPublisher(),sysResourceInfoRecord.getPublisher()));
        list.add(new SysResUpdRecord("国别",sysResourceInfo.getCountry(),sysResourceInfoRecord.getCountry()));
        list.add(new SysResUpdRecord("出版年",sysResourceInfo.getPubYear(),sysResourceInfoRecord.getPubYear()));
        list.add(new SysResUpdRecord("创刊年",sysResourceInfo.getFoundedYear(),sysResourceInfoRecord.getFoundedYear()));
        list.add(new SysResUpdRecord("语种",sysResourceInfo.getLanguage(),sysResourceInfoRecord.getLanguage()));
        list.add(new SysResUpdRecord("文献类型",sysResourceInfo.getType(),sysResourceInfoRecord.getType()));
        list.add(new SysResUpdRecord("出版模式",sysResourceInfo.getPubPattern(),sysResourceInfoRecord.getPubPattern()));
        list.add(new SysResUpdRecord("出版状态",sysResourceInfo.getPubStatus(),sysResourceInfoRecord.getPubStatus()));
        return list;
    }
}
