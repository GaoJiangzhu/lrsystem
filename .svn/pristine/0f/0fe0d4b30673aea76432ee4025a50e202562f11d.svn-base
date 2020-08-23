package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysParamDao;
import cn.nstl.entity.SysParam;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysParamRepository;
import cn.nstl.service.ParamService;
import cn.nstl.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ParamServiceImpl implements ParamService {

    @Autowired
    private SysParamRepository sysParamRepository;

    @Autowired
    private SysParamDao sysParamDao;

    @Override
    public Response save(SysParam sysParam) {
        if (StringUtils.isBlank(sysParam.getName())){
            return Response.createByErrorMessage("参数名称不能为空");
        }
        if (StringUtils.isBlank(sysParam.getCode())){
            return Response.createByErrorMessage("参数编码不能为空");
        }

        if (StringUtils.isNotBlank(sysParam.getId())){
            //判断名称或编码是否重复
            List<SysParam> sysParamList = this.sysParamDao.findByNameOrCodeAndIsNotId(sysParam);
            if (sysParamList.size()>0){
                return Response.createByErrorMessage("名称或编码重复");
            }
            SysParam one = this.sysParamRepository.findOne(sysParam.getId());
            if (SysDefine.SysParam.LEVEL_2.equals(one.getLevel())){
                sysParam.setName(one.getName());
                this.sysParamDao.updateNameAndAndCodeById(sysParam);
                return Response.createBySuccessMessage("修改成功");
            } else {
                return Response.createByErrorMessage("只能修改三级节点");
            }
        }else{

            List<SysParam> sysParamList = this.sysParamRepository.findByIsDelAndNameOrCode(SysDefine.SysParam.IS_DEL_NO,sysParam.getName(), sysParam.getCode());
            if (sysParamList.size()>0){
                return Response.createByErrorMessage("名称或编码重复");
            }

        }
        if (StringUtils.isBlank(sysParam.getPId())){
            return Response.createByErrorMessage("请选择一个节点");
        }else {
            SysParam tmp = this.sysParamRepository.findOne(sysParam.getPId());
            if (tmp == null){
                return Response.createByErrorMessage("父级不存在");
            }else {
                if (tmp.getLevel().equals(SysDefine.SysParam.LEVEL_1)){
                    sysParam.setLevel(SysDefine.SysParam.LEVEL_2);
                } else {
                    return Response.createByErrorMessage("只能给二级增加子节点");
                }
            }
        }
        sysParam.setIsDel(SysDefine.SysParam.IS_DEL_NO);
        sysParam.setScore(SysDefine.SysParam.SCORE_DEFAULT);
        sysParam.setWeight(SysDefine.SysParam.WEIGHT_DEFAULT);
        this.sysParamRepository.save(sysParam);
        return Response.createBySuccessMessage("保存成功");
    }

    @Override
    public SysParam findById(String id) {
        return this.sysParamRepository.findOne(id);
    }

    @Override
    public Response del(String id) {
        SysParam sysParam = this.sysParamRepository.findOne(id);
        if (sysParam == null){
            return Response.createByErrorMessage("请选择三级节点");
        }
        if (sysParam.getLevel().equals(SysDefine.SysParam.LEVEL_0) ||sysParam.getLevel().equals(SysDefine.SysParam.LEVEL_1)){
            return Response.createByErrorMessage("一级和二级节点不能被删除");
        }
        this.sysParamDao.deleteById(id);
        return Response.createBySuccess("删除成功");
    }

    @Override
    public List<SysParam> findParaList() {
        return this.sysParamRepository.findAllByIsDel(SysDefine.SysParam.IS_DEL_NO);
    }

    @Override
    public List<SysParam> findByCode(String code) {
        SysParam sysParam = this.sysParamRepository.findByCode(code);
        if (sysParam == null) {
            return new ArrayList<>();
        }
        return this.sysParamRepository.findByPId(sysParam.getId());
    }

    @Override
    public List<Map<String, Object>> getByCode(String code) {
        SysParam sysParam = this.sysParamRepository.findByCode(code);
        if (sysParam == null) {
            return new ArrayList<>();
        }
        return this.sysParamDao.findByPid(sysParam.getId());
    }


    @Override
    public Response getOptionValue(){
        Map map =new HashMap();
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

        map.put("publishList",publishList);
        map.put("countryList",countryList);
        map.put("subjectList",subjectList);
        map.put("frequencyList",frequencyList);
        map.put("carrierList",carrierList);
        map.put("languageList",languageList);
        map.put("coverList",coverList);
        map.put("orderTypeList",orderTypeList);
        map.put("orderingModeList",orderingModeList);
        map.put("currencyList",currencyList);
        map.put("openRangeList",openRangeList);
        map.put("stopReasonList",stopReasonList);
        map.put("fundTypeList",fundTypeList);

        Response response= Response.createBySuccess("操作成功",map);
        return response;
    }

    @Override
    public Response getAuditOpinion(){

        Map map =new HashMap();
        List auditOpinionList = this.sysParamDao.getAuditOpinionList();

        map.put("auditOpinionList",auditOpinionList);

        Response response= Response.createBySuccess("操作成功",map);
        return response;
    }

}
