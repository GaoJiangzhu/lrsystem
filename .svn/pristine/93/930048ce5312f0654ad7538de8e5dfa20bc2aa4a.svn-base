package cn.nstl.controller;


import cn.nstl.common.Constant;
import cn.nstl.common.LogMsg;
import cn.nstl.common.SearchConfig;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.Subscriber;
import cn.nstl.service.StatisticalService;
import org.apache.log4j.Logger;
import cn.nstl.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dongzeliang
 * @Description 统计分析控制层
 * @version 1.0
 * @date 2018-6-29
 * */
@Controller
@RequestMapping("/statistical")
public class StatisticalController extends BaseController {

    private static Logger logger = Logger.getLogger(StatisticalController.class);

    private final String path = "statistical/";

    @Autowired
    private StatisticalService statisticalService;

    /**
     * 统计分析跳转
     * */
//    资源订购统计
    @RequestMapping("/subscriber")
    @LogMsg("资源订购统计")
    public String toStatistical(Model model){
        model.addAttribute("search", SearchConfig.arrivalsearch());
        model.addAttribute("items", SearchConfig.item());
        return path+"subscriber";
    }
//    资源到货统计
    @RequestMapping("arrival")
    public String toArrival(Model model){
        return path+"arrival";
    }
//    工作量统计
    @RequestMapping("workload")
    public String toWorkload(){

        return path+"workload";
    }
//    资源分析
    @RequestMapping("analysis")
    public String toAnalysis(){

        return path+"analysis";
    }
    /**
     * 年度统计
     * @return
     */
    @RequestMapping("annualStatistics")
    public String annualStatistics(Model model){
        Map<String ,Object > dataMap = statisticalService.annualStatistics();
        model.addAttribute("data", dataMap);
        return path+"annualStatistics";
    }
    /**
     * 请求获取数据
     * */

//    资源订购统计请求链接
    @RequestMapping("/getSubscriberList")
    @ResponseBody
    public Response getSubscriberList(){
        Map<String, Object > map = Constant.getParams(request);
        return statisticalService.getSubscriberList(map);
    }
}
