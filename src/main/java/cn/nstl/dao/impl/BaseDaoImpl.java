package cn.nstl.dao.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BaseDaoImpl {


    public String appendLimit(String sql, Map<String, Object> map){
        return sql + " limit " + Integer.valueOf(map.get("start").toString()) + "," +Integer.valueOf(map.get("length").toString());
    }


    public String getParamCodeFormName(JdbcTemplate jdbcTemplate , String code){
        if (StringUtils.isEmpty(code))
            return "";
        String sql = "SELECT GROUP_CONCAT(name) FROM `sys_param` WHERE `id` in ("+code+")";
        String data = jdbcTemplate.queryForObject(sql, String.class);
        return data;
    }

    public String getSql_Id(String ids){
        if (StringUtils.isEmpty(ids))
            return "";
        String  sql_id = "";
        String[] split = ids.split(",");
        for (String id : split){
            sql_id += "'"+id+"',";
        }
        return sql_id.substring(0,sql_id.length()-1 );
    }
}
