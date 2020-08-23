package cn.nstl.controller;

import cn.nstl.common.JSONSerializer;
import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysParam;
import cn.nstl.service.ParamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("quota")
public class QuotaController extends BaseController {

    private final static String BATH_PATH = "quota/";

    @Autowired
    private ParamService paramService;

    @RequestMapping("list")
    public String list(@RequestParam(value = "promot", required = false,defaultValue = "0") String promot,
                       Model model){
        List<SysParam> list = this.paramService.findParaList();
        model.addAttribute("zNodes",JSONSerializer.serialize(list));
        model.addAttribute(SysDefine.PROMPT_STRING, promot);
        return BATH_PATH + "list";
    }

    @RequestMapping("add")
    public String add(@RequestParam(value = "id", required = false) String id,
                      @RequestParam(value = "isParent", required = false) String isParent,
                      Model model){
        if (StringUtils.isNoneBlank(id)){
            model.addAttribute("id", id);
        }
        if (StringUtils.isNoneBlank(isParent)){
            model.addAttribute("isParent", isParent);
        }
        return BATH_PATH + "add";
    }

    @RequestMapping("edit")
    @ResponseBody
    public Response edit(String id){
        return Response.createBySuccess(this.paramService.findById(id));
    }

    @RequestMapping("save")
    @ResponseBody
    public Response save(SysParam sysParam){
        return this.paramService.save(sysParam);
    }
}
