package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.controller.base.BaseController;
import cn.nstl.common.SearchConfig;
import cn.nstl.common.SysDefine;
import cn.nstl.service.OrderManagermentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/orderManagement")
public class OrderManagementController extends BaseController {

    private final String path = "orderManagement/";

    @Autowired
    private OrderManagermentService orderManagermentService;

//    跳转页面
    /**
     * 续订停订
     * @return
     */
    @RequestMapping("/orderAudit")
    public String orderList(Model model){
        model.addAttribute("search", SearchConfig.searchOrder());
        model.addAttribute("items", SearchConfig.item());
        return path + "orderAudit";
    }
    /**
     * 续订停订
     * @return
     */
    @RequestMapping("/continuedOrder")
    public String continuedOrder(Model model){
        model.addAttribute("search", SearchConfig.searchOrder());
        model.addAttribute("items", SearchConfig.item());
        return path + "continuedOrder";
    }

    /**
     *年度订单
     * @return
     */
    @RequestMapping("/annualOrder")
    public String toSysOrder(Model model){
        model.addAttribute("type",SysDefine.SysAnnualOrder.ANO_TYPE_MAP);
        model.addAttribute("type2",SysDefine.SysAnnualOrder.YEAR_TYPE_MAP);
        model.addAttribute("search", SearchConfig.searchOrderYear());
        model.addAttribute("items", SearchConfig.item());
        return path + "annualOrder";
    }

    /**
     *
     * 功能实现
     *
     * */
    //    订购审核
    @RequestMapping("/getOrderAudit")
    @ResponseBody
    public Response orderAudit() throws Exception {
        Map<String, Object > map = Constant.getParams(request);
        Response<Object> response = orderManagermentService.orderAuditList(map);
        return response;
    }
    //    审核通过
    @RequestMapping("/orderAuditAgree")
    @ResponseBody
    public Response orderAuditAgree(String ids,String trialOpinion){
        return orderManagermentService.orderAuditAgree(ids,trialOpinion);
    }
    //    审核驳回
    @RequestMapping("/orderAuditRefuse")
    @ResponseBody
    public Response orderAuditRefuse(String ids,String trialOpinion){
        return orderManagermentService.orderAuditRefuse(ids,trialOpinion);
    }
    //    续订停订
    @RequestMapping("/getContinuedOrder")
    @ResponseBody
    public Response getContinuedOrder() throws Exception {
        Map<String, Object > map = Constant.getParams(request);
        Response<Object> response = orderManagermentService.getContinuedOrder(map);
        return response;
    }
    //    续订
    @RequestMapping("/orderListAgree")
    @ResponseBody
    public Response orderListAgree(String ids,String trialOpinion){
        return orderManagermentService.orderListAgree(ids,trialOpinion);
    }
    //    停订
    @RequestMapping("/orderListRefuse")
    @ResponseBody
    public Response orderListRefuse(String ids,String trialOpinion){
        return orderManagermentService.orderListRefuse(ids,trialOpinion);
    }


   //    年度订单数据查询
    @RequestMapping("/getOrderList")
    @ResponseBody
    public Response getOrderList(){
        Map<String, Object > map = Constant.getParams(request);
        Response<Object> response = orderManagermentService.getOrderList(map);
        return response;
    }
}
