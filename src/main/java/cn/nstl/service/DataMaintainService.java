package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wuhongjie
 * @Date: Created in 14:45 2018/8/8
 */
public interface DataMaintainService {

    /**
     * 获得荐购清单列表
     * @param map
     * @return
     */
    Response subscribeList(Map<String, Object > map, SysUser sysUser);


    /**
     * 查看订单详情
     * @param uOrderNumber
     * @return
     */
    SysOrder findOrderInfo(String uOrderNumber);


    /**
     * 查看订单资源详情
     * @param uOrderNumber
     * @return
     */
    SysResourceLog findResourceInfo(String uOrderNumber);


    /**
     * 获取修改订单的详情
     * @param id
     * @return
     */
    SysOrder getOrderInfo(String id);

    /**
     * 获取资源信息
     * */
    Response getResourcesList(Map<String, Object> map, SysUser sysUser);

    /**
     * 获取资源信息
     * */
    SysResourceInfo getResources(String id);

    /**
     * 修改资源信息
     * 
     * */
    Response updResourceInfo(SysResourceInfo sysResourceInfo);


    Response updateOrderInfo(SysOrder sysOrder, SysUser sysUser);

    /**
     * 获取前台下拉资源
     * */
    Map<String,Object> getOptionValue();

    /**
     * 获取修改未评审资源
     * */
    Response getResReviewList(Map<String, Object> map, SysUser sysUser);

    /**
     * 资源修改评审通过
     * */
    Response agreeReview(String ids);

    /**
     * 资源修改评审驳回
     * */
    Response refusalReview(String ids);

    /**
     * 通过ID获取资源修改记录
     * */
    List<SysResUpdRecord> updResView(String id);
}
