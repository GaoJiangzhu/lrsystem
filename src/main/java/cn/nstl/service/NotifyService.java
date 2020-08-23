package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysNotify;
import cn.nstl.entity.SysUser;

import java.util.List;

public interface NotifyService {

    void deleteByUserIds(List<String> userIdList);

    void save(List<SysNotify> notify);

    Response findByUserId(SysUser sysUser);
}
