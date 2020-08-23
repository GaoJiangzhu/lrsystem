package cn.nstl.controller;

import cn.nstl.common.*;
import cn.nstl.controller.base.BaseController;
import cn.nstl.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

/**
 *  日志控制器
 */
@Controller
@RequestMapping("log")
public class LogController extends BaseController {


    private static Logger logger = LoggerFactory.getLogger(LogController.class);
    @Autowired
    private LogService logService;

    private static String BATH_PATH = "log/";

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("type",SysDefine.SysLog.LOG_TYPE_MAP);
        model.addAttribute("search", SearchConfig.search2Log());
        model.addAttribute("items", SearchConfig.item());
        return BATH_PATH + "list";
    }

    @RequestMapping("data")
    @ResponseBody
    public Response data(){
        Map<String, Object > map = Constant.getParams(request);
        return this.logService.list(map);

    }
}
