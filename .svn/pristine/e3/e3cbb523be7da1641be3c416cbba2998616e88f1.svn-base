package cn.nstl.dao.impl;

import cn.nstl.dao.SysNotifyDao;
import cn.nstl.entity.SysNotify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysNotifyDaoImpl implements SysNotifyDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<SysNotify> findByUserId(String userId) {
        String sql = "select * from sys_notify where user_id=?";
        return this.jdbcTemplate.query(sql,  new BeanPropertyRowMapper<>(SysNotify.class), userId);
    }

    @Override
    public void deleteAll() {
        String sql = "delete from sys_notify ";
        jdbcTemplate.update(sql);
    }
}
