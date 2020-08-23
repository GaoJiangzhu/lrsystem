package cn.nstl.service.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SelectionDao;
import cn.nstl.entity.SysOrder;
import cn.nstl.entity.SysResourceInfo;
import cn.nstl.entity.SysResourceLog;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysResourceLogoRepository;
import cn.nstl.service.SelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/27
 */
@Service
@Transactional
public class SelectionServiceImpl implements SelectionService {

    @Autowired
    private SelectionDao selectionDao;

    @Autowired
    private SysResourceLogoRepository sysResourceLogoRepository;

    @Autowired
    private HttpServletRequest request;
    /**
     * 荐购遴选
     * */
    @Override
    public Response getSelection(Map<String, Object> map) {
        List sysList = this.selectionDao.getSelection("1",map);
        Response response = Response.createBySuccess("操作成功",sysList);
        int count = this.selectionDao.getSelectionSum("1",map);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    /**
     * 荐购分配
     * */
    @Override
    public Response<Object> getAuditAssignment(Map<String, Object> map) {
        List sysList = this.selectionDao.getSelection("2",map);
        Response response = Response.createBySuccess("操作成功",sysList);
        int count = this.selectionDao.getSelectionSum("2", map);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

//    同意荐购信息
    @Override
    public Response assignAgree(String ids,String trialOpinion) {
        List<SysResourceLog> sysList = selectionDao.getSelectionIds(ids);
        int i = 1;
        for (SysResourceLog sysResourceLog : sysList) {
            SysUser sysUser = (SysUser)request.getSession().getAttribute(Constant.SESSION_KEY);
//            获取唯一订购号 进行订单与资源绑定
            String orderUnmber = "";
            if (!sysResourceLog.getDistributionStatus().equals("5"))
                orderUnmber = selectionDao.getOrderUnmber(i++);
            else
                orderUnmber = sysResourceLog.getDistributionStatus();

            /*
             * 生成订单
             * */
            SysOrder sysOrder = new SysOrder(orderUnmber,sysUser, sysResourceLog);

            /*
             * 生成资源log 匹配订单
             * */
            sysResourceLog.setOrderUNumber(orderUnmber);

            String[] data =  new String[]{SysDefine.SysOrderStatus.STATUS_ORDER_ONE,SysDefine.SysSelection.STATUS_AUDITING_AGREE,sysResourceLog.getId()};
//            数据库操作
            selectionDao.generateOrders(sysOrder, sysResourceLog,data);
        }
        return Response.createBySuccess("操作成功");
    }

//    拒绝荐购信息
    @Override
    public Response assignRefuse(String ids,String trialOpinion) {
        selectionDao.assignAgree(ids,trialOpinion);
        return Response.createBySuccess("操作成功");
    }

//    荐购遴选分配单位
    @Override
    public Response dist_unit(String ids, String sel_unit) {
        return selectionDao.dist_unit(ids, sel_unit);
    }

    @Override
    public SysResourceInfo getResourceDetails(String id) {
        return selectionDao.getResourceDetails(id);
    }

    @Override
    public int findCountByDistributeStatus(String...distributeStatus) {
        return this.selectionDao.findByDistributionStatus(distributeStatus);
    }
}
