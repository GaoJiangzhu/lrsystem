package cn.nstl.config;

import cn.nstl.common.SysDefine;
import cn.nstl.entity.SysNotify;
import cn.nstl.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Component
@Async
public class QuartzConfiguration {

    @Autowired
    private UserService userService;

    @Autowired
    private ResourceRecommendService resourceRecommendService;

    @Autowired
    private SelectionService selectionService;

    @Autowired
    private OrderManagermentService orderManagermentService;

    @Autowired
    private NotifyService notifyService;

    @Transactional
    @Scheduled(fixedRate = 60000)
    public void setNotify() {
        System.out.println("========定时任务开始========");
        //获取所有拥有荐购初审权限的用户id
        List<String> fistTrailList = this.userService.findUserListByModuleUrl(SysDefine.SysModule.RECOMMENT_FIRSTTRIAL);

        //获取所有拥有荐购复审权限的用户id
        List<String> twoTrailList = this.userService.findUserListByModuleUrl(SysDefine.SysModule.RECOMMENT_TWOTRIAL);

        //获取所有拥有荐购遴选权限的用户id
        List<String> distUnitList = this.userService.findUserListByModuleUrl(SysDefine.SysModule.RECOMMENT_DISTUNIT);

        //获取所有拥有荐审核分配权限的用户id
        List<String> selectionList = this.userService.findUserListByModuleUrl(SysDefine.SysModule.SELECTION_AGREE,SysDefine.SysModule.SELECTION_REFUSE);

        //获取所有拥有订购审核权限的用户id
        List<String> orderList = this.userService.findUserListByModuleUrl(SysDefine.SysModule.ORDER_AGREE,SysDefine.SysModule.ORDER_REFUSE);

        //去重所有的userid
        List<String> userIdList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.addAll(fistTrailList);
        set.addAll(twoTrailList);
        set.addAll(distUnitList);
        set.addAll(selectionList);
        set.addAll(orderList);
        set.clear();
        userIdList.addAll(set);


        Map<String, SysNotify> map = new HashMap<>();
        /**
         * 所有拥有资源权限的人都能看到荐购初审的数据
         */
        //查询所有需要荐购初审的数据量
        int recommendFlowOneCount = this.resourceRecommendService.findCountByFlowStatus(SysDefine.SysRecommended.STATUS_AUDITING, SysDefine.SysRecommended.STATUS_FIRSTTRAIL_REFUSE);

        for (String userId: fistTrailList) {
            SysNotify notify = new SysNotify();
            notify.setUserId(userId);
            notify.setRecommendFlowOneCount(recommendFlowOneCount);
            map.put(userId, notify);
        }
        //查询所有需要荐购初审的数据量
        int recommendFlowTwoCount = this.resourceRecommendService.findCountByFlowStatus(SysDefine.SysRecommended.STATUS_FIRSTTRAIL_AGREE, SysDefine.SysRecommended.STATUS_TWOTRAIL_REFUSE);

        for (String userId:twoTrailList){
            if (map.get(userId)!=null){
                SysNotify notify = map.get(userId);
                notify.setRecommendFlowTwoCount(recommendFlowTwoCount);
                map.put(userId, notify);
            }else{
                SysNotify notify = new SysNotify();
                notify.setUserId(userId);
                notify.setRecommendFlowTwoCount(recommendFlowTwoCount);
                map.put(userId, notify);
            }
        }
        int resourceFlowoneCount = this.selectionService.findCountByDistributeStatus(SysDefine.SysSelection.STATUS_DISTRIBUTE_NO, SysDefine.SysSelection.STATUS_AUDITING_REFUSE);

        for (String userId:distUnitList){
            if (map.get(userId)!=null){
                SysNotify notify = map.get(userId);
                notify.setResourceFlowoneCount(resourceFlowoneCount);
                map.put(userId, notify);
            }else{
                SysNotify notify = new SysNotify();
                notify.setUserId(userId);
                notify.setResourceFlowoneCount(resourceFlowoneCount);
                map.put(userId, notify);
            }
        }

        int resourceFlowTwoCount = this.selectionService.findCountByDistributeStatus(SysDefine.SysSelection.STATUS_DISTRIBUTE_YES);

        for (String userId:selectionList){
            if (map.get(userId)!=null){
                SysNotify notify = map.get(userId);
                notify.setResourceFlowTwoCount(resourceFlowTwoCount);
                map.put(userId, notify);
            }else{
                SysNotify notify = new SysNotify();
                notify.setUserId(userId);
                notify.setResourceFlowTwoCount(resourceFlowTwoCount);
                map.put(userId, notify);
            }
        }
        int orderFlowCount = this.orderManagermentService.findByFlowStatus(SysDefine.SysOrder.STATUS_ORDER_NO,SysDefine.SysOrder.STATUS_ORDER_REFUSE);

        for (String userId:selectionList){
            if (map.get(userId)!=null){
                SysNotify notify = map.get(userId);
                notify.setOrderFlowCount(orderFlowCount);
                map.put(userId, notify);
            }else{
                SysNotify notify = new SysNotify();
                notify.setUserId(userId);
                notify.setOrderFlowCount(orderFlowCount);
                map.put(userId, notify);
            }
        }

        List<SysNotify> list = new ArrayList<>();
        for (Map.Entry<String, SysNotify> m : map.entrySet()) {
            list.add(m.getValue());
        }
        this.notifyService.deleteByUserIds(null);
        this.notifyService.save(list);
        System.out.println("============定时任务结束============");

    }


}