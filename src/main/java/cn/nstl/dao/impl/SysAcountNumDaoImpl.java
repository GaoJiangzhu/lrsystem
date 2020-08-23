package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.dao.SysAcountNumDao;
import cn.nstl.entity.AcountNum;
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
public class SysAcountNumDaoImpl implements SysAcountNumDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<AcountNum> findAll(Map<String, Object> map, SysUser sysUser) {
        List<Object> objects = new ArrayList<>();
        StringBuffer buffer = new StringBuffer(" where 1=1 ");

        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            SearchParams params = Constant.parse2Params2(map.get("params").toString(), new ArrayList<Object>());
            buffer.append(params.getWheresql());
            objects.addAll(params.getObjects());
        }

        String sql = "select t_acount_num.*,sys_organ.organ_name as organName,t_proxy_corporation.proxy_cor_name as proxyCorName " +
                " from t_acount_num " +
                " left join t_proxy_corporation on t_acount_num.proxy_cor_id = t_proxy_corporation.id " +
                " left join sys_organ on t_acount_num.organ_id = sys_organ.id "+ buffer.toString();
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+map.get("order").toString()+" ?";
            objects.add(map.get("orderBy").toString());
        }else {
            sql += " order by create_time desc ";
        }
        sql += " limit ?, ?";
        objects.add(Integer.valueOf(map.get("start").toString()));
        objects.add(Integer.valueOf(map.get("length").toString()));
        List<AcountNum> acountNumList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AcountNum.class), objects.toArray());
        return acountNumList;
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
        String sql = "select count(*) from t_acount_num " + buffer.toString();
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, objects.toArray());
        return count;
    }

    @Override
    public int update(AcountNum acountNum) {
        String sql = "update t_acount_num set acount_num=?, organ_id=?, proxy_cor_id=?, mark=?, update_by=?, update_time=? where id=?";
        return this.jdbcTemplate.update(sql, new Object[]{acountNum.getAcountNum(), acountNum.getOrganId(), acountNum.getProxyCorId(),acountNum.getMark(),acountNum.getUpdateBy(),acountNum.getUpdateTime(), acountNum.getId()});
    }
}
