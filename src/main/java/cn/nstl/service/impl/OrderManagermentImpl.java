package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysOrderDao;
import cn.nstl.repository.SysOrderRepository;
import cn.nstl.service.OrderManagermentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OrderManagermentImpl  implements OrderManagermentService {

    @Autowired
    SysOrderDao sysOrderDao ;

    @Autowired
    private SysOrderRepository sysOrderRepository;


    @Override
    public Response getOrderList(Map<String, Object> map) {
        List findIsList = this.sysOrderDao.getOrderList(map);
        Response response = Response.createBySuccess("操作成功",findIsList);
        int count = 0;
        if(findIsList !=null){ count = findIsList.size();}
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public Response orderAuditList(Map<String, Object> map) throws Exception {
        List findIsList = this.orderAuditList(SysDefine.SysOrderStatus.STATUS_ORDER_ZIZE,map);
        Response response = Response.createBySuccess("操作成功",findIsList);
        int count = this.sysOrderDao.orderAuditCount(SysDefine.SysOrderStatus.STATUS_ORDER_ZIZE,map);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public Response<Object> getContinuedOrder(Map<String, Object> map) throws Exception {
        List findIsList = this.orderAuditList(SysDefine.SysOrderStatus.STATUS_ORDER_ONE, map);
        Response response = Response.createBySuccess("操作成功",findIsList);
        int count = this.sysOrderDao.orderAuditCount(SysDefine.SysOrderStatus.STATUS_ORDER_ONE, map);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public List orderAuditList(String type, Map<String, Object> map) throws Exception {
        return this.sysOrderDao.orderAuditList(type, map);
    }

    //    续订
    @Override
    public Response orderListAgree(String ids, String trialOpinion) {

        sysOrderDao.updOrderAuditAgree(SysDefine.SysSelection.STATUS_AUDITING_AGREE,ids,trialOpinion);
        return Response.createBySuccessMessage("操作成功");
    }
    //    停订
    @Override
    public Response orderListRefuse(String ids, String trialOpinion) {
        sysOrderDao.updOrderAuditAgree(SysDefine.SysSelection.STATUS_DISTRIBUTE_YES,ids,trialOpinion);
        return Response.createBySuccess("操作成功");
    }
    //    审核同意
    @Override
    public Response orderAuditAgree(String ids,String trialOpinion) {
        sysOrderDao.updOrderAuditAgree(SysDefine.SysSelection.STATUS_DISTRIBUTE_NO,ids,trialOpinion);
        return Response.createBySuccess("操作成功");
    }
    //    审核驳回
    @Override
    public Response orderAuditRefuse(String orderIds,String trialOpinion) {
//        通过订单ids获取资源ID
        String resIds = sysOrderDao.getResIdsForOrderIds(orderIds);
//        资源状态改变
        sysOrderDao.updOrderAuditAgree(resIds,orderIds,trialOpinion);
        return Response.createBySuccess("操作成功");
    }

    @Override
    public Response order_status(String ids, String se_unit) {
        sysOrderDao.order_status(ids, se_unit);
        return Response.createBySuccess("操作成功");
    }

    @Override
    public int findByFlowStatus(String...flowStatus) {
        return this.sysOrderDao.findByFlowStatus(flowStatus);
    }
}
