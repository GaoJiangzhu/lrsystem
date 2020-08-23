package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysResourceRecommendDao;
import cn.nstl.entity.*;
import cn.nstl.utils.DateUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SysResourceRecommendDaoImpl extends BaseDaoImpl implements SysResourceRecommendDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List findList(Map<String, Object > map,SysUser sysUser) {
        String wheresql = " where 1=1 ";
//        //添加权限开始
//        if (StringUtils.isBlank(sysUser.getOrganTreeLevel())){
//            return new ArrayList<>();
//        }
//       wheresql =wheresql+powerListSQL(sysUser);
//        //添加权限结束
        if (map.get("params")!=null){
            JSONArray param = JSON.parseArray(map.get("params").toString());
            //判断是不是我的荐购
            if(param.contains("-sysuser.userid-")){
               param.remove("-sysuser.userid-");
               wheresql+=" and tri.sysuserid='"+sysUser.getId()+"'";
            }else{
                wheresql+=" and tri.flow_status!="+SysDefine.SysResourceRecommend.FLOW_STATUS_WCJSH;
            }
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            if(param.size()!=0) {
                wheresql = wheresql + Constant.parse2Params(param.toJSONString());
            }
        }else{
            wheresql+=" and tri.flow_status!="+SysDefine.SysResourceRecommend.FLOW_STATUS_WCJSH;
        }
        String sql = " select tri.*,so.organ_name from t_recommend_info as tri left join sys_organ as so ON tri.organization_id=so.id "+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " ORDER BY systime DESC ,flow_one_systime DESC,flow_two_systime DESC ";
        }
        List moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysResourceRecommend.class));
        return moduleList;
    }

    @Override
    public int findCount(Map<String, Object > map,SysUser sysUser) {
        String wheresql = " where 1=1 ";
//        //添加权限开始
//        if (StringUtils.isBlank(sysUser.getOrganTreeLevel())){
//            return 0;
//        }
//         wheresql =wheresql+powerListSQL(sysUser);
//        //添加权限结束
        if (map.get("params")!=null){
            JSONArray param = JSON.parseArray(map.get("params").toString());
            //判断是不是我的荐购
            if(param.contains("-sysuser.userid-")){
                param.remove("-sysuser.userid-");
                wheresql+=" and tri.sysuserid='"+sysUser.getId()+"'";
            }else{
                wheresql+=" and tri.flow_status!="+SysDefine.SysResourceRecommend.FLOW_STATUS_WCJSH;
            }
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            if(param.size()!=0) {
                wheresql = wheresql + Constant.parse2Params(param.toJSONString());
            }
        }else{
            wheresql+=" and tri.flow_status!="+SysDefine.SysResourceRecommend.FLOW_STATUS_WCJSH;
        }
        String sql = "select count(*) from t_recommend_info as tri left join sys_organ as so ON tri.organization_id=so.id " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<SysResourceRecommend> fristTrialList(Map<String, Object > map,SysUser sysUser) {

        String wheresql = " where flow_status in ("+SysDefine.SysResourceRecommend.FLOW_STATUS_DSH+","+SysDefine.SysResourceRecommend.FLOW_STATUS_CSWTG+")";
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
        String sql = "select tri.*,so.organ_name from t_recommend_info as tri left join sys_organ as so ON tri.organization_id=so.id "+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " ORDER BY systime DESC ,flow_one_systime DESC ";
        }
        List moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysResourceRecommend.class));
        return moduleList;
    }

    @Override
    public int fristTrialCount(Map<String, Object > map,SysUser sysUser) {
        String wheresql = " where flow_status in ("+SysDefine.SysResourceRecommend.FLOW_STATUS_DSH+","+SysDefine.SysResourceRecommend.FLOW_STATUS_CSWTG+")";
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
        String sql = "select count(*) from t_recommend_info as tri left join sys_organ as so ON tri.organization_id=so.id " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<SysResourceRecommend> secondTrialList(Map<String, Object > map,SysUser sysUser) {
        String wheresql = " where flow_status in ("+SysDefine.SysResourceRecommend.FLOW_STATUS_CSTG+","+SysDefine.SysResourceRecommend.FLOW_STATUS_FSWTG+") ";
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
        String sql = "select tri.*,so.organ_name from t_recommend_info as tri left join sys_organ as so ON tri.organization_id=so.id "+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString() + " "+ map.get("orderBy").toString();
        }else {
            sql += " ORDER BY systime DESC ,flow_one_systime DESC,flow_two_systime DESC ";
        }
        List<SysResourceRecommend> moduleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysResourceRecommend.class));
        return moduleList;
    }

    @Override
    public int secondTrialCount(Map<String, Object > map,SysUser sysUser) {
        String wheresql = " where flow_status in ("+SysDefine.SysResourceRecommend.FLOW_STATUS_CSTG+","+SysDefine.SysResourceRecommend.FLOW_STATUS_FSWTG+") ";
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
        String sql = "select count(*) from t_recommend_info as tri left join sys_organ as so ON tri.organization_id=so.id " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public SysResourceInfo findResourceInfo(String id) {
        SysResourceInfo sysResourceInfo=new SysResourceInfo();
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT tri.id,tri.recommend_id,tri.title,tri.other_title,tri.series_number,tri.series_title,tri.author,tri.Pissn,tri.Pisbn,tri.eissn,tri.eisbn,tci.cover_name as cover_id,tri.kind_id,");
        sb.append("tri.coiling_period,sp.`name` AS subject,tri.publisher,sp1.`name` AS country,tri.pub_year,tri.founded_year,tri.`language`,sp2.`name` AS pub_feq,tri.Intro,tri.classi_number,tri.url,");
        sb.append("sp3.`name` AS carrier,tri.type,tri.pub_pattern,sp4.`name` AS pub_status,tri.systime,tri.sysuserid,tri.sysusername,tri.dist_unit");
        sb.append(" FROM t_resource_info AS tri ");
        sb.append(" LEFT JOIN sys_param AS sp ON tri.`subject` = sp.`code` ");
        sb.append(" LEFT JOIN sys_param AS sp1 ON tri.`country` = sp1.`code` ");
        sb.append(" LEFT JOIN sys_param AS sp2 ON tri.`pub_feq` = sp2.`code` ");
        sb.append(" LEFT JOIN sys_param AS sp3 ON tri.`carrier` = sp3.`code` ");
        sb.append(" LEFT JOIN sys_param AS sp4 ON tri.`pub_status` = sp4.`code` ");
        sb.append(" LEFT JOIN t_cover_info AS tci ON tci.id = tri.cover_id ");
        sb.append(" WHERE tri.recommend_id = '"+id+"' ");
        List<SysResourceInfo> sysResourceInfolist=jdbcTemplate.query(sb.toString(), new BeanPropertyRowMapper(SysResourceInfo.class));
        if(sysResourceInfolist.size()!=0) {
            sysResourceInfo = sysResourceInfolist.get(0);
        }
        String lan="'"+sysResourceInfo.getLanguage().replace(",","','")+"'";
        String language="";
        if(StringUtils.isNotBlank(sysResourceInfo.getLanguage())) {
            List<SysParam>  languageList=jdbcTemplate.query("select * from sys_param where code in ("+lan+")", new BeanPropertyRowMapper(SysParam.class));
            if(languageList.size()!=0){
                for(int i=0;i<languageList.size();i++){
                    language+=languageList.get(i).getName()+",";
                }
            }
        }
       language=language.substring(0,language.length()-1);
        sysResourceInfo.setLanguage(language);
        return sysResourceInfo;
    }

    @Override
    public void trial(String isTrial, String trialOpinion, String ids, SysUser sysUser) {
        StringBuffer sb= new StringBuffer();
        sb.append("update t_recommend_info SET flow_status='"+isTrial+"'");
        if(isTrial.equals("1")||isTrial.equals("2")){
            sb.append(" ,flow_one_userid= '"+sysUser.getId()+"', flow_one_username= '"+sysUser.getUsername()+"', flow_one_systime='"+DateUtils.getNowTime()+"'");
        }else if(isTrial.equals("3")||isTrial.equals("4")){
            sb.append(" ,flow_two_userid= '"+sysUser.getId()+"', flow_two_username= '"+sysUser.getUsername()+"', flow_two_systime='"+DateUtils.getNowTime()+"'");
        }
        ids="'"+ ids.replace(",","','")+"'";
        if(isTrial.equals("3")){
            String sql="update t_resource_info SET distribution_status=1 WHERE recommend_id in ("+ids+")";
            jdbcTemplate.update(sql.toString());
        }
        sb.append(" where id in ( "+ids+")");
        jdbcTemplate.update(sb.toString());
    }


    @Override
    public List<SysResourceInfo> onOrderList(String matching, String title, String pissn, String pisbn, String eissn, String eisbn) {

        String awheresql="";
        String vwheresql="";
        if(StringUtils.isNotBlank(title)){
            awheresql+="OR trl.title='"+title+"'";
            vwheresql+="OR trl.title like '%"+title+"%'";
        }
        if(StringUtils.isNotBlank(pisbn)){
            awheresql+="OR trl.Pisbn ='"+pisbn+"'";
            vwheresql+="OR trl.Pisbn like '%"+pisbn+"%'";
        }
        if(StringUtils.isNotBlank(pissn)){
            awheresql+="OR trl.Pissn ='"+pissn+"'";
            vwheresql+="OR trl.Pissn like '%"+pissn+"%'";
        }
        if(StringUtils.isNotBlank(eissn)){
            awheresql+="OR trl.Eissn ='"+eissn+"'";
            vwheresql+="OR trl.Eissn like '%"+eissn+"%'";
        }
        if(StringUtils.isNotBlank(eisbn)){
            awheresql+="OR trl.Eisbn ='"+eisbn+"'";
            vwheresql+="OR trl.Eisbn like '%"+eisbn+"%'";
        }
        awheresql="("+awheresql.substring(2,awheresql.length())+")";

        vwheresql="("+vwheresql.substring(2,vwheresql.length())+")";
        //已订购
        String sql="";
        if(matching.equals("accurate")){
            //精准查询
            sql=" select trl.*,tri.flow_status from t_resource_info as trl LEFT JOIN t_recommend_info as tri on trl.recommend_id=tri.id WHERE trl.order_status='1' AND " + awheresql;
        }else if(matching.equals("vague")) {
            //模糊查询
            sql=" select trl.*,tri.flow_status from t_resource_info as trl LEFT JOIN t_recommend_info as tri on trl.recommend_id=tri.id WHERE trl.order_status='1' AND " + vwheresql;
        }
        List<SysResourceInfo> onOrderList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(SysResourceInfo.class));
        return onOrderList;
    }

    @Override
    public List<SysResourceInfo> notOrderList(String matching, String title, String pissn, String pisbn, String eissn, String eisbn) {
        String awheresql="";
        String vwheresql="";
        if(StringUtils.isNotBlank(title)){
            awheresql+="OR trl.title='"+title+"'";
            vwheresql+="OR trl.title like '%"+title+"%'";
        }
        if(StringUtils.isNotBlank(pisbn)){
            awheresql+="OR trl.Pisbn ='"+pisbn+"'";
            vwheresql+="OR trl.Pisbn like '%"+pisbn+"%'";
        }
        if(StringUtils.isNotBlank(pissn)){
            awheresql+="OR trl.Pissn ='"+pissn+"'";
            vwheresql+="OR trl.Pissn like '%"+pissn+"%'";
        }
        if(StringUtils.isNotBlank(eissn)){
            awheresql+="OR trl.Eissn ='"+eissn+"'";
            vwheresql+="OR trl.Eissn like '%"+eissn+"%'";
        }
        if(StringUtils.isNotBlank(eisbn)){
            awheresql+="OR trl.Eisbn ='"+eisbn+"'";
            vwheresql+="OR trl.Eisbn like '%"+eisbn+"%'";
        }
        awheresql="("+awheresql.substring(2,awheresql.length())+")";

        vwheresql="("+vwheresql.substring(2,vwheresql.length())+")";
        //未订购
        String sql="";
        if(matching.equals("accurate")) {
            //精准查询
            sql = " select trl.*,tri.flow_status from t_resource_info as trl LEFT JOIN t_recommend_info as tri on trl.recommend_id=tri.id WHERE trl.order_status='0' AND tri.flow_status=4 AND tri.flow_status!=5 AND " + awheresql;
        }else if(matching.equals("vague")) {
            //模糊查询
            sql = " select trl.*,tri.flow_status from t_resource_info as trl LEFT JOIN t_recommend_info as tri on trl.recommend_id=tri.id WHERE trl.order_status='0' AND tri.flow_status=4 AND tri.flow_status!=5 AND " + vwheresql;
        }
        List<SysResourceInfo> notOrderList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(SysResourceInfo.class));
        return notOrderList;
    }

    @Override
    public List<SysResourceInfo> repeatedRecommendList(String matching, String title, String pissn, String pisbn, String eissn, String eisbn) {
        String awheresql="";
        String vwheresql="";
        if(StringUtils.isNotBlank(title)){
            awheresql+="OR trl.title='"+title+"'";
            vwheresql+="OR trl.title like '%"+title+"%'";
        }
        if(StringUtils.isNotBlank(pisbn)){
            awheresql+="OR trl.Pisbn ='"+pisbn+"'";
            vwheresql+="OR trl.Pisbn like '%"+pisbn+"%'";
        }
        if(StringUtils.isNotBlank(pissn)){
            awheresql+="OR trl.Pissn ='"+pissn+"'";
            vwheresql+="OR trl.Pissn like '%"+pissn+"%'";
        }
        if(StringUtils.isNotBlank(eissn)){
            awheresql+="OR trl.Eissn ='"+eissn+"'";
            vwheresql+="OR trl.Eissn like '%"+eissn+"%'";
        }
        if(StringUtils.isNotBlank(eisbn)){
            awheresql+="OR trl.Eisbn ='"+eisbn+"'";
            vwheresql+="OR trl.Eisbn like '%"+eisbn+"%'";
        }
        awheresql="("+awheresql.substring(2,awheresql.length())+")";

        vwheresql="("+vwheresql.substring(2,vwheresql.length())+")";
        //可重复荐购
        String sql="";
        if(matching.equals("accurate")) {
            //精准查询
            sql = " select trl.*,tri.flow_status from t_resource_info as trl LEFT JOIN t_recommend_info as tri on trl.recommend_id=tri.id WHERE trl.order_status='0' AND tri.flow_status!=3 AND tri.flow_status!=5 AND" + awheresql;
        }else if(matching.equals("vague")) {
            //模糊查询
            sql = " select trl.*,tri.flow_status from t_resource_info as trl LEFT JOIN t_recommend_info as tri on trl.recommend_id=tri.id WHERE trl.order_status='0' AND tri.flow_status!=3 AND tri.flow_status!=5 AND" + vwheresql;
        }
        List<SysResourceInfo> repeatedRecommendList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(SysResourceInfo.class));
        return repeatedRecommendList;
    }



    @Override
    public int validateCode(SysResourceInfo sysResourceInfo){
        String sql=" select count(*) from t_resource_info as tri where 1=1 ";
        String wheresql="";
        if(StringUtils.isNotBlank(sysResourceInfo.getPissn())){
            wheresql=" and tri.pissn ='"+sysResourceInfo.getPissn()+"'";
        }else if(StringUtils.isNotBlank(sysResourceInfo.getPisbn())){
            wheresql=" and tri.pisbn ='"+sysResourceInfo.getPisbn()+"'";
        }else if(StringUtils.isNotBlank((sysResourceInfo.getEissn()))){
            wheresql=" and tri.eissn ='"+sysResourceInfo.getEissn()+"'";
        }else if(StringUtils.isNotBlank(sysResourceInfo.getEisbn())){
            wheresql=" and tri.eisbn ='"+sysResourceInfo.getEisbn()+"'";
        }
        sql+=wheresql;
        int num=jdbcTemplate.queryForObject(sql, Integer.class);
        return num;
    }

    public String powerListSQL(SysUser sysUser){
        String sql="";
        if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_DEPT)){
            sql =" and so.tree_level like '"+sysUser.getOrganTreeLevel()+"%' ";
        }else if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_NORMAL)){
            sql = " and tri.sysuserid= '"+sysUser.getId()+"'";
        }
        return sql;
    }


    @Override
    public int findByFlowStatus(String...flowStatus) {
        String sql = " select count(*) from t_recommend_info where flow_status=? ";
        for (int i=0;i<flowStatus.length;i++){
            if (i>0){
                sql += " or flow_status=? ";
            }
        }
        return this.jdbcTemplate.queryForObject(sql, Integer.class, flowStatus);
    }

    @Override
    public void addTring(String ids) {
        StringBuffer sb= new StringBuffer();
        ids="'"+ ids.replace(",","','")+"'";
        sb.append("update t_recommend_info SET flow_status='"+SysDefine.SysResourceRecommend.FLOW_STATUS_DSH+"' where id in ( "+ids+")");
        jdbcTemplate.update(sb.toString());
    }
}
