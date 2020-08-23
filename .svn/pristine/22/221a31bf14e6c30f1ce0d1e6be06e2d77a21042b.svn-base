package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.SysDefine;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysModule;
import cn.nstl.entity.SysOrder;
import cn.nstl.entity.SysResourceRecommend;
import cn.nstl.entity.SysUser;
import cn.nstl.service.*;
import cn.nstl.service.impl.UserServiceImpl;
import cn.nstl.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 主页控制器
 * @author liuhaiyuan
 */
@Controller
@RequestMapping("")
public class IndexController extends BaseController {

    private static final String BATH_PATH = "index/";

    @Autowired
    private ModuleService moduleService;

    @Autowired
    private ResourceRecommendService resourceRecommendService;

    @Autowired
    private OrderManagermentService orderManagermentService;

    @Autowired
    private UserService userService;

    @Autowired
    private StatisticalService statisticalService;
    /**
     * 访问主页
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model, HttpSession session){
        SysUser sysUser = Constant.getSysUser(request);
        List<SysModule> moduleList = this.moduleService.getModule(sysUser);
        Map<String, String> map = new HashMap<>();
        for (SysModule module:moduleList){
            map.put(module.getAction(), module.getAction());
        }
        session.setAttribute(Constant.AUTH_KEY, map);
        model.addAttribute("module", moduleList);
        model.addAttribute("sysUser", sysUser);
        return BATH_PATH + "index";
    }

    /**
     * 获取主页数据
     * @return
     */
    @RequestMapping("/home")
    public String home(Model model) throws Exception {
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = new HashMap<>();
        map.put("start",0);
        map.put("length",6);
        List<String> firstTrailList = this.userService.findUserListByModuleUrl(SysDefine.SysModule.RECOMMENT_FIRSTTRIAL);
        List<SysResourceRecommend> fristTrialList = null;
        if (firstTrailList.contains(sysUser.getId())){
            //查询荐购待初审数据
            fristTrialList = this.resourceRecommendService.fristTrialList(map, sysUser);
            for (SysResourceRecommend s:fristTrialList){
                s.setSystime(DateUtils.getTimeDiff(s.getSystime(), DateUtils.getNowTime()));
            }
        }else {
            fristTrialList = new ArrayList<>();
        }

        model.addAttribute("fristTrialList", fristTrialList);
        //获取所有拥有荐购复审权限的用户id
        List<String> twoTrailList = this.userService.findUserListByModuleUrl(SysDefine.SysModule.RECOMMENT_TWOTRIAL);
        List<SysResourceRecommend> secondTrialList = null;
        if (twoTrailList.contains(sysUser.getId())){
            secondTrialList = this.resourceRecommendService.secondTrialList(map, sysUser);
            for (SysResourceRecommend s:secondTrialList){
                s.setSystime(DateUtils.getTimeDiff(s.getSystime(), DateUtils.getNowTime()));
            }
        }else {
            secondTrialList = new ArrayList<>();
        }
        //查询荐购待复审数据
        model.addAttribute("secondTrialList", secondTrialList);


        List<String> orderList = this.userService.findUserListByModuleUrl(SysDefine.SysModule.ORDER_AGREE,SysDefine.SysModule.ORDER_REFUSE);
        List<SysOrder> orderAuditList = null;
        if (orderList.contains(sysUser.getId())){
            //查询订单待审核数据
            orderAuditList = this.orderManagermentService.orderAuditList(SysDefine.SysOrderStatus.STATUS_ORDER_ZIZE, map);
            for (SysOrder s:orderAuditList){
                s.setCreateTime(DateUtils.getTimeDiff(s.getCreateTime(), DateUtils.getNowTime()));
            }
        }else {
            orderAuditList = new ArrayList<>();
        }
        model.addAttribute("orderAuditList", orderAuditList);

//        echarts表格数据
        Map<String ,Object > dataMap = statisticalService.annualStatistics();
        model.addAttribute("data", dataMap);
        return BATH_PATH + "home";
    }

}
