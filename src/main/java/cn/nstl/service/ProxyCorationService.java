package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.ProxyCorporation;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface ProxyCorationService {
    Response findList(Map<String, Object> map, SysUser sysUser);

    ProxyCorporation findOne(String id);

    Response save(ProxyCorporation proxyCorporation, SysUser sysUser);

    Response del(String ids);

    List<ProxyCorporation> findAll();

}
