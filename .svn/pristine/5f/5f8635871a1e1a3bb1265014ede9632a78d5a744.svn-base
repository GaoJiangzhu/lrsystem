package cn.nstl.dao;

import cn.nstl.entity.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wuhongjie
 * @Date: Created in 14:49 2018/8/8
 */
public interface SysDataMaintainDao {

    List findSubscribeList(Map<String, Object > map, SysUser sysUser);

    int findSubscribeCount(Map<String, Object > map,SysUser sysUser);

    SysOrder findOrderInfo(String uOrderNumber);

    SysResourceLog findResourceInfo(String uOrderNumber);

    SysOrder getOrderInfo(String id);

    List getResourcesList(Map<String, Object> map, SysUser sysUser);

    int getResourcesCount(Map<String, Object> map, SysUser sysUser);

    SysResourceInfo getResources(String id);

    int updResourceInfo(SysResourceInfo sysResourceInfo);

    int updateOrderInfo(SysOrder sysOrder);

    /**
     * 判断资源是否存在于记录表
     * */
    SysResourceInfoRecord resProveExistence(String[] strings);

    /**
     * 资源添加到记录表
     * */
    void resProverSave(SysResourceInfoRecord sysResourceInfoRecord);

    /**
     * 修改资源信息
     * */
    SysResourceInfoRecord getResToProve(String id);

    /**
     * 获取修改为审核资源
     * */
    List getResReviewList(Map<String, Object> map, SysUser sysUser);

    /**
     * 获取修改未审核资源数
     * */
    int getResReviewCount(Map<String, Object> map, SysUser sysUser);

    /**
     * 资源修改审批通过
     * */
    Integer agreeReview(String statusReviewYes, String ids);

    /**
     * 资源修改审批驳回
     * */
    Integer refusalReview(String statusReviewNo, String ids);

    /**
     * 获取修改资源
     * */
    SysResourceInfoRecord getResUpd(String id);

    /**
     * 获取资源原始数据
     * */
    SysResourceInfo getRes(String id);
}
