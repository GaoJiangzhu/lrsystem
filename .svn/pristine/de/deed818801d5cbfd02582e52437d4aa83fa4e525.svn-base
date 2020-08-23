package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.SearchConfig;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.*;
import cn.nstl.service.DataMaintainService;
import cn.nstl.service.ParamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description 数据维护
 * @date 2018/7/2
 */
@Controller
@RequestMapping("/dataMaintain")
public class DataMaintainController extends BaseController {

    private final String path = "dataMaintain/";

    @Autowired
    DataMaintainService dataMaintainService;

    @Autowired
    private ParamService paramService;

    /**
     * 数据维护页面跳转
     * */
//    跳转数据维护页面
    @RequestMapping("maintain")
    public String toMaintain(){
        return path+"maintain";
    }

//    资源信息维护
    @RequestMapping("resourcesMaintain")
    public String toResourcesMainTain(Model model){
        model.addAttribute("search", SearchConfig.resoucesMaintainSearch());
        model.addAttribute("items", SearchConfig.item());
        return path+"resourcesMaintain";
    }

//    资源信息修改评审
    @RequestMapping("toUpdResReview")
    public String toUpdResReview(Model model){
        model.addAttribute("search", SearchConfig.resoucesMaintainSearch());
        model.addAttribute("items", SearchConfig.item());
        return path+"updResReview";
    }

//    单个资源信息修改评审查看
    @RequestMapping("toUpdResView")
    public String toUpdResView(Model model,String id){
        List<SysResUpdRecord> list = dataMaintainService.updResView(id);
        model.addAttribute("resUpdList",list );
        model.addAttribute("id",id );
        return path+"updResView";
    }
//    资源信息修改页面
    @RequestMapping("toUpdResource")
    public String toUpdResource(Model model,String id){
        SysResourceInfo sysResourceInfo = dataMaintainService.getResources(id );
        Map<String,Object> optionMap = dataMaintainService.getOptionValue();
        model.addAttribute("res",sysResourceInfo );
        model.addAttribute("data",optionMap );
        return path+"updResource";
    }
//    资源信息修改
    @RequestMapping("updResourceInfo")
    @ResponseBody
    public Response updResourceInfo(SysResourceInfo sysResourceInfo){
        return dataMaintainService.updResourceInfo(sysResourceInfo);
    }

//    订购信息维护
    @RequestMapping("subscribeMaintain")
    public String toSubscribeMaintain(Model model){
        model.addAttribute("search", SearchConfig.recommendSearch());
        model.addAttribute("items", SearchConfig.item());
        return path+"subscribeMaintain";
    }

//    套信息维护
    @RequestMapping("setMaintain")
    public String toSetMaintain(){
        return path+"setMaintain";
    }

//    户号信息维护
    @RequestMapping("accountMaintain")
    public String toAccountMaintain(){
        return path+"accountMaintain";
    }

//    代理公司维护
    @RequestMapping("proxyMaintain")
    public String toProxyMaintain(){
        return path+"proxyMaintain";
    }


    /**
     * 获取资源信息
     * */
    @RequestMapping("/getResourcesList")
    @ResponseBody
    public Response getResourcesList(){
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = Constant.getParams(request);
        return this.dataMaintainService.getResourcesList(map,sysUser);
    }
    @RequestMapping("/getResReviewList")
    @ResponseBody
    public Response getResReviewList(){
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = Constant.getParams(request);
        return this.dataMaintainService.getResReviewList(map,sysUser);
    }

    /**
     * 资源修改评审同意
     * */
    @RequestMapping("/agreeReview")
    @ResponseBody
    public Response agreeReview (String ids){
        return this.dataMaintainService.agreeReview(ids);
    }

    /**
     * 资源修改评审驳回
     * */
    @RequestMapping("/refusalReview")
    @ResponseBody
    public Response refusalReview (String ids){
        return this.dataMaintainService.refusalReview(ids);
    }

    /**
     * 获得订购信息维护数据列表
     */
    @RequestMapping("subscribeList")
    @ResponseBody
    public Response subscribeList(){
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = Constant.getParams(request);
        return this.dataMaintainService.subscribeList(map,sysUser);
    }



    /**
     * 查看订单详情
     * @param model
     * @param uOrderNumber
     * @return
     */
    @RequestMapping("orderInfo")
    public String orderInfo(Model model,
                            @RequestParam("uOrderNumber") String uOrderNumber,
                            @RequestParam("type") String type) {
        if(StringUtils.isNotBlank(uOrderNumber)){
            SysOrder sysOrder=dataMaintainService.findOrderInfo(uOrderNumber);
            SysResourceLog sysResourceLog =dataMaintainService.findResourceInfo(uOrderNumber);
            model.addAttribute("orderInfo", sysOrder);
            model.addAttribute("resourceInfo", sysResourceLog);
            model.addAttribute("type",type);
        }else{
            model.addAttribute("orderInfo", new SysOrder());
            model.addAttribute("resourceInfo",new SysResourceLog());
            model.addAttribute("type",type);
        }

        return path + "information";
    }

    /**
     * 获取修改订单的详情
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("updateOrder")
    public String updateOrder(Model model,
                            @RequestParam("id") String id) {
        if(StringUtils.isNotBlank(id)){
            SysOrder sysOrder=dataMaintainService.getOrderInfo(id);
            model.addAttribute("orderInfo", sysOrder);
        }else{
            model.addAttribute("orderInfo", new SysOrder());
        }

        return path + "updateOrder";
    }

    /**
     * 获取下拉框选项
     * @return
     */
    @ResponseBody
    @RequestMapping("getOptionValue")
    public Response getOptionValue(){
        return this.paramService.getOptionValue();
    }


    @ResponseBody
    @RequestMapping("updateOrderInfo")
    public Response updateOrderInfo(SysOrder sysOrder){
        SysUser sysUser = Constant.getSysUser(request);
        return this.dataMaintainService.updateOrderInfo(sysOrder,sysUser);
    }


}
