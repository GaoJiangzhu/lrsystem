package cn.nstl.dao;

import cn.nstl.entity.SysOrder;

import java.util.List;
import java.util.Map;

public interface SysOrderDao {
    //续订停订
    List getOrderList(Map<String, Object > map);
    //订单审核
    List<SysOrder> orderAuditList(String status,Map<String, Object > map) throws Exception;

    int orderAuditCount(String s, Map<String, Object> map);

    List annualOrderList(Map<String, Object > map);

    int annualOrderCount(Map<String, Object > map);

    void order_status(String ids, String se_unit);

    void updOrderAuditAgree(String resIds, String orderIds, String trialOpinion);

    int findByFlowStatus(String...flowStatus);

    /**
     * 通过订单ids获取资源ids
     * */
    String getResIdsForOrderIds(String ids);
}
