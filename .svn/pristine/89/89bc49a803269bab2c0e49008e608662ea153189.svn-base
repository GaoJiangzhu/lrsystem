package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.AcountNum;
import cn.nstl.entity.ProxyCorporation;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface AcountNumService {
    Response findList(Map<String, Object> map, SysUser sysUser);

    AcountNum findOne(String id);

    Response save(AcountNum acountNum, SysUser sysUser);

    Response del(String ids);


    int findByProxyCorId(String proxyCorId);
}
