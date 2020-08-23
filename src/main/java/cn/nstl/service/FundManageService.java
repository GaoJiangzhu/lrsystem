package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysUser;

import java.util.Map;

/**
 * @Author: Wuhongjie
 * @Date: Created in 15:39 2018/8/23
 */
public interface FundManageService {

    /**
     * 获得荐购清单列表
     * @param map
     * @return
     */
    Response cypherList(Map<String, Object > map, SysUser sysUser);
}
