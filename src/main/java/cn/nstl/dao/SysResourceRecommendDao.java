package cn.nstl.dao;

import cn.nstl.entity.*;

import java.util.List;
import java.util.Map;

public interface SysResourceRecommendDao {

    List findList(Map<String, Object > map,SysUser sysUser);

    int findCount(Map<String, Object > map,SysUser sysUser);

    List<SysResourceRecommend> fristTrialList(Map<String, Object > map,SysUser sysUser);

    int fristTrialCount(Map<String, Object > map,SysUser sysUser);

    List<SysResourceRecommend> secondTrialList(Map<String, Object > map,SysUser sysUser);

    int secondTrialCount(Map<String, Object > map,SysUser sysUser);

    SysResourceInfo findResourceInfo(String id);

    void trial(String isTrial, String trialOpinion, String ids, SysUser sysUser);

    List<SysResourceInfo> onOrderList(String matching, String title, String pissn, String pisbn, String eissn, String eisbn);

    List<SysResourceInfo> notOrderList(String matching, String title, String pissn, String pisbn, String eissn, String eisbn);

    List<SysResourceInfo> repeatedRecommendList(String matching, String title, String pissn, String pisbn, String eissn, String eisbn);

    int validateCode(SysResourceInfo sysResourceInfo);

    int findByFlowStatus(String...flowStatus);

    void addTring(String ids);
}
