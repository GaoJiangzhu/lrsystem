package cn.nstl.dao;

import cn.nstl.entity.SysOrgan;

import java.util.List;

public interface SysOrganDao {
    void updateNameAndCodeById(SysOrgan sysOrgan);

    List<SysOrgan> findByNameOrCodeAndIsNotId(SysOrgan sysOrgan);
}
