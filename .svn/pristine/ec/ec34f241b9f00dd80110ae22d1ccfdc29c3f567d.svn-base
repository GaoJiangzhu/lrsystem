package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysCoverInfoDao;
import cn.nstl.entity.SysCover;
import cn.nstl.entity.SysUser;
import cn.nstl.entity.vo.SearchParams;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SysCoverInfoDaoImpl extends BaseDaoImpl implements SysCoverInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<SysCover> findAll(Map<String, Object> map, SysUser sysUser) {
        List<Object> objects = new ArrayList<>();
        String wheresql = " where is_del='0' ";
        //添加权限开始
        if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_NORMAL)
                || StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_DEPT)){
            wheresql = wheresql + " and t_cover_info.create_by=? ";
            objects.add(sysUser.getId());
        }
        //添加权限结束

        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            SearchParams params = Constant.parse2Params2(map.get("params").toString(), new ArrayList<Object>());
            wheresql = wheresql + params.getWheresql();
            objects.addAll(params.getObjects());
        }
        String sql = "select * from t_cover_info "+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by "+ map.get("order").toString()+ " "+map.get("orderBy").toString();
        }else {
            sql += " order by create_time desc ";
        }
        sql += " limit ?, ?";
        objects.add(Integer.valueOf(map.get("start").toString()));
        objects.add(Integer.valueOf(map.get("length").toString()));
        List<SysCover> moduleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysCover.class), objects.toArray());
        return moduleList;
    }

    @Override
    public int countAll(Map<String, Object> map, SysUser sysUser) {
        List<Object> objects = new ArrayList<>();
        String wheresql = " where is_del='0' ";

        //添加权限开始
        if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_NORMAL)
                || StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_DEPT)){
            wheresql = wheresql + " and t_cover_info.create_by=? ";
            objects.add(sysUser.getId());
        }

        //添加权限结束
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            SearchParams params = Constant.parse2Params2(map.get("params").toString(), new ArrayList<Object>());
            wheresql = wheresql + params.getWheresql();
            objects.addAll(params.getObjects());
        }
        String sql = "select count(*) from t_cover_info  "+ wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, objects.toArray());
        return count;
    }

    @Override
    public void insertCoverParam(String coverId, String languageId) {
        String sql = "insert into t_cover_param(cover_id, param_id) values(?, ?)";
        this.jdbcTemplate.update(sql, new Object[]{coverId, languageId});
    }

    @Override
    public void deleteCoverParam(String coverId) {
        String sql = "delete from t_cover_param where cover_id=?";
        this.jdbcTemplate.update(sql, coverId);
    }

    @Override
    public List<SysCover> findList() {
        String sql = "select id, cover_name from t_cover_info where id_del='0' ";
        return this.jdbcTemplate.queryForList(sql, SysCover.class);
    }
}
