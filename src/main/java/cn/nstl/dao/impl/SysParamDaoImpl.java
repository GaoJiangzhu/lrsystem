package cn.nstl.dao.impl;

import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysParamDao;
import cn.nstl.entity.SysCover;
import cn.nstl.entity.SysParam;
import cn.nstl.entity.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class SysParamDaoImpl implements SysParamDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void deleteById(String id) {
        String sql = "update sys_param set is_del=? where id=?";
        this.jdbcTemplate.update(sql, SysDefine.SysParam.IS_DEL_YES, id);
    }

    @Override
    public void updateNameAndAndCodeById(SysParam sysParam) {
        String sql = "update sys_param set code=?,name=?,score=?,weight=? where id=?";
        this.jdbcTemplate.update(sql,new Object[]{sysParam.getCode(),sysParam.getName(),sysParam.getScore(), sysParam.getWeight(), sysParam.getId()});
    }

    @Override
    public List<Map<String, Object>> findByPid(String pId) {
        String sql = "select id, name from sys_param where pid=?";
        return this.jdbcTemplate.queryForList(sql, pId);
    }

    @Override
    public List<SysParam> findByNameOrCodeAndIsNotId(SysParam sysParam) {
        String sql = "select * from sys_param where is_del='"+SysDefine.SysParam.IS_DEL_NO+"' and id!=? and (name=? or code=?)";
        return jdbcTemplate.queryForList(sql,new Object[] {sysParam.getId(),sysParam.getName(), sysParam.getCode()}, SysParam.class);

    }

    @Override
    public List<SysParam> getPublishList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8a808bfb64daa28a0164dsae0bb10003'";
        List<SysParam> publishList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return publishList;
    }

    @Override
    public List<SysParam> getCountryList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8a808bfb64dsa28a0164dsae0bb10003'";
        List<SysParam> countryList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return countryList;
    }

    @Override
    public List<SysParam> getSubjectList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8a808bf264a102ba0164a10ac1fc0007'";
        List<SysParam> subjectList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return subjectList;
    }


    @Override
    public List<SysParam> getFrequencyList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8b808bfb64dsa28a0164dsae0bb10003'";
        List<SysParam> frequencyList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return frequencyList;
    }


    @Override
    public List<SysParam> getCarrierList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8b808afb64dsa28a0164dsae0bb10003'";
        List<SysParam> carrierList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return carrierList;
    }

    @Override
    public List<SysParam> getLanguageList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8b808bfb64bsa28a0164dsae0bb10003'";
        List<SysParam> languageList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return languageList;
    }

    @Override
    public List<SysCover> getCoverList() {
        String sql =" SELECT tci.id,tci.pub_country,tci.publisher,sp.`name` as `subject`,tci.`language`,tci.eissn,tci.pissn,tci.eisbn,tci.pisbn,tci.cover_name ";
        sql+=" FROM t_cover_info AS tci LEFT JOIN sys_param AS sp ON tci.subject=sp.id ";
        List<SysCover> CoverList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysCover.class));
        for(SysCover sysCover:CoverList){
            //获取语言
            String language="";
            if(StringUtils.isNotBlank(sysCover.getLanguage())){
                List<SysParam>  languageList=jdbcTemplate.query("select * from sys_param where id in ("+"'"+sysCover.getLanguage().replace(",","','")+"'"+")", new BeanPropertyRowMapper(SysParam.class));
                if(languageList.size()!=0){
                    for(int i=0;i<languageList.size();i++){
                        language+=languageList.get(i).getName()+",";
                    }
                }
            }
            sysCover.setLanguage(language.substring(0,language.length()-1));
            //获取国家
            String country="";
            if(StringUtils.isNotBlank(sysCover.getPubCountry())){
                List<SysParam>  countryList=jdbcTemplate.query("select * from sys_param where id in ("+"'"+sysCover.getPubCountry().replace(",","','")+"'"+")", new BeanPropertyRowMapper(SysParam.class));
                if(countryList.size()!=0){
                    for(int i=0;i<countryList.size();i++){
                        country+=countryList.get(i).getName()+",";
                    }
                }
            }
            sysCover.setPubCountry(country.substring(0,country.length()-1));
        }
        return CoverList;
    }

    @Override
    public List<SysParam> getOrderTypeList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8b808bfb64bsa28a0164dsae0bb10004'";
        List<SysParam> orderTypeList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return orderTypeList;
    }

    @Override
    public List<SysParam> getCurrencyList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8b808bfb64dsa28a0164dsae0bb10007'";
        List<SysParam> contractList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return contractList;
    }

    @Override
    public List<SysParam> getOrderingModeList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8b808bfb64dsa28a0164dsae0bb10005'";
        List<SysParam> currencyList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return currencyList;
    }

    @Override
    public List<SysParam> getOpenRangeList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8b808bfb64dsa28a0164dsae0bb10006'";
        List<SysParam> openRangeList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return openRangeList;
    }

    @Override
    public List<SysParam> getStopReasonList() {
        String sql ="SELECT * FROM sys_param where is_del='0' and pid='8b808bfb64dsa28a0164dsae0bb10008'";
        List<SysParam> stopReasonList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return stopReasonList;
    }

    @Override
    public List<SysParam> getFundTypeList() {
        String sql = "SELECT * FROM sys_param where is_del='0' and pid='8b808bfb64dsa28a0164dsae0bb10009'";
        List<SysParam> fundTypeList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return fundTypeList;
    }

    @Override
    public List<SysParam> getAuditOpinionList() {
        String sql = "SELECT * FROM sys_param where is_del='0' and pid='8a808bfb64daa28a0164daac7c820000'";
        List<SysParam> auditOpinionList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysParam.class));
        return auditOpinionList;
    }
}
