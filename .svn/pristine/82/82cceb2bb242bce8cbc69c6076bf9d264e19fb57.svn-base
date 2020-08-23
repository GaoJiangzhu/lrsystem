package cn.nstl.dao.impl;


import cn.nstl.aop.LogAOP;
import cn.nstl.common.Constant;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysOrderDao;
import cn.nstl.entity.SysOrder;
import cn.nstl.entity.SysResourceRecommend;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysOrderRepository;
import cn.nstl.repository.SysResourceLogoRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SysOrderDaoImpl extends BaseDaoImpl implements SysOrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SysResourceLogoRepository sysResourceLogoRepository;

    @Autowired
    private SysOrderRepository sysOrderRepository;

    /**
     * 查询订单
     * */
    @Override
    public List<SysOrder> orderAuditList(String status,Map<String, Object > map) throws Exception {
        String wheresql = " where resLogo.order_u_number IS NOT NULL ";
        if (status.equals("0"))
            wheresql += "and (orderInfo.order_status=0) ";
        else
            wheresql += "and (orderInfo.order_status=1) ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        //添加权限开始
        SysUser sysUser = LogAOP.getUser();
        if (!StringUtils.isBlank(sysUser.getOrganTreeLevel()))
            wheresql = wheresql + " and organ.tree_level like '"+sysUser.getOrganTreeLevel()+"%' ";
        //添加权限结束
        String sql = "SELECT " +
                "orderInfo.id id," +
                "resLogo.id res_id," +
                "resLogo.title title," +
                "resLogo.Pissn pissn," +
                "resLogo.Eissn eissn," +
                "resLogo.Pisbn pisbn," +
                "resLogo.Eisbn eisbn," +
                "resLogo.`subject` subject," +
                "resLogo.country country," +
                "resLogo.publisher publisher," +
                "orderInfo.u_order_number uOrderNumber," +
                "orderInfo.order_number orderNumber," +
                "orderInfo.create_time createTime," +
                "orderInfo.order_status orderStatus FROM `t_resource_log` resLogo" +
                " LEFT JOIN t_order_info orderInfo ON resLogo.order_u_number = orderInfo.u_order_number" +
                " LEFT JOIN sys_organ organ ON resLogo.dist_unit = organ.id"+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by orderInfo.create_time desc ";
        }
        List moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysOrder.class));
        return moduleList;
    }

    //审核操作
    @Override
    public void updOrderAuditAgree(String resIds,String orderIds, String trialOpinion) {
        String orderSql = "UPDATE " +
                " t_order_info" +
                " SET " +
                " order_status= '"+SysDefine.SysSelection.STATUS_AUDITING_REFUSE+"' ," +
                " trial_opinion = '"+trialOpinion+"'" +
                " WHERE" +
                " id in ("+getSql_Id(orderIds)+")";
        String resSql = "UPDATE" +
                " t_resource_info" +
                " SET" +
                " distribution_status= '"+SysDefine.SysSelection.STATUS_ORDER_NO+"' ," +
                " trial_opinion = '"+trialOpinion+"'" +
                " WHERE" +
                " id in ("+getSql_Id(resIds)+")";
        int update1 = jdbcTemplate.update(resSql);
        int update = jdbcTemplate.update(orderSql);
    }

    @Override
    public List getOrderList(Map<String, Object > map) {
        String wheresql = " where resLogo.order_u_number IS NOT NULL ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "SELECT " +
                "orderInfo.id id," +
                "resLogo.id res_id," +
                "resLogo.title title," +
                "resLogo.Pissn pissn," +
                "resLogo.Eissn eissn," +
                "resLogo.Pisbn pisbn," +
                "resLogo.Eisbn eisbn," +
                "resLogo.`subject` subject," +
                "param.name country," +
                "resLogo.publisher publisher," +
                "orderInfo.u_order_number uOrderNumber," +
                "orderInfo.order_number orderNumber," +
                "orderInfo.order_status orderStatus," +
                "cover.cover_name coverName " +
                "FROM `t_resource_log` resLogo " +
                "LEFT JOIN t_order_info orderInfo ON resLogo.order_u_number = orderInfo.u_order_number " +
                "LEFT JOIN sys_param param ON resLogo.country = param.`code` " +
                "LEFT JOIN t_cover_info cover ON resLogo.cover_id = cover.id"+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by orderInfo.create_time desc ";
        }
        List moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysOrder.class));
        return moduleList;
    }

    @Override
    public void order_status(String ids, String se_unit) {
        String sql = "UPDATE `t_order_info` SET `order_status`='"+se_unit+"',`order_type`=1 WHERE id in ("+getSql_Id(ids)+")";
        jdbcTemplate.update(sql);
    }

    @Override
    public int orderAuditCount(String status, Map<String, Object> map) {
        String wheresql = " where orderInfo.order_status='"+status+"' and resLogo.order_u_number IS NOT NULL ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "select count(*) from `t_resource_log` resLogo LEFT JOIN t_order_info orderInfo ON resLogo.order_u_number = orderInfo.u_order_number " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List annualOrderList(Map<String, Object > map) {
        String wheresql = " where a_start_year=a_end_year ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "select * from t_order_info join t_cover_info on  t_order_info.id=t_cover_info.id"+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by systime desc ";
        }
        List moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysResourceRecommend.class));
        return moduleList;
    }

    @Override
    public int annualOrderCount(Map<String, Object > map) {
        String wheresql = " where a_start_year=a_end_year ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "select count(*) from t_order_info " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public int findByFlowStatus(String...flowStatus) {
        String sql = "select count(*) from t_order_info where order_status = ? ";
        for (int i=0;i<flowStatus.length;i++){
            if (i>0){
                sql += " or order_status=? ";
            }
        }
        return this.jdbcTemplate.queryForObject(sql, Integer.class, flowStatus);
    }

    /**
     * 通过订单ids获取资源ids
     * */
    @Override
    public String getResIdsForOrderIds(String id ) {
        String[] ids = id.split(",");
        String sql = "SELECT" +
                " GROUP_CONCAT(res_id)" +
                " FROM" +
                " `t_order_info`" +
                " WHERE" +
                " id in ("+getSql_Id(id)+")";
        return this.jdbcTemplate.queryForObject(sql, String.class);
    }
}