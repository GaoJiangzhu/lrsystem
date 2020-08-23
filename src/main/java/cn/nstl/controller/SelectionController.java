package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.SearchConfig;
import cn.nstl.common.SysDefine;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysResourceInfo;
import cn.nstl.service.SelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description 荐购分配
 * @date 2018/7/6
 */
@Controller
@RequestMapping("/selection")
public class SelectionController extends BaseController {

    private final String path = "selection/";

    @Autowired
    private SelectionService selectionService;

    /**
     * 跳转路径集
     * */
//    荐购遴选
    @RequestMapping("/recommended")
    public String toSelection(Model model){
        model.addAttribute("type",SysDefine.SysRecommended.REC_TYPE_MAP);
        model.addAttribute("search", SearchConfig.search2Rec(false));
        model.addAttribute("items", SearchConfig.item());
        return path + "recommended";
    }
//    审核分配
    @RequestMapping("/toAuditAssignment")
    public String toAuditAssignment(Model model){
        model.addAttribute("search", SearchConfig.search2Rec(true));
        model.addAttribute("items", SearchConfig.item());
        return path + "auditAssignment";
    }
    /**
     * 数据操作集合
     * */
//    荐购数据查询
    @RequestMapping("/getSelection")
    @ResponseBody
    public Response getSelection(){
        Map<String, Object > map = Constant.getParams(request);
        Response<Object> response = selectionService.getSelection(map);
        return response;
    }
//    审核分配查询
    @RequestMapping("/getAuditAssignment")
    @ResponseBody
    public Response getAuditAssignment(){
        Map<String, Object > map = Constant.getParams(request);
        Response<Object> response = selectionService.getAuditAssignment(map);
        return response;
    }
//    荐购遴选分配单位
    @RequestMapping("/dist_unit")
    @ResponseBody
    public Response dist_unit(String ids,String sel_unit){
        return selectionService.dist_unit(ids,sel_unit);
    }
//    审核通过
    @RequestMapping("/assignAgree")
    @ResponseBody
    public Response assignAgree(String ids,String trialOpinion){
        return selectionService.assignAgree(ids,trialOpinion);
    }
//    审核驳回
    @RequestMapping("/assignRefuse")
    @ResponseBody
    public Response assignRefuse(String ids,String trialOpinion){
        return selectionService.assignRefuse(ids,trialOpinion);
    }
//    获取资源详情
    @RequestMapping("/getResourceDetails")
    @ResponseBody
    public SysResourceInfo getResourceDetails(String id){
        return selectionService.getResourceDetails(id);
    }
}
