package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysOrder;

import java.util.List;
import java.util.Map;

public interface OrderManagermentService {
    //    停订续订
    Response<Object> getOrderList(Map<String, Object> map);
    //    订购审核
    Response<Object> orderAuditList(Map<String, Object> map) throws Exception;

    //    续订
    Response orderListAgree(String ids, String trialOpinion);

    //    停订
    Response orderListRefuse(String ids, String trialOpinion);

    //订购审核状态
    Response order_status(String ids, String se_unit);

    //    同意审核
    Response orderAuditAgree( String ids,String trialOpinion);

    //    驳回审核
    Response orderAuditRefuse(String ids,String trialOpinion);

    List orderAuditList(String type, Map<String, Object> map) throws Exception;

    //    续订停订
    Response<Object> getContinuedOrder(Map<String, Object> map) throws Exception;

    int findByFlowStatus(String...flowStatus);
}
