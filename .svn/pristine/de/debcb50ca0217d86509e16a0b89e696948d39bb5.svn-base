package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.SearchConfig;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysUser;
import cn.nstl.service.FundManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description 经费管理
 * @date 2018/7/5
 */
@RequestMapping("/fundManage")
@Controller
public class FundManageController extends BaseController {

    private final String path = "fundManage/";

    @Autowired
    private FundManageService fundManageService;

    /***
     * 经费管理跳转
     * */
    //预算管理
    @RequestMapping("/toBudgetManage")
    public String toBudgetManage(){
        return path  + "budget";
    }

    //决算管理
    @RequestMapping("/toCypherManage")
    public String toCypherManage(Model model){
        model.addAttribute("search", SearchConfig.recommendSearch());
        model.addAttribute("items", SearchConfig.item());
        return path  + "cypher";
    }

    //预算管理
    @RequestMapping("/toYearFundPay")
    public String toYearFundPay(){
        return path  + "yearFundPay";
    }

    /**
     * 决算管理列表
     */
    @RequestMapping("cypherList")
    @ResponseBody
    public Response cypherList(){
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = Constant.getParams(request);
        return this.fundManageService.cypherList(map,sysUser);
    }

}
