package cn.nstl.controller;

import cn.nstl.common.*;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysOrgan;
import cn.nstl.entity.SysUser;
import cn.nstl.service.OrganService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("organ")
public class OrganController extends BaseController {

    private static String BATH_PATH = "organ/";

    @Autowired
    private OrganService organService;

    @RequestMapping("list")
    public String list(@RequestParam(value = "promot", required = false,defaultValue = "0") String promot,
                       Model model){
        List<SysOrgan> list = this.organService.findAll();
        model.addAttribute("zNodes",JSONSerializer.serialize(list));
        model.addAttribute(SysDefine.PROMPT_STRING, promot);
        return BATH_PATH + "list";
    }

    @RequestMapping("add")
    public String add(@RequestParam(value = "id", required = false) String id,
                      @RequestParam(value = "isParent", required = false) String isParent, Model model){
        if (StringUtils.isNoneBlank(id)){
            model.addAttribute("id", id);
        }
        if (StringUtils.isNoneBlank(isParent)){
            model.addAttribute("isParent", isParent);
        }
        return BATH_PATH + "add";
    }

    @ResponseBody
    @RequestMapping("save")
    public Response save(SysOrgan sysOrgan){
        return this.organService.save(sysOrgan);

    }

    @RequestMapping("edit")
    @ResponseBody
    public Response edit(SysOrgan sysOrgan){
        return this.organService.edit(sysOrgan);
    }

    @RequestMapping("del")
    @ResponseBody
    public Response del(SysOrgan sysOrgan){
        return this.organService.del(sysOrgan);
    }

    @RequestMapping("getTreeData")
    @ResponseBody
    public Response getTreeData(){
        return Response.createBySuccess(this.organService.findAll());
    }
}
