package cn.nstl.dao;

import cn.nstl.common.Response;
import cn.nstl.entity.SysOrder;
import cn.nstl.entity.SysResourceInfo;
import cn.nstl.entity.SysResourceLog;

import java.util.List;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/27
 */
public interface SelectionDao {
    List getSelection(String s, Map<String, Object> map);

    int getSelectionSum(String s, Map<String, Object> map);

    Response<String> dist_unit(String ids, String sel_unit);

    List<SysResourceLog> getSelectionIds(String ids);

    void generateOrders(SysOrder sysOrder, SysResourceLog sysResourceLog , String[] data);

    void assignAgree(String ids,String trialOpinion);

    SysResourceInfo getResourceDetails(String id);

    int findByDistributionStatus(String...distributeStatus);

    String getOrderUnmber(int i);
}
