package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.FundManageDao;
import cn.nstl.entity.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Wuhongjie
 * @Date: Created in 15:53 2018/8/23
 */
@Repository
public class FundManageDaoImpl extends BaseDaoImpl implements FundManageDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List cypherList(Map<String, Object > map, SysUser sysUser) {
        StringBuffer sb= new StringBuffer();
        sb.append(" SELECT so.organ_name,trl.type,SUM(toi.order_status = 3) as xd,SUM(toi.order_status = 1) as xz,SUM(toi.order_status = 2) as td,");
        sb.append(" SUM(toi.order_status = 1 OR toi.order_status = 3) as xj,count(*) as zs,SUM(should_pay) as dgj,SUM(paid) as jsj");
        sb.append(" FROM `t_order_info` AS toi LEFT JOIN t_resource_log AS trl ON toi.u_order_number = trl.order_u_number");
        sb.append(" LEFT JOIN sys_organ AS so ON toi.organization_id = so.id");
        String wheresql = " where 1=1";
        //添加权限开始
        if (StringUtils.isBlank(sysUser.getOrganTreeLevel())){
            return new ArrayList<>();
        }
        wheresql =wheresql+powerListSQL(sysUser);
        //添加权限结束
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql =  sb.toString()+wheresql+" GROUP BY toi.organization_id,trl.type";

        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by trl.create_time desc ";
        }
        List moduleList = jdbcTemplate.queryForList(sql);
        return moduleList;
    }

    @Override
    public int findCount(Map<String, Object > map,SysUser sysUser) {
        String wheresql = " where 1=1 ";
        //添加权限开始
        if (StringUtils.isBlank(sysUser.getOrganTreeLevel())){
            return 0;
        }
        wheresql =wheresql+powerListSQL(sysUser);
        //添加权限结束
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql =  " SELECT count(*) from (SELECT count(*) FROM `t_order_info` AS toi LEFT JOIN t_resource_log AS trl ON toi.u_order_number = trl.order_u_number  LEFT JOIN sys_organ AS so ON toi.organization_id = so.id "+wheresql+" GROUP BY toi.organization_id,trl.type) as t";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    public String powerListSQL(SysUser sysUser){
        String sql="";
        if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_DEPT)){
            sql =" and so.tree_level like '"+sysUser.getOrganTreeLevel()+"%' ";
        }else if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_NORMAL)){
            sql = " and tri.sysuserid= "+sysUser.getId();
        }
        return sql;
    }


}
