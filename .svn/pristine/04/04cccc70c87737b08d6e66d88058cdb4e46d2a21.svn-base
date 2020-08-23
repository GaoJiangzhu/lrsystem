package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysResourceInfo;

import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/27
 */
public interface SelectionService {
//    荐购遴选
    Response<Object> getSelection(Map<String, Object> map);
//    审核分配
    Response<Object> getAuditAssignment(Map<String, Object> map);

//    同意荐购信息
    Response assignAgree(String ids,String trialOpinion);

//    拒绝荐购信息
    Response assignRefuse(String ids,String trialOpinion);

//    荐购遴选分配单位
    Response dist_unit(String ids, String sel_unit);
//    获取资源详情
    SysResourceInfo getResourceDetails(String id);

    int findCountByDistributeStatus(String...distributeStatus);
}
