package cn.nstl.controller;

import cn.nstl.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  后台任务控制器
 */
@Controller
@RequestMapping("task")
public class TaskController {

    @Autowired
    private LogService logService;

    private static String BATH_PATH = "task/";

    @RequestMapping("list")
    public String list(){
        return BATH_PATH + "list";
    }

    @RequestMapping("tasks")
    public String tasks(){
        return BATH_PATH + "log";
    }
    @RequestMapping("members")
    public String members(){
        return BATH_PATH + "log";
    }

    @RequestMapping("comments")
    public String comments(){
        return BATH_PATH + "log";
    }

}
