package cn.nstl.dao;

import cn.nstl.entity.SysCover;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysCoverInfoDao {
    List<SysCover> findAll(Map<String, Object> map, SysUser sysUser);

    int countAll(Map<String, Object> map, SysUser sysUser);

    void insertCoverParam(String coverId, String languageId);

    void deleteCoverParam(String coverId);

    List<SysCover> findList();
}
