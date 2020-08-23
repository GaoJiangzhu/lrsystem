package cn.nstl.dao;

import cn.nstl.entity.ProxyCorporation;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysProxyCorporationDao {
    List<ProxyCorporation> findAll(Map<String, Object> map, SysUser sysUser);

    int countAll(Map<String, Object> map, SysUser sysUser);

    int update(ProxyCorporation corporation);
}
