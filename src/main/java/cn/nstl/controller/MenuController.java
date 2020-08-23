package cn.nstl.controller;

import cn.nstl.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private ModuleService moduleService;

    @RequestMapping("main")
    public String main(Model model){
        model.addAttribute("module", this.moduleService.getModule(null));
        return "menu/main";
    }

    @RequestMapping("nav")
    public String nav(Model model, @RequestParam("treeLevel") String treeLevel){
        model.addAttribute("module",this.moduleService.getSysModuleByTreeLevel(treeLevel));
        model.addAttribute("secModule", this.moduleService.getSecModule(treeLevel));
        model.addAttribute("index",0);
        return "menu/nav";
    }

    @RequestMapping("index")
    public String index(HttpServletResponse response){
        return "page/index";
    }

    @RequestMapping("form")
    public String form(HttpServletResponse response){
        return "page/form";
    }

    @RequestMapping("table")
    public String table(HttpServletResponse response){
        return "page/table";
    }
    @RequestMapping("home")
    public String home(HttpServletResponse response){
        return "page/home";
    }

}
