package cn.nstl.dao;

import cn.nstl.entity.SysNotify;

import java.util.List;

public interface SysNotifyDao {
    List<SysNotify> findByUserId(String userId);

    void deleteAll();

}
