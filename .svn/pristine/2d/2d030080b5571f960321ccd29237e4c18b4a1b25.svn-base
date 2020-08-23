package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysModule;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface ModuleService {

    List<SysModule> getModule(SysUser sysUser);

    List<SysModule> getSecModule(String treeLevel);

    SysModule getSysModuleByTreeLevel(String treeLevel);

    Response findSecModuleList(String parentId);

    Response save(SysModule sysModule);

    Response findAll(SysModule sysModule);

    Response del(String id);

    List<String> findModuleUrlList(SysUser sysUser);

    List<SysModule> getModuleListByRoleId(String roleId);
}
