package cn.nstl.dao;

import cn.nstl.entity.SysModule;
import cn.nstl.entity.SysUser;

import java.util.List;

public interface SysModuleDao {

    List<SysModule> getSecModule(String treeLevel);

    List<SysModule> findAll(SysModule sysModule);

    int countAll(SysModule sysModule);

    List<SysModule> findModuleByUser(SysUser sysUser);

    List<String> findModuleUrlList(SysUser sysUser);

    List<SysModule> getModuleListByRoleId(String roleId);

}
