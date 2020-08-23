package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.dao.SysProxyCorporationDao;
import cn.nstl.entity.ProxyCorporation;
import cn.nstl.entity.SysUser;
import cn.nstl.entity.vo.SearchParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SysProxyCorporationDaoImpl implements SysProxyCorporationDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<ProxyCorporation> findAll(Map<String, Object> map, SysUser sysUser) {
        List<Object> objects = new ArrayList<>();
        StringBuffer buffer = new StringBuffer(" where 1=1 ");

        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            SearchParams params = Constant.parse2Params2(map.get("params").toString(), new ArrayList<Object>());
            buffer.append(params.getWheresql());
            objects.addAll(params.getObjects());
        }

        String sql = "select * from t_proxy_corporation"+ buffer.toString();
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+map.get("order").toString()+" ?";
            objects.add(map.get("orderBy").toString());
        }else {
            sql += " order by create_time desc ";
        }
        sql += " limit ?, ?";
        objects.add(Integer.valueOf(map.get("start").toString()));
        objects.add(Integer.valueOf(map.get("length").toString()));
        List<ProxyCorporation> corporationList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ProxyCorporation.class), objects.toArray());
        return corporationList;
    }

    @Override
    public int countAll(Map<String, Object> map, SysUser sysUser) {
        List<Object> objects = new ArrayList<>();
        StringBuffer buffer = new StringBuffer(" where 1=1 ");
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            SearchParams params = Constant.parse2Params2(map.get("params").toString(), new ArrayList<Object>());
            buffer.append(params.getWheresql());
            objects.addAll(params.getObjects());
        }
        String sql = "select count(*) from t_proxy_corporation " + buffer.toString();
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, objects.toArray());
        return count;
    }

    @Override
    public int update(ProxyCorporation corporation) {
        String sql = "update t_proxy_corporation set proxy_cor_code=?, proxy_cor_name=?, update_by=?, update_time=? where id=?";
        int update = this.jdbcTemplate.update(sql, new Object[]{corporation.getProxyCorCode(), corporation.getProxyCorName(), corporation.getUpdateBy(), corporation.getUpdateTime(), corporation.getId()});

        return update;

    }
}
