package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SelectionDao;
import cn.nstl.entity.SysOrder;
import cn.nstl.entity.SysResourceInfo;
import cn.nstl.entity.SysResourceLog;
import cn.nstl.repository.SysOrderRepository;
import cn.nstl.repository.SysResourceLogoRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/27
 */
@Repository
public class SelectionDaoImpl extends BaseDaoImpl implements SelectionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SysResourceLogoRepository sysResourceLogoRepository;

    @Autowired
    private SysOrderRepository sysOrderRepository;

    @Override
    public List getSelection(String status, Map<String, Object> map) {
        String wheresql = " where 1=1 ";
        if (status.equals("1"))
            wheresql += "and (distribution_status = "+SysDefine.SysSelection.STATUS_DISTRIBUTE_NO+" or distribution_status = "+SysDefine.SysSelection.STATUS_AUDITING_REFUSE+") ";
        else if (status.equals("2"))
            wheresql += "and (distribution_status = "+SysDefine.SysSelection.STATUS_DISTRIBUTE_YES+" or distribution_status = "+SysDefine.SysSelection.STATUS_ORDER_NO+") ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "select * from t_resource_info "+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by systime desc ";
        }
        List<SysResourceInfo> moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysResourceInfo.class));
        for (SysResourceInfo sysResourceInfo : moduleList){
            sysResourceInfo = sysResourceInfoJointInv(sysResourceInfo);
        }
        return moduleList;
    }

    private SysResourceInfo sysResourceInfoJointInv(SysResourceInfo sysResourceInfo) {
        sysResourceInfo.setCountry(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfo.getCountry())));
        sysResourceInfo.setCarrier(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfo.getCarrier())));
        sysResourceInfo.setLanguage(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfo.getLanguage())));
        return sysResourceInfo;
    }

    @Override
    public int getSelectionSum(String status, Map<String, Object> map) {
        String wheresql = "  where 1=1 ";
        if (status.equals("1"))
            wheresql += "and (distribution_status = "+SysDefine.SysSelection.STATUS_DISTRIBUTE_NO+" or distribution_status = "+SysDefine.SysSelection.STATUS_AUDITING_REFUSE+") ";
        else if (status.equals("2"))
            wheresql += "and (distribution_status = "+SysDefine.SysSelection.STATUS_DISTRIBUTE_YES+" or distribution_status = "+SysDefine.SysSelection.STATUS_ORDER_NO+") ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "select count(*) from t_resource_info " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

//    荐购遴选分配单位
    @Override
    public Response<String> dist_unit(String ids, String sel_unit) {
        String sql = "UPDATE `t_resource_info` SET `dist_unit`='"+sel_unit+"',`distribution_status`="+SysDefine.SysSelection.STATUS_DISTRIBUTE_YES+" WHERE id in ("+getSql_Id(ids)+")";
        int update = jdbcTemplate.update(sql);
        if (update > 0)
            return Response.createBySuccess("操作成功");
        else
            return Response.createByErrorMessage("操作失败");
    }

    @Override
    public List<SysResourceLog> getSelectionIds(String ids) {
        String sql = "select * from t_resource_info where id in ("+getSql_Id(ids)+") ";
        List<SysResourceLog> moduleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysResourceLog.class));
        return moduleList;
    }

//    执行资源log与订单order绑定和资源info状态修改
    @Override
    public void generateOrders(SysOrder sysOrder, SysResourceLog sysResourceLog , String[] data) {
        if (!sysResourceLog.getDistributionStatus().equals("5")){
            sysOrderRepository.save(sysOrder);
            sysResourceLogoRepository.save(sysResourceLog);
        }else {
            String order_u_number = this.jdbcTemplate.queryForObject("SELECT order_u_number FROM `t_resource_log` WHERE id = ?", String.class, sysResourceLog.getId());

            String sql = "UPDATE " +
                    " t_order_info" +
                    " SET" +
                    " order_status ='"+sysOrder.getOrderStatus()+"'" +
                    " WHERE" +
                    " (u_order_number=?)";
            this.jdbcTemplate.update(sql, order_u_number);
        }
        String sql = "UPDATE " +
                " `t_resource_info`" +
                " SET" +
                " `order_status` = ? ," +
                " `distribution_status` = ? " +
                " WHERE" +
                " id = ? ";
        jdbcTemplate.update(sql,data);
    }

    @Override
    public void assignAgree(String ids,String trialOpinion) {
        String sql = "UPDATE `t_resource_info` SET `distribution_status`= "+SysDefine.SysSelection.STATUS_AUDITING_REFUSE+" ,`trial_opinion`='"+trialOpinion+"' WHERE `id`="+getSql_Id(ids);
        jdbcTemplate.update(sql);
    }

    @Override
    public SysResourceInfo getResourceDetails(String id) {
        String sql = "select * from t_resource_info where id = '"+id+"'";
        List<SysResourceInfo> dataList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysResourceInfo.class));
        if (dataList.size() == 0)
            return null;
        return sysResourceInfoJointInv(dataList.get(0));
    }

    @Override
    public int findByDistributionStatus(String...distributeStatus) {
        String sql = "select count(*) from t_resource_info where distribution_status=? ";
        for (int i=0;i<distributeStatus.length;i++){
            if (i>0){
                sql += " or distribution_status=? ";
            }
        }
        return this.jdbcTemplate.queryForObject(sql, Integer.class, distributeStatus);
    }

    @Override
    public String getOrderUnmber(int j) {
        String sql = "SELECT MAX(u_order_number) max FROM `t_order_info`";
        String s = this.jdbcTemplate.queryForObject(sql, String.class);
        if (StringUtils.isEmpty(s))
            s = "J000000000";
        Integer number = Integer.valueOf(s.substring(1,s.length()))+j;
        String orderNumber = "J";
        for (int i = number.toString().length(); i < 9 ; i++){
            orderNumber += "0";
        }
        return orderNumber+number;
    }
}
