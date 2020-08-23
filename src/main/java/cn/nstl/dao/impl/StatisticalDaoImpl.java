package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.StatisticalDao;
import cn.nstl.entity.Subscriber;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/8/22
 */
@Repository
public class StatisticalDaoImpl extends BaseDaoImpl implements StatisticalDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 获取单位订购集合
     */
    @Override
    public List<Subscriber> getSubscriberList(Map<String, Object> map) {
        String wheresql = " where 1=1 ";
        if (map.get("params") != null) {
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "SELECT " +
                "  roderInfo.organization_id organId ," +
                "  organ.organ_name organName ," +
                "  COUNT(*) orderSum," +
                "  GROUP_CONCAT(resLog.type) resType," +
                "  GROUP_CONCAT(roderInfo.u_order_number) orderId" +
                "  FROM" +
                "  t_resource_log resLog" +
                "  LEFT JOIN t_order_info roderInfo ON resLog.order_u_number = roderInfo.u_order_number" +
                "  LEFT JOIN sys_organ organ ON roderInfo.organization_id = organ.id" + wheresql + " GROUP BY organization_id ";
        if (map.get("order") != null && map.get("orderBy") != null) {
            sql = sql + " order by " + map.get("order").toString() + " " + map.get("orderBy").toString();
        } else {
            sql += " order by organ.organ_name desc ";
        }

        List<Subscriber> subscriberList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(Subscriber.class));
        for (Subscriber subscriber : subscriberList) {
            String orderId = subscriber.getOrderId();
            subscriber.setRenewSum(getSubSumForOrderId(SysDefine.SysOrder.STATUS_ORDER_GOON, orderId));
            subscriber.setNewSum(getSubSumForOrderId(SysDefine.SysOrder.STATUS_ORDER_YES, orderId));
            subscriber.setStopSum(getSubSumForOrderId(SysDefine.SysOrder.STATUS_ORDER_PAUSE, orderId));
        }
        return subscriberList;
    }

    /**
     * 获取单位统计数据
     */
    private String getSubSumForOrderId(String statusOrderGoon, String orderId) {
        if (StringUtils.isEmpty(orderId))
            return "0";
        String sql = "SELECT " +
                " COUNT(*) " +
                " FROM " +
                " t_order_info " +
                " WHERE " +
                " order_status = " + statusOrderGoon + " " +
                " AND u_order_number IN ( " + getSql_Id(orderId) + " )";
        /*String sql = "SELECT " +
                " COUNT(*) " +
                " FROM " +
                " t_order_info " +
                " WHERE " +
                " order_status = ? " +
                " AND u_order_number IN ( ? )";*/
        Object[] pram = new Object[]{statusOrderGoon, getSql_Id(orderId)};
        System.out.println(sql);
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer.toString();
    }

    /**
     * 获取单位订购总数
     */
    @Override
    public int getSubscriberSum(Map<String, Object> map) {
        String wheresql = " where 1=1 ";
        if (map.get("params") != null) {
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "SELECT COUNT(*) FROM (SELECT  count(*) FROM" +
                "  t_resource_log resLog" +
                "  LEFT JOIN t_order_info roderInfo ON resLog.order_u_number = roderInfo.u_order_number" +
                "  LEFT JOIN sys_organ organ ON roderInfo.organization_id = organ.id" + wheresql + " GROUP BY organization_id ) sum";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * 获取资源数量
     * */
    @Override
    public int getResSum() {
        String sql = "SELECT " +
                "COUNT(*) count " +
                "FROM " +
                "`t_resource_log` " +
                "WHERE " +
                "distribution_status = 3 AND DATE_FORMAT(sys_time,'%Y') = DATE_FORMAT(CURDATE(),'%Y')";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * 获取每月资源数量
     * */
    @Override
    public Map<String, String> getResMSum() {
        String sql = "SELECT " +
                "DATE_FORMAT(sys_time,'%m') month, COUNT(*) count " +
                "FROM `t_resource_log` " +
                "WHERE " +
                "distribution_status = 3 AND DATE_FORMAT(sys_time,'%Y') = DATE_FORMAT(CURDATE(),'%Y') " +
                "GROUP BY DATE_FORMAT(sys_time,'%m')";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        Map<String , String > dataMap = getListToMap(maps);
        return dataMap;
    }

    /**
     * 获取荐购总数
     * */
    @Override
    public int getRecSum() {
        String sql = "SELECT " +
                "COUNT(*) count " +
                "FROM " +
                "`t_resource_log` " +
                "WHERE " +
                "distribution_status = 1 AND DATE_FORMAT(sys_time,'%Y') = DATE_FORMAT(CURDATE(),'%Y')";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Map<String, String> getRecMSum() {
        String sql = "SELECT " +
                "DATE_FORMAT(sys_time,'%m') month, COUNT(*) count " +
                "FROM `t_resource_log` " +
                "WHERE " +
                "distribution_status = 1 AND DATE_FORMAT(sys_time,'%Y') = DATE_FORMAT(CURDATE(),'%Y') " +
                "GROUP BY DATE_FORMAT(sys_time,'%m')";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        Map<String , String > dataMap = getListToMap(maps);
        return dataMap;
    }

    /**
     * 订单总数
     * */
    @Override
    public int getOrderSum() {
        String sql = "SELECT " +
                "COUNT(*) count " +
                "FROM `t_order_info` " +
                "WHERE " +
                "DATE_FORMAT(create_time,'%Y') = DATE_FORMAT(CURDATE(),'%Y') AND order_status = 1";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * 订单每月总数
     * */
    @Override
    public Map<String, String> getOrderMSum() {
        String sql = "SELECT" +
                " DATE_FORMAT(create_time,'%m') month, COUNT(*) count" +
                " FROM `t_order_info` " +
                " WHERE " +
                " DATE_FORMAT(create_time,'%Y') = DATE_FORMAT(CURDATE(),'%Y') AND order_status = 1 " +
                " GROUP BY DATE_FORMAT(create_time,'%m')";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        Map<String , String > dataMap = getListToMap(maps);
        return dataMap;
    }

    /**
     * 订单金额
     * */
    @Override
    public int getOrderMoney() {
        String sql = "SELECT " +
                "COUNT(should_pay) money " +
                "FROM `t_order_info` " +
                "WHERE " +
                "DATE_FORMAT(create_time,'%Y') = DATE_FORMAT(CURDATE(),'%Y') AND order_status = 1";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * 订单每月金额
     * */
    @Override
    public Map<String, String> getOrderMMoney() {
        String sql = "SELECT" +
                " DATE_FORMAT(create_time,'%m') month, COUNT(should_pay) count" +
                " FROM `t_order_info` " +
                " WHERE " +
                " DATE_FORMAT(create_time,'%Y') = DATE_FORMAT(CURDATE(),'%Y') AND order_status = 1 " +
                " GROUP BY DATE_FORMAT(create_time,'%m')";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        Map<String , String > dataMap = getListToMap(maps);
        return dataMap;
    }

    private Map<String, String> getListToMap(List<Map<String, Object>> maps) {
        Map<String , String > dataMap = new HashMap<>();
        for (Map map : maps) {
            if (map.get("month")!=null && map.get("count") != null)
            dataMap.put(map.get("month").toString(), map.get("count").toString());
        }
        return dataMap;
    }


}
