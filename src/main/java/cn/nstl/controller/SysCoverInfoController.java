package cn.nstl.controller;

import cn.nstl.common.*;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysCover;
import cn.nstl.service.CoverInfoService;
import cn.nstl.service.ParamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "coverinfo")
public class SysCoverInfoController extends BaseController {

    private static final String BATH_PATH = "cover/";

    @Autowired
    private CoverInfoService coverInfoService;

    @Autowired
    private ParamService paramService;

    @RequestMapping("list")
    public ModelAndView list(Model model){
        //语种
        List<Map<String, Object>> type = this.paramService.getByCode(SysDefine.SysParam.LANGUAGE);
        model.addAttribute("type", Constant.transferList2Map(type));
        //学科
        List<Map<String, Object>> type2 = this.paramService.getByCode(SysDefine.SysParam.SUBJECT);
        model.addAttribute("type2",Constant.transferList2Map(type2));
        //出版国
        List<Map<String, Object>> type3 = this.paramService.getByCode(SysDefine.SysParam.COUNTRY);
        model.addAttribute("type3", Constant.transferList2Map(type3));
        model.addAttribute("search", SearchConfig.search2Cover());
        model.addAttribute("items", SearchConfig.item());
        return new ModelAndView(BATH_PATH+"list", "model", model);
    }

    @RequestMapping("data")
    @ResponseBody
    public Response data(){
        Map<String, Object > map = Constant.getParams(request);
        return this.coverInfoService.findList(map, Constant.getSysUser(request));
    }

    @RequestMapping("add")
    public ModelAndView add(Model model,@RequestParam(value = "id", required = false, defaultValue = "0") String id){
        SysCover sysCover = this.coverInfoService.findOne(id);
        model.addAttribute("cover", sysCover);
        model.addAttribute("pubCountrys", this.paramService.findByCode(SysDefine.SysParam.COUNTRY));
        model.addAttribute("subjects", this.paramService.findByCode(SysDefine.SysParam.SUBJECT));
        model.addAttribute("languages", this.paramService.findByCode(SysDefine.SysParam.LANGUAGE));
        model.addAttribute("languageIds", sysCover==null?"":sysCover.getLanguage());
        return new ModelAndView(BATH_PATH+"add", "model", model);
    }

    @RequestMapping("save")
    @ResponseBody
    public Response save(SysCover sysCoverInfo){
        return this.coverInfoService.save(sysCoverInfo, Constant.getSysUser(request));
    }

    @RequestMapping("del")
    @ResponseBody
    public Response del(@RequestParam(value = "id", required = false, defaultValue = "0") String id){
        if (StringUtils.equals("0", id)){
            return Response.createByErrorMessage("删除失败，请选择要删除的数据");
        }
        return this.coverInfoService.del(id);
    }
}
