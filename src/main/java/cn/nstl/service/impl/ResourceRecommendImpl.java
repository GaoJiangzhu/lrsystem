package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.dao.SysParamDao;
import cn.nstl.dao.SysResourceRecommendDao;
import cn.nstl.entity.*;
import cn.nstl.repository.SysResourceInfoRepository;
import cn.nstl.repository.SysResourceLogoRepository;
import cn.nstl.repository.SysResourceRecommendRepository;
import cn.nstl.service.ResourceRecommendService;
import cn.nstl.utils.DateUtils;
import cn.nstl.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceRecommendImpl implements ResourceRecommendService {

    @Autowired
    SysResourceRecommendDao sysResourceRecommendDao;

    @Autowired
    SysResourceRecommendRepository sysResourceRecommendRepository;

    @Autowired
    SysResourceInfoRepository sysResourceInfoRepository;

    @Autowired
    SysResourceLogoRepository sysResourceLogoRepository;

    @Autowired
    SysParamDao sysParamDao;


    @Override
    public Response findList(Map<String, Object > map,SysUser sysUser) {
        List findFristTrialList = this.sysResourceRecommendDao.findList(map,sysUser);
        Response response = Response.createBySuccess("操作成功",findFristTrialList);
        int count = this.sysResourceRecommendDao.findCount(map,sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public Response findFristTrialList(Map<String, Object > map,SysUser sysUser) {
        List findFristTrialList = this.fristTrialList(map, sysUser);
        Response response = Response.createBySuccess("操作成功",findFristTrialList);
        int count = this.sysResourceRecommendDao.fristTrialCount(map, sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public List<SysResourceRecommend> fristTrialList(Map<String, Object> map, SysUser sysUser){
        return this.sysResourceRecommendDao.fristTrialList(map,sysUser);
    }

    @Override
    public Response FindSecondTrialList(Map<String, Object > map,SysUser sysUser) {
        List findFristTrialList = this.secondTrialList(map,sysUser);
        Response response = Response.createBySuccess("操作成功",findFristTrialList);
        int count = this.sysResourceRecommendDao.secondTrialCount(map,sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public List<SysResourceRecommend> secondTrialList(Map<String, Object > map,SysUser sysUser){
        return this.sysResourceRecommendDao.secondTrialList(map,sysUser);
    }

    @Override
    public SysResourceInfo findResourceInfo(String id) {
        return this.sysResourceRecommendDao.findResourceInfo(id);
    }

    @Override
    public Response oneTrial(String isTrial, String trialOpinion, String ids, SysUser sysUser) {
        try {
            this.sysResourceRecommendDao.trial(isTrial, trialOpinion, ids,sysUser);
            return Response.createBySuccessMessage("审核成功");
        }catch(Exception e){
            return Response.createByErrorMessage("审核失败");
        }
    }


    @Override
    public Response twoTrial(String isTrial, String trialOpinion, String ids, SysUser sysUser) {
        try {
            this.sysResourceRecommendDao.trial(isTrial, trialOpinion, ids,sysUser);
            return Response.createBySuccessMessage("审核成功");
        }catch(Exception e){
            return Response.createByErrorMessage("审核失败");
        }
    }

    @Override
    public Response findRepetition(String matching,String title,String pissn,String pisbn,String eissn,String eisbn) {

        Map map=new HashMap();
        List onOrderList=null;
        List notOrderList=null;
        List repeatedRecommendList=null;
        if(!(StringUtils.isBlank(title)&&StringUtils.isBlank(pissn)&&StringUtils.isBlank(pisbn)&&StringUtils.isBlank(eissn)&&StringUtils.isBlank(eisbn))) {
            //可重复荐购
            repeatedRecommendList= this.sysResourceRecommendDao.repeatedRecommendList(matching,title,pissn,pisbn,eissn,eisbn);
            //已订购
            onOrderList  = this.sysResourceRecommendDao.onOrderList(matching,title,pissn,pisbn,eissn,eisbn);
            //未订购
            notOrderList = this.sysResourceRecommendDao.notOrderList(matching,title,pissn,pisbn,eissn,eisbn);
        }
        map.put("onOrderList",onOrderList);
        map.put("notOrderList",notOrderList);
        map.put("repeatedRecommendList",repeatedRecommendList);

        Response response = Response.createBySuccess("操作成功",map);
        return response;
    }

    @Override
    public Response save(SysResourceInfo sysResourceInfo, SysResourceRecommend sysResourceRecommend, SysResourceLog sysResourceLog, SysUser sysUser) {

        //信息补全
        //荐购ID
        String id=UUIDUtil.getUUID();
        //资源ID
        String ids=UUIDUtil.getUUID();

        sysResourceRecommend.setId(id);
        sysResourceRecommend.setFlowStatus("5");
        sysResourceRecommend.setSysuserid(sysUser.getId());
        sysResourceRecommend.setSystime(DateUtils.getNowTime());
        sysResourceRecommend.setSysusername(sysUser.getUsername());
        sysResourceRecommend.setOrganizationId(sysUser.getOrganId());

        sysResourceInfo.setId(ids);
        sysResourceInfo.setRecommendId(id);
        sysResourceInfo.setSysuserid(sysUser.getId());
        sysResourceInfo.setSystime(DateUtils.getNowTime());
        sysResourceInfo.setSysusername(sysUser.getUsername());
        sysResourceInfo.setDistributionStatus("0");
        sysResourceInfo.setOrderStatus("0");

        try {
            //添加资源详细信息
            this.sysResourceInfoRepository.save(sysResourceInfo);
            //添加资源荐购
            this.sysResourceRecommendRepository.save(sysResourceRecommend);
            return Response.createBySuccessMessage("保存成功");
        }catch (Exception e){
            return Response.createByErrorMessage("保存失败");
        }

    }

    @Override
    public int validateCode(SysResourceInfo sysResourceInfo){
        return sysResourceRecommendDao.validateCode(sysResourceInfo);
    }

    @Override
    public  Response batchRepetition(List<Object> infoList){
        List newList= new ArrayList();
        for (Object info:infoList) {
            HashMap map=new HashMap();
            SysResourceInfo sysResourceInfo = (SysResourceInfo)info;
            //已订购
            List onOrderList = this.sysResourceRecommendDao.onOrderList("accurate", sysResourceInfo.getTitle(), sysResourceInfo.getPissn(), sysResourceInfo.getPisbn(), sysResourceInfo.getEissn(), sysResourceInfo.getEisbn());
            //未订购
            List notOrderList = this.sysResourceRecommendDao.notOrderList("accurate",sysResourceInfo.getTitle(), sysResourceInfo.getPissn(), sysResourceInfo.getPisbn(), sysResourceInfo.getEissn(), sysResourceInfo.getEisbn());

            map.put("info",sysResourceInfo);
            map.put("onOrderList",onOrderList);
            map.put("notOrderList",notOrderList);
            newList.add(map);
        }
        return Response.createBySuccess("批量查重报告",newList);
    }

    @Override
    public Response batchSave(List<Object> inforList,SysUser sysUser){
        try {
            StringBuffer sb = new StringBuffer();
            sb.append("开始导入数据\n");
            //套
            List<SysCover> coverList = this.sysParamDao.getCoverList();
            //出版状态
            List<SysParam> publishList = this.sysParamDao.getPublishList();
            //国别
            List<SysParam> countryList = this.sysParamDao.getCountryList();
            //学科
            List<SysParam> subjectList = this.sysParamDao.getSubjectList();
            //出版频率
            List<SysParam> frequencyList = this.sysParamDao.getFrequencyList();
            //载体
            List<SysParam> carrierList = this.sysParamDao.getCarrierList();
            //语种
            List<SysParam> languageList = this.sysParamDao.getLanguageList();


            for (int i = 0; i < inforList.size(); i++) {
                SysResourceInfo sysResourceInfo = (SysResourceInfo) inforList.get(i);
                if(StringUtils.isBlank(sysResourceInfo.getTitle())){
                    sb.append("第" + (i + 1) + "行缺少题名，添加失败\n");
                    continue;
                }
                if(StringUtils.isBlank(sysResourceInfo.getPublisher())){
                    sb.append("第" + (i + 1) + "行缺少出版社，添加失败\n");
                    continue;
                }
                //数据库验重
                if (0 != this.validateCode(sysResourceInfo)) {
                    sb.append("第" + (i + 1) + "行有重复信息，添加失败\n");
                    continue;
                }
                //检查套
                String newCover = sysResourceInfo.getCoverId();
                if(StringUtils.isNotBlank(newCover)) {
                    for (SysCover cover : coverList) {
                        if (newCover.equals(cover.getCoverName())) {
                            sysResourceInfo.setCoverId(cover.getId());
                            break;
                        }
                    }
                    if (newCover.equals(sysResourceInfo.getCoverId())) {
                        sb.append("第" + (i + 1) + "行的套信息在数据库中不存在，添加失败\n");
                        continue;
                    }
                }
                //检查出版状态
                String newPublish = sysResourceInfo.getPubStatus();
                if(StringUtils.isNotBlank(newPublish)) {
                    for (SysParam publish : publishList) {
                        if (newPublish.equals(publish.getName())) {
                            sysResourceInfo.setPubStatus(publish.getCode());
                            break;
                        }
                    }
                    if (newPublish.equals(sysResourceInfo.getPubStatus())) {
                        sb.append("第" + (i + 1) + "行的出版模式在数据库中不存在，添加失败\n");
                        continue;
                    }
                }
                //检查国别
                String newCountry = sysResourceInfo.getCountry();
                if(StringUtils.isNotBlank(newCountry)) {
                    for (SysParam country : countryList) {
                        if (newCountry.equals(country.getName())) {
                            sysResourceInfo.setCountry(country.getCode());
                            break;
                        }
                    }
                    if (newCountry.equals(sysResourceInfo.getCountry())) {
                        sb.append("第" + (i + 1) + "行的国别信息在数据库中不存在，添加失败\n");
                        continue;
                    }
                }
                //检查学科
                String newSubject = sysResourceInfo.getSubject();
                if(StringUtils.isNotBlank(newSubject)) {
                    for (SysParam subject : subjectList) {
                        if (newSubject.equals(subject.getName())) {
                            sysResourceInfo.setSubject(subject.getCode());
                            break;
                        }
                    }
                    if (newSubject.equals(sysResourceInfo.getSubject())) {
                        sb.append("第" + (i + 1) + "行的学科信息在数据库中不存在，添加失败\n");
                        continue;
                    }
                }
                //检查出版频率
                String newFrequency = sysResourceInfo.getPubFeq();
                if(StringUtils.isNotBlank(newFrequency)) {
                    for (SysParam frequency : frequencyList) {
                        if (newFrequency.equals(frequency.getName())) {
                            sysResourceInfo.setPubFeq(frequency.getCode());
                            break;
                        }
                    }
                    if (newFrequency.equals(sysResourceInfo.getPubFeq())) {
                        sb.append("第" + (i + 1) + "行的出版评率在数据库中不存在，添加失败\n");
                        continue;
                    }
                }
                //检查载体
                String newCarrier = sysResourceInfo.getCarrier();
                if(StringUtils.isNotBlank(newCarrier)) {
                    for (SysParam carrier : carrierList) {
                        if (newCarrier.equals(carrier.getName())) {
                            sysResourceInfo.setCarrier(carrier.getCode());
                            break;
                        }
                    }
                    if (newCarrier.equals(sysResourceInfo.getCarrier())) {
                        sb.append("第" + (i + 1) + "行的载体信息在数据库中不存在，添加失败\n");
                        continue;
                    }
                }
                //检查语种
                String newLanguage = sysResourceInfo.getLanguage();
                if(StringUtils.isNotBlank(newLanguage)) {
                    if(newLanguage.indexOf(",")==-1) {
                        for (SysParam language : languageList) {
                            if (newLanguage.equals(language.getName())) {
                                sysResourceInfo.setLanguage(language.getCode());
                                break;
                            }
                        }
                        if (newLanguage.equals(sysResourceInfo.getLanguage())) {
                            sb.append("第" + (i + 1) + "行的语种信息在数据库中不存在，添加失败\n");
                            continue;
                        }
                    }else{
                        String langarr[]=newLanguage.split(",");
                        String[] langstr=new String[]{};
                        for(int j=0;j<langarr.length;j++){
                            for (SysParam language : languageList) {
                                if (langarr[j].equals(language.getName())) {
                                    langstr[j]=language.getCode();
                                    break;
                                }
                            }
                        }
                        if(langarr.length!=langstr.length){
                            sb.append("第" + (i + 1) + "行的语种信息在数据库中不存在，添加失败\n");
                        }else{
                            String languages="";
                            for(int z=0;z<langstr.length;z++){
                                languages+=langstr[z]+",";
                            }
                            languages.substring(0,languages.length()-1);
                            sysResourceInfo.setLanguage(languages);
                        }
                    }
                }
                SysResourceLog sysResourceLog = new SysResourceLog();
                SysResourceRecommend sysResourceRecommend = new SysResourceRecommend();
                BeanUtils.copyProperties(sysResourceInfo, sysResourceLog);
                BeanUtils.copyProperties(sysResourceInfo, sysResourceRecommend);
                save(sysResourceInfo, sysResourceRecommend, sysResourceLog, sysUser);
            }
            sb.append("数据导入完成");
            return Response.createBySuccessMessage(sb.toString());
        }catch (Exception e) {
            return Response.createByErrorMessage("保存失败");
        }
    }


    @Override
    public int findCountByFlowStatus(String...flowStatus) {
        return this.sysResourceRecommendDao.findByFlowStatus(flowStatus);
    }

    @Override
    public Response addTring(String ids){
        try {
            this.sysResourceRecommendDao.addTring(ids);
            return Response.createBySuccessMessage("添加成功");
        }catch(Exception e){
            return Response.createByErrorMessage("添加失败");
        }
    }

    @Override
    public List<SysCover> getCoverList(){
        List<SysCover> coverList=sysParamDao.getCoverList();
        return coverList;
    }

}
