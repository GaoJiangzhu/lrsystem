package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.SearchConfig;
import cn.nstl.common.SysDefine;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.ProxyCorporation;
import cn.nstl.service.ProxyCorationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("corporation")
public class ProxyCorationController extends BaseController {

    private static final String BATH_PATH = "corporation/";

    @Autowired
    private ProxyCorationService proxyCorationService;

    @RequestMapping(value = "list")
    public String list(@RequestParam(value = "promot", required = false,defaultValue = "0") String promot,
                       Model model){
        model.addAttribute(SysDefine.PROMPT_STRING, promot);
        model.addAttribute("search", SearchConfig.search2Corporation());
        model.addAttribute("items", SearchConfig.item());
        return BATH_PATH + "list";
    }

    @RequestMapping("data")
    @ResponseBody
    public Response data(){
        Map<String, Object > map = Constant.getParams(request);
        return this.proxyCorationService.findList(map, Constant.getSysUser(request));
    }

    @RequestMapping(value = "add")
    public String add(@RequestParam(value = "id", required = false) String id, Model model){
        if (StringUtils.isNotBlank(id)){
            model.addAttribute("corporation", this.proxyCorationService.findOne(id));
        }
        return BATH_PATH + "add";
    }

    @RequestMapping("save")
    @ResponseBody
    public Response save(ProxyCorporation proxyCorporation){
        return this.proxyCorationService.save(proxyCorporation, Constant.getSysUser(request));
    }

    @RequestMapping("del")
    @ResponseBody
    public Response del(@RequestParam(value = "id", required = false, defaultValue = "") String id){
        if (StringUtils.isBlank(id)){
            return Response.createByErrorMessage("请选择要删除的数据");
        }
        return this.proxyCorationService.del(id);
    }

}
