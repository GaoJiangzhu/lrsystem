package cn.nstl.service;


import cn.nstl.common.Response;
import cn.nstl.entity.*;

import java.util.List;
import java.util.Map;

public interface ResourceRecommendService {


    /**
     * 获得荐购清单列表
     * @param map
     * @return
     */
    Response findList(Map<String, Object > map,SysUser sysUser);


    /**
     * 获得初审列表
     * @param map
     * @return
     */
    Response findFristTrialList(Map<String, Object > map,SysUser sysUser);

    List<SysResourceRecommend> fristTrialList(Map<String, Object> map, SysUser sysUser);

    /**
     * 获得复审列表
     * @param map
     * @return
     */
    Response FindSecondTrialList(Map<String, Object > map,SysUser sysUser);


    List<SysResourceRecommend> secondTrialList(Map<String, Object> map, SysUser sysUser);

    /**
     * 获得资源详情
     * @param id
     * @return
     */
    SysResourceInfo findResourceInfo(String id);


    /**
     * 荐购初审
     * @param isTrial
     * @param trialOpinion
     * @param ids
     * @return
     */
    Response oneTrial (String isTrial, String trialOpinion, String ids, SysUser sysUser);


    /**
     * 荐购复审
     * @param isTrial
     * @param trialOpinion
     * @param ids
     * @return
     */
    Response twoTrial (String isTrial, String trialOpinion, String ids, SysUser sysUser);


    /**
     *  查重
     * @param matching
     * @param title
     * @param pissn
     * @param pisbn
     * @param eissn
     * @param eisbn
     * @return
     */
    Response findRepetition(String matching,String title,String pissn,String pisbn,String eissn,String eisbn);


    /**
     * 信息保存
     * @param sysResourceInfo
     * @param sysResourceRecommend
     * @param sysUser
     * @return
     */
    Response save(SysResourceInfo sysResourceInfo, SysResourceRecommend sysResourceRecommend, SysResourceLog sysResourceLog, SysUser sysUser);


    /**
     * 批量添加
     * @param infoList
     * @param sysUser
     * @return
     */
    Response batchSave(List<Object> infoList,SysUser sysUser);


    /**
     * 重复验证
     * @param sysResourceInfo
     * @return
     */
    int  validateCode(SysResourceInfo sysResourceInfo);


    /**
     * 批量查重
     * @param infoList
     * @return
     */
    Response batchRepetition(List<Object> infoList);

    /**
     * 根据状态查数量
     * @param flowStatus
     * @return
     */
    int findCountByFlowStatus(String...flowStatus);

    /**
     * 加入审核
     * @param ids
     * @return
     */
    Response addTring(String ids);



    List<SysCover> getCoverList();
}
