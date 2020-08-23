package cn.nstl.dao.impl;

import cn.nstl.common.Constant;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysRoleDao;
import cn.nstl.entity.SysRole;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysRoleRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SysRoleDaoImpl extends BaseDaoImpl implements SysRoleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Override
    public List<SysRole> findAll(Map<String, Object> map, SysUser sysUser) {
        if (!StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_SUPER)){
            return new ArrayList<>();
        }

        String wheresql = " where 1=1 ";
        if (map.get("params")!=null){
            //获取param中的参数，直接替换成数据库的sql片段加入sql中，或者先放入实体
            wheresql = wheresql + Constant.parse2Params(map.get("params").toString());
        }

        String sql = "select * from (select sys_role.*," +
                "(select count(*) from sys_user " +
                "left join sys_user_roles on sys_user.id=sys_user_roles.sys_user_id " +
                "where sys_user_roles.roles_id=sys_role.id) as userCount " +
                "from sys_role) as sys_role " + wheresql;
        List<SysRole> roleList = jdbcTemplate.query(this.appendLimit(sql, map), new BeanPropertyRowMapper<>(SysRole.class));
        return roleList;
    }

    @Override
    public int countAll(Map<String, Object> map, SysUser sysUser) {
        if (!StringUtils.equals(sysUser.getIsAdmin(), SysDefine.SysUser.ISADMIN_SUPER)){
            return 0;
        }
        String sql = "select count(*) from sys_role ";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public void saveMidTable(String roleId, String moduleId) {
        String sql = "insert into sys_role_module(role_id, module_id)values(?, ?) ";
        jdbcTemplate.update(sql, roleId,moduleId);
    }

    @Override
    public void deleteRoleByIds(String roleId) {
        String sql = "delete from sys_role_module where role_id=?";
        jdbcTemplate.update(sql, roleId);
    }

    @Override
    public List<SysRole> findRolesByUserId(String id) {
        String sql = "select a.id, a.name as text from sys_user_roles as b left join sys_role as a on a.id=b.roles_id where b.sys_user_id=?";
        return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysRole.class),id);
    }

    @Override
    public Boolean findByName(SysRole sysRole) {
        if (StringUtils.isBlank(sysRole.getId())){
            List<SysRole> byName = this.sysRoleRepository.findByName(sysRole.getName());
            if (byName.size() == 0){
                return false;
            }
            return true;
        }else{
            String sql = "select * from sys_role where name=? and id!=?";
            List<SysRole> sysRoleList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SysRole.class), sysRole.getName(), sysRole.getId());
            if (sysRoleList.size() == 0){
                return false;
            }
            return true;
        }
    }

    @Override
    public int findUsersByRoleId(String roleId) {
        String sql = "select count(*) from sys_user " +
                "left join sys_user_roles on sys_user.id=sys_user_roles.sys_user_id " +
                "where sys_user_roles.roles_id='"+roleId+"'";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

}
