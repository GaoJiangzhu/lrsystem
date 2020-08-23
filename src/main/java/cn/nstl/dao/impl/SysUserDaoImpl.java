package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.SysDefine;
import cn.nstl.entity.SysUser;
import cn.nstl.entity.vo.SearchParams;
import cn.nstl.utils.Md5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import cn.nstl.dao.SysUserDao;
import org.springframework.util.CollectionUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户dao实现类
 */
@Repository
public class SysUserDaoImpl extends BaseDaoImpl implements SysUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 根据用户名称和用户密码获取用户列表
     * @param userName 用户名称
     * @param password 用户密码
     * @return
     */
    @Override
    public List<SysUser> getUser(String userName, String password) {
        String sql = "SELECT " +
                "  * " +
                " FROM " +
                "  sys_user " +
                " WHERE " +
                "  username = ? " +
                " AND (`password` = ? or `password` = ?)";

        List<SysUser> sysUser = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysUser.class), userName, password,Md5Util.getMd5(password));
        return sysUser;
    }
    /**
     * 获取用户分页列表
     * @param map 查询条件和分页排序条件
     * @param sysUser 当前用户
     * @return
     */
    @Override
    public List<SysUser> findAll(Map<String, Object > map, SysUser sysUser) {
        List<Object> objects = new ArrayList<>();
        String wheresql = " where 1=1 ";
        //添加权限开始
        if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_DEPT)){
            if (StringUtils.isBlank(sysUser.getOrganTreeLevel())){
                return new ArrayList<>();
            }
            wheresql = wheresql + " and sys_organ.tree_level like ?";
            objects.add(sysUser.getOrganTreeLevel()+"%");
        }else if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_NORMAL)){
            wheresql = wheresql + " and sys_user.id=? ";
            objects.add(sysUser.getId());
        }
        //添加权限结束

        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            SearchParams params = Constant.parse2Params2(map.get("params").toString(), new ArrayList<Object>());
            wheresql = wheresql + params.getWheresql();
            objects.addAll(params.getObjects());
        }

        String sql = "select sys_user.*,sys_organ.organ_name as organName from sys_user " +
                " left join sys_organ on sys_user.organ_id=sys_organ.id  "+ wheresql;
        if (map.get("order")!=null && map.get("orderBy")!=null){
            sql = sql +" order by ? ?";
            objects.add(map.get("order").toString());
            objects.add(map.get("orderBy").toString());
        }else {
            sql += " order by createdate desc ";
        }
        sql += " limit ?, ?";
        objects.add(Integer.valueOf(map.get("start").toString()));
        objects.add(Integer.valueOf(map.get("length").toString()));
        List<SysUser> moduleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysUser.class), objects.toArray());
        return moduleList;
    }
    /**
     * 获取用户表总数
     * @param map 查询条件
     * @param sysUser 当前用户
     * @return
     */
    @Override
    public int countAll(Map<String, Object > map, SysUser sysUser) {
        List<Object> objects = new ArrayList<>();
        String wheresql = " where 1=1 ";

        //添加权限开始
        if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_DEPT)){
            if (StringUtils.isBlank(sysUser.getOrganTreeLevel())){
                return 0;
            }
            wheresql = wheresql + " and sys_organ.tree_level like ?";
            objects.add(sysUser.getOrganTreeLevel()+"%");
        }else if (StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_NORMAL)){
            wheresql = wheresql + " and sys_user.id=? ";
            objects.add(sysUser.getId());
        }
        //添加权限结束

        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            SearchParams params = Constant.parse2Params2(map.get("params").toString(), new ArrayList<Object>());
            wheresql = wheresql + params.getWheresql();
            objects.addAll(params.getObjects());
        }
        //添加权限结束
        String sql = "select count(*) from sys_user left join sys_organ on sys_user.organ_id=sys_organ.id " + wheresql;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, objects.toArray());
        return count;
    }
    /**
     * 根据用户id删除用户
     * @param id 用户id
     */
    @Override
    public void deleteByUserId(String id) {
        String sql = "delete from sys_user_roles where sys_user_id=?";
        jdbcTemplate.update(sql, id);
    }
    /**
     * 插入用户和角色的关系到中间表
     * @param userId 用户id
     * @param roleId 角色id
     */
    @Override
    public void saveMiddleTable(String userId, String roleId) {
        String sql = "insert into sys_user_roles(sys_user_id, roles_id) values(?,?)";
        jdbcTemplate.update(sql,userId, roleId);
    }
    /**
     * 根据用户id查询用户对象
     * @param id
     * @return
     */
    @Override
    public SysUser findById(String id) {
        String sql = "select * from sys_user where id=?";
        SysUser user = jdbcTemplate.queryForObject(sql,new Object[] {id}, SysUser.class);
        return user;
    }

    /**
     * 查询模块路径的所有权限用户的id
     * //获取荐购初审的用户
     * //获取荐购复审的用户
     * //获取荐购遴选的用户
     * //获取审核分配的用户
     * //获取订购审核的用户
     * @param url 模块路径
     * @return
     */
    @Override
    public List<String> findUserListByModuleUrl(Object[] url) {
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
        String sql = "SELECT\n" +
                "\tDISTINCT sys_user.id as id\n" +
                "FROM\n" +
                "\tsys_user\n" +
                "LEFT JOIN sys_user_roles ON sys_user.id = sys_user_roles.sys_user_id \n" +
                "LEFT JOIN sys_role_module ON sys_user_roles.roles_id= sys_role_module.role_id \n" +
                "LEFT JOIN sys_module ON sys_role_module.module_id=sys_module.id \n" +
                "where sys_module.action in (:url) ";
        List<String> list = CollectionUtils.arrayToList(url);
        Map<String, Object> map = new HashMap<>();
        map.put("url", list);
        return namedParameterJdbcTemplate.query(sql, map, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getString("id");
            }
        });
    }

}
