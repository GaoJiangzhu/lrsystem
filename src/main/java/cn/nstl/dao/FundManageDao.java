package cn.nstl.dao;

import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wuhongjie
 * @Date: Created in 15:53 2018/8/23
 */
public interface FundManageDao {

    List cypherList(Map<String, Object > map, SysUser sysUser);

    int findCount(Map<String, Object > map,SysUser sysUser);
}
