package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysCover;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface CoverInfoService {
    Response findList(Map<String, Object> map, SysUser sysUser);

    Response save(SysCover sysCoverInfo, SysUser sysUser);

    SysCover findOne(String id);

    List<SysCover> findAll();

    Response del(String ids);
}
