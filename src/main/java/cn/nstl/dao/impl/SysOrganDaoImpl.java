package cn.nstl.dao.impl;

import cn.nstl.dao.SysOrganDao;
import cn.nstl.entity.SysOrgan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysOrganDaoImpl implements SysOrganDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateNameAndCodeById(SysOrgan sysOrgan) {
        String sql = "update sys_organ set organ_name=?,organ_code=? where id=?";
        jdbcTemplate.update(sql, new Object[]{sysOrgan.getName(), sysOrgan.getCode(), sysOrgan.getId()});
    }

    @Override
    public List<SysOrgan> findByNameOrCodeAndIsNotId(SysOrgan sysOrgan) {
        String sql = "select * from sys_organ where id!=? and (organ_name=? or organ_code=?)";
        return jdbcTemplate.queryForList(sql,new Object[] {sysOrgan.getId(),sysOrgan.getName(), sysOrgan.getCode()}, SysOrgan.class);
    }

}
