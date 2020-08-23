package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.ResponseCode;
import cn.nstl.entity.SysModule;
import cn.nstl.entity.SysUser;
import cn.nstl.service.ModuleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("auth")
public class AuthController {

    private static String BATH_PATH = "auth/";

    @Autowired
    private ModuleService moduleService;

    @RequestMapping("list")
    public String list(){
        return BATH_PATH + "list";
    }

    @RequestMapping("add")
    public String add(Model model, HttpServletRequest request){
        SysUser sysUser = Constant.getSysUser(request);
        if (sysUser == null){
            return "redirect:/new/newlogin";
        }
        List<SysModule> moduleList = this.moduleService.getModule(sysUser);
		moduleList.remove(0);
		model.addAttribute("module", moduleList);
        return BATH_PATH + "add";
    }

    @ResponseBody
    @RequestMapping("change")
    public Response change(@RequestParam("parentId") String parentId, HttpSession session){
        SysUser sysUser = (SysUser)session.getAttribute(Constant.SESSION_KEY);
        if (sysUser == null){
            return Response.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }

        if (StringUtils.isBlank(parentId)){
            return Response.createByErrorMessage("下拉选联动参数错误");
        }
        return moduleService.findSecModuleList(parentId);
    }

    @ResponseBody
    @RequestMapping("save")
    public Response save(SysModule sysModule, HttpSession session){
        SysUser sysUser = (SysUser)session.getAttribute(Constant.SESSION_KEY);
        if (sysUser == null){
            return Response.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }


        return moduleService.save(sysModule);
    }

    @RequestMapping("data")
    @ResponseBody
    public Response data(SysModule sysModule, HttpSession session){
        SysUser sysUser = (SysUser)session.getAttribute(Constant.SESSION_KEY);
        if (sysUser == null){
            return Response.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return moduleService.findAll(sysModule);
    }

    @RequestMapping("del")
    @ResponseBody
    public Response dele(@RequestParam(value = "id",required = false) String id, HttpSession session){
        SysUser sysUser = (SysUser)session.getAttribute(Constant.SESSION_KEY);
        if (sysUser == null){
            return Response.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        if (StringUtils.isBlank(id)){
            return Response.createByErrorMessage("参数不正确");
        }
        return this.moduleService.del(id);
    }
}
