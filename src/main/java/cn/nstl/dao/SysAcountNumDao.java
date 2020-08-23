package cn.nstl.dao;

import cn.nstl.entity.AcountNum;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysAcountNumDao {
    List<AcountNum> findAll(Map<String, Object> map, SysUser sysUser);

    int countAll(Map<String, Object> map, SysUser sysUser);

    int update(AcountNum acountNum);
}
