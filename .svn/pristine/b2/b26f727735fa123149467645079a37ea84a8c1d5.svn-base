package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysRole;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface RoleService {
    Response findRoleList(Map<String, Object> map, SysUser sysUser);

    Response save(SysRole sysRole);

    Response del(SysRole sysRole);

    List<SysRole> findAll();

    List<SysRole> findRolesByUserId(String id);

    SysRole findById(String id);

}
