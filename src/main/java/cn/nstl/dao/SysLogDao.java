package cn.nstl.dao;

import cn.nstl.entity.SysLog;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysLogDao {
    List<SysLog> findAll(Map<String, Object > map);

    int countAll(Map<String, Object > map);
}
