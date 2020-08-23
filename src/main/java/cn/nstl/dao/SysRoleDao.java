package cn.nstl.dao;

import cn.nstl.common.Response;
import cn.nstl.entity.SysRole;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysRoleDao {
    List<SysRole> findAll(Map<String, Object> map, SysUser sysUser);

    int countAll(Map<String, Object> map, SysUser sysUser);

    void saveMidTable(String roleId, String moduleId);

    void deleteRoleByIds(String roleId);

    List<SysRole> findRolesByUserId(String id);

    Boolean findByName(SysRole sysRole);

    int findUsersByRoleId(String roleId);
}
