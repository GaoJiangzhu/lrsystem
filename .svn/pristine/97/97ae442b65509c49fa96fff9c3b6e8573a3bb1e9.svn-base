package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.dao.SysDataMaintainDao;
import cn.nstl.entity.*;
import cn.nstl.repository.SysResourceInfoRecordRepository;
import cn.nstl.repository.SysResourceInfoRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wuhongjie
 * @Date: Created in 14:50 2018/8/8
 */
@Repository
public class SysDataMaintainDaoImol extends BaseDaoImpl implements SysDataMaintainDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private SysResourceInfoRecordRepository sysResourceInfoRepository;
    @Override
    public List findSubscribeList(Map<String, Object> map, SysUser sysUser) {
        String wheresql = " where order_status in (1,3) ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = " SELECT toi.id,trl.title,toi.u_order_number,trl.Pissn AS pissn,trl.Pisbn AS pisbn,trl.Eissn AS eissn,trl.Eisbn AS eisbn,so.organ_name AS organName, " +
                "toi.order_year,toi.order_status,sp.name as order_type,sp1.`name` as order_pattern FROM " +
                "t_order_info AS toi LEFT JOIN sys_organ AS so ON toi.organization_id = so.id LEFT JOIN t_resource_log AS trl ON toi.u_order_number = trl.order_u_number LEFT JOIN sys_param AS sp ON toi.order_type = sp.`code` LEFT JOIN sys_param AS sp1 ON toi.order_pattern = sp1.`code` "+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by toi.create_time desc ,toi.systime desc";
        }
        List moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysOrder.class));
        return moduleList;
    }

    @Override
    public int findSubscribeCount(Map<String, Object> map, SysUser sysUser) {
        String wheresql = " where order_status in (1,3) ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "SELECT count(*) FROM t_order_info AS toi " +
                "LEFT JOIN t_resource_log AS trl ON toi.u_order_number = trl.order_u_number " +
                "LEFT JOIN sys_organ AS so ON toi.organization_id=so.id " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public SysOrder findOrderInfo(String uOrderNumber){
        SysOrder sysOrder = new SysOrder();
        StringBuffer sb =new StringBuffer();
        sb.append(" SELECT tt.id,tt.u_order_number,tt.order_number,sp.`name` AS carrier,so.organ_name AS organization_id,tt.order_year,tt.c_start_year,tt.c_end_year,tt.order_status,");
        sb.append(" sp1.`name` AS order_type,sp2.`name` AS order_pattern,sp3.`name` AS opening_range,tt.a_start_year,tt.a_end_year,sp4.`name`,tt.has_metadata,tt.arrival_status,");
        sb.append(" tt.is_ordered,tt.auditing_year,tt.fund_source,tt.budget,tt.should_pay,tt.paid,tt.not_pay,tt.cny_total,tt.order_pay,tt.subsidy,sp5.`name` as fund_type,sp6.`name` as currency");
        sb.append(" FROM t_order_info AS tt");
        sb.append(" LEFT JOIN sys_param AS sp ON tt.carrier = sp.`code`");
        sb.append(" LEFT JOIN sys_organ AS so ON tt.organization_id = so.id");
        sb.append(" LEFT JOIN sys_param AS sp1 ON tt.order_type = sp1. `code`");
        sb.append(" LEFT JOIN sys_param AS sp2 ON tt.order_pattern = sp2. `code`");
        sb.append(" LEFT JOIN sys_param AS sp3 ON tt.opening_range = sp3. `code`");
        sb.append(" LEFT JOIN sys_param AS sp4 ON tt.reason = sp4. `code`");
        sb.append(" LEFT JOIN sys_param AS sp5 ON tt.fund_type = sp5.`code`");
        sb.append(" LEFT JOIN sys_param AS sp6 ON tt.currency = sp6.`code`WHERE tt.u_order_number= '"+uOrderNumber+"'");
        List<SysOrder> sysOrderList=jdbcTemplate.query(sb.toString(), new BeanPropertyRowMapper(SysOrder.class));
        if(sysOrderList.size()!=0) {
            sysOrder = sysOrderList.get(0);
        }
        return sysOrder;
    }

    @Override
    public SysResourceLog findResourceInfo(String uOrderNumber){
        SysResourceLog sysResourceLog = new SysResourceLog();
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT tri.id,tri.recommend_id,tri.title,tri.other_title,tri.series_number,tri.series_title,tri.author,tri.Pissn,tri.Pisbn,tri.eissn,tri.eisbn,tci.cover_name as cover_id,tri.kind_id,");
        sb.append("tri.coiling_period,sp.`name` AS subject,tri.publisher,sp1.`name` AS country,tri.pub_year,tri.founded_year,tri.`language`,sp2.`name` AS pub_feq,tri.Intro,tri.classi_number,tri.url,");
        sb.append("sp3.`name` AS carrier,tri.type,tri.pub_pattern,sp4.`name` AS pub_status,tri.systime,tri.sysuserid,tri.sysusername,tri.create_id,tri.create_time,tri.dist_unit,");
        sb.append("tri.flow_one_systime,tri.flow_one_userid,tri.flow_one_username,tri.flow_status,tri.flow_two_systime,tri.flow_two_userid,tri.flow_two_username");
        sb.append(" FROM t_resource_log AS tri");
        sb.append(" LEFT JOIN sys_param AS sp ON tri.`subject` = sp.`code`");
        sb.append(" LEFT JOIN sys_param AS sp1 ON tri.`country` = sp1.`code`");
        sb.append(" LEFT JOIN sys_param AS sp2 ON tri.`pub_feq` = sp2.`code`");
        sb.append(" LEFT JOIN sys_param AS sp3 ON tri.`carrier` = sp3.`code`");
        sb.append(" LEFT JOIN sys_param AS sp4 ON tri.`pub_status` = sp4.`code`");
        sb.append(" LEFT JOIN t_cover_info AS tci ON tci.id = tri.cover_id");
        sb.append(" WHERE tri.order_u_number = '"+uOrderNumber+"' ");
        List<SysResourceLog> sysResourceLogList =jdbcTemplate.query(sb.toString(), new BeanPropertyRowMapper(SysResourceLog.class));
        if(sysResourceLogList.size()!=0) {
            sysResourceLog = sysResourceLogList.get(0);
        }
        String lan="'"+ sysResourceLog.getLanguage().replace(",","','")+"'";
        String language="";
        if(StringUtils.isNotBlank(sysResourceLog.getLanguage())) {
            List<SysParam>  languageList=jdbcTemplate.query("select * from sys_param where code in ("+lan+")", new BeanPropertyRowMapper(SysParam.class));
            if(languageList.size()!=0){
                for(int i=0;i<languageList.size();i++){
                    language+=languageList.get(i).getName()+",";
                }
            }
        }
        language=language.substring(0,language.length()-1);
        sysResourceLog.setLanguage(language);
        return sysResourceLog;
    }

    @Override
    public SysOrder getOrderInfo(String id){
        SysOrder sysOrder = new SysOrder();
        StringBuffer sb =new StringBuffer();
        sb.append(" SELECT tt.id,tt.u_order_number,tt.order_number,sp.`name` AS carrier,so.organ_name AS organization_id,tt.order_year,tt.c_start_year,tt.c_end_year,tt.order_status,");
        sb.append(" sp1.`name` AS order_type,sp2.`name` AS order_pattern,sp3.`name` AS opening_range,tt.a_start_year,tt.a_end_year,sp4.`name`,tt.has_metadata,tt.arrival_status,");
        sb.append(" tt.is_ordered,tt.auditing_year,tt.fund_source,tt.budget,tt.should_pay,tt.paid,tt.not_pay,tt.cny_total,tt.order_pay,tt.subsidy,sp5.`name` as fund_type,sp6.`name` as currency");
        sb.append(" FROM t_order_info AS tt");
        sb.append(" LEFT JOIN sys_param AS sp ON tt.carrier = sp.`code`");
        sb.append(" LEFT JOIN sys_organ AS so ON tt.organization_id = so.id");
        sb.append(" LEFT JOIN sys_param AS sp1 ON tt.order_type = sp1. `code`");
        sb.append(" LEFT JOIN sys_param AS sp2 ON tt.order_pattern = sp2. `code`");
        sb.append(" LEFT JOIN sys_param AS sp3 ON tt.opening_range = sp3. `code`");
        sb.append(" LEFT JOIN sys_param AS sp4 ON tt.reason = sp4. `code`");
        sb.append(" LEFT JOIN sys_param AS sp5 ON tt.fund_type = sp5.`code`");
        sb.append(" LEFT JOIN sys_param AS sp6 ON tt.currency = sp6.`code`WHERE tt.id = '"+id+"' ");
        List<SysOrder> sysOrderList=jdbcTemplate.query(sb.toString(), new BeanPropertyRowMapper(SysOrder.class));
        if(sysOrderList.size()!=0) {
            sysOrder = sysOrderList.get(0);
        }
        return sysOrder;
    }

    @Override
    public List getResourcesList(Map<String, Object> map, SysUser sysUser) {
        String wheresql = " where review_status = 0 ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "SELECT * FROM t_resource_info" + wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by systime desc ";
        }
        List moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysResourceInfo.class));
        return moduleList;
    }

    @Override
    public int getResourcesCount(Map<String, Object> map, SysUser sysUser) {
        String wheresql = " where review_status = 0 ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "SELECT count(*) FROM t_resource_info" + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public SysResourceInfo getResources(String id) {
        String sql = "SELECT * FROM t_resource_info where id = '"+id+"'";
        List<SysResourceInfo> moduleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysResourceInfo.class));
        if (moduleList.size() > 0)
        return moduleList.get(0);
        return null;
    }


    @Override
    public int updResourceInfo(SysResourceInfo sysResourceInfo) {
        return sysResourceInfo.update(jdbcTemplate);
    }

    @Override
    public int updateOrderInfo(SysOrder sysOrder) {
       return  sysOrder.update(jdbcTemplate);
    }

    /*
    * 判断资源是否存在记录表
    * */
    @Override
    public SysResourceInfoRecord resProveExistence(String[] strings) {
        String sql = "SELECT" +
                " *" +
                " FROM" +
                " t_resource_info_record" +
                " WHERE" +
                " id = '"+strings[1]+"'" +
                " AND systime = '"+strings[0]+"'";
        List<SysResourceInfoRecord> moduleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysResourceInfoRecord.class));
        if (moduleList.size() > 0)
            return moduleList.get(0);
        return null;
    }

    @Override
    public void resProverSave(SysResourceInfoRecord sysResourceInfoRecord) {
        sysResourceInfoRepository.save(sysResourceInfoRecord);
    }

    @Override
    public SysResourceInfoRecord getResToProve(String id) {
        String sql = "SELECT * FROM t_resource_info where id = '"+id+"'";
        List<SysResourceInfoRecord> moduleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysResourceInfoRecord.class));
        return moduleList.get(0);
    }

    @Override
    public List getResReviewList(Map<String, Object> map, SysUser sysUser) {
        String wheresql = " where review_status = 1";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "SELECT * FROM t_resource_info" + wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " order by systime desc ";
        }
        List moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysResourceInfo.class));
        return moduleList;
    }

    @Override
    public int getResReviewCount(Map<String, Object> map, SysUser sysUser) {
        String wheresql = " where  review_status = 1 ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }
        String sql = "SELECT count(*) FROM t_resource_info" + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    /**
     * 资源修改审批通过
     * */
    @Override
    public Integer agreeReview(String statusReviewYes, String ids) {
        String[] resIds = ids.split(",");
        int i = 0;
        for (String resId : resIds) {
            String selectSql = "SELECT * FROM `t_resource_info_record` WHERE info_id = '"+resId+"' ORDER BY systime DESC";
            List<SysResourceInfo> sysResourceInfos = jdbcTemplate.query(selectSql , new BeanPropertyRowMapper<>(SysResourceInfo.class));
            SysResourceInfo sysResourceInfo = null;
            if (sysResourceInfos.size()>0){
                sysResourceInfo = sysResourceInfos.get(0);
                sysResourceInfo.setReviewStatus(statusReviewYes);
                Map<String, Object> updSql = sysResourceInfo.getUpdSql();
                int update = jdbcTemplate.update(updSql.get("sql").toString(), (String[])updSql.get("data"));
                ++i;
            }
        }
        if (i == resIds.length)
            return 1;
        return 0;
    }

    /***
     * 资源修改审批驳回
     */
    @Override
    public Integer refusalReview(String statusReviewNo, String ids) {
        String sql = "UPDATE `t_resource_info` SET `review_status`='"+statusReviewNo+"' WHERE `id` in ("+getSql_Id(ids)+")";
        return jdbcTemplate.update(sql);
    }

    /**
     * 资源修改信息
     * */
    @Override
    public SysResourceInfoRecord getResUpd(String id) {
        String selectSql = "SELECT * FROM `t_resource_info_record` WHERE info_id = '"+id+"' ORDER BY systime DESC";
        List<SysResourceInfoRecord> sysResourceInfoRecords = jdbcTemplate.query(selectSql , new BeanPropertyRowMapper<>(SysResourceInfoRecord.class));
        if (sysResourceInfoRecords.size()>0)
            return sysResourceInfoRecordJointInv(sysResourceInfoRecords.get(0));
        return null;
    }

    @Override
    public SysResourceInfo getRes(String id) {
        return sysResourceLogoJointInv(getResources(id));
    }


    private SysResourceInfo sysResourceLogoJointInv(SysResourceInfo sysResourceInfo) {
        sysResourceInfo.setCountry(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfo.getCountry())));
        sysResourceInfo.setCarrier(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfo.getCarrier())));
        sysResourceInfo.setLanguage(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfo.getLanguage())));
        sysResourceInfo.setSubject(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfo.getSubject())));
        sysResourceInfo.setPubPattern(getParamCodeFormName(jdbcTemplate, getSql_Id(sysResourceInfo.getPubPattern())));
        sysResourceInfo.setPubStatus(getParamCodeFormName(jdbcTemplate, getSql_Id(sysResourceInfo.getPubStatus())));
        return sysResourceInfo;
    }
    private SysResourceInfoRecord sysResourceInfoRecordJointInv(SysResourceInfoRecord sysResourceInfoRecord) {
        sysResourceInfoRecord.setCountry(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfoRecord.getCountry())));
        sysResourceInfoRecord.setCarrier(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfoRecord.getCarrier())));
        sysResourceInfoRecord.setLanguage(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfoRecord.getLanguage())));
        sysResourceInfoRecord.setSubject(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfoRecord.getSubject())));
        sysResourceInfoRecord.setPubPattern(getParamCodeFormName(jdbcTemplate,getSql_Id(sysResourceInfoRecord.getPubPattern())));
        sysResourceInfoRecord.setPubStatus(getParamCodeFormName(jdbcTemplate, getSql_Id(sysResourceInfoRecord.getPubStatus())));
        return sysResourceInfoRecord;
    }
}
