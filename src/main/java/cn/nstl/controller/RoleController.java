package cn.nstl.controller;

import cn.nstl.common.*;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysModule;
import cn.nstl.entity.SysRole;
import cn.nstl.entity.SysUser;
import cn.nstl.service.ModuleService;
import cn.nstl.service.RoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 角色管理控制器
 */
@Controller
@RequestMapping("role")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private ModuleService moduleService;

    private static String BATH_PATH = "role/";

    @RequestMapping("list")
    public String list(
            @RequestParam(value = "promot", required = false,defaultValue = "0") String promot,
            @RequestParam(value = "msg", required = false,defaultValue = "操作成功") String msg,
                       Model model){
        model.addAttribute(SysDefine.PROMPT_STRING, promot);
        model.addAttribute("msg", msg);
        model.addAttribute("search", SearchConfig.search2Role());
        model.addAttribute("items", SearchConfig.item());
        return BATH_PATH + "list";
    }

    @RequestMapping("data")
    @ResponseBody
    public Response data(HttpServletRequest request){
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = Constant.getParams(request);
        return this.roleService.findRoleList(map, sysUser);
    }

    @RequestMapping("add")
    public String add(Model model,
                      @RequestParam(value = "id", required = false) String id){
        SysUser sysUser = Constant.getSysUser(request);
        if (StringUtils.isNotBlank(id)){
            sysUser.setRoleId(id);
            model.addAttribute("role", this.roleService.findById(id));
        }
        List<SysModule> moduleList = this.moduleService.getModule(sysUser);
        moduleList.remove(0);
        model.addAttribute("module", moduleList);

        return BATH_PATH + "add";
    }

    @RequestMapping("save")
    @ResponseBody
    public Response save(SysRole sysRole){
        return this.roleService.save(sysRole);
    }

    @RequestMapping("del")
    @ResponseBody
    public Response del(SysRole sysRole){
        return this.roleService.del(sysRole);
    }

}
