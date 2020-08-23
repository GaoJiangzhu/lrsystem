package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.dao.SysLogDao;
import cn.nstl.entity.SysLog;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class SysLogDaoImpl extends BaseDaoImpl implements SysLogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<SysLog> findAll(Map<String, Object > map) {
        String wheresql = " where 1=1 ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "select * from sys_logs " + wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by date desc ";
        }
        List<SysLog> logList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysLog.class));
        return logList;
    }

    @Override
    public int countAll(Map<String, Object > map) {
        String wheresql = "  where 1=1 ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "select count(*) from sys_logs " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }
}
