package cn.nstl.dao.impl;

import cn.nstl.dao.SysModuleDao;
import cn.nstl.dao.SysUserDao;
import cn.nstl.entity.SysModule;
import cn.nstl.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class SysModuleDaoImpl implements SysModuleDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public List<SysModule> getSecModule(String treeLevel) {
		String sql = "SELECT " +
				"  * " +
				" FROM " +
				"  springcloud.sys_module " +
				" WHERE ";
		return null;
	}

	@Override
	public List<SysModule> findAll(SysModule sysModule) {
		String sql = "select a.*, b.module_name as pName from sys_module as a left join sys_module as b on a.parent_id=b.id ORDER BY a.`tree_level` asc limit ?,?";
		List<SysModule> moduleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysModule.class), sysModule.getStart(), sysModule.getLength());
		return moduleList;
	}

	@Override
	public int countAll(SysModule sysModule) {
		String sql = "select count(*) from sys_module as a left join sys_module as b on a.parent_id=b.id ORDER BY a.`tree_level` asc";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public List<SysModule> findModuleByUser(SysUser sysUser) {
		String sql = "SELECT " +
				" DISTINCT sm.id, sm.module_name, sm.parent_id, sm.order_num, sm.action, sm.`level`, sm.tree_level, sm.module_order " +
				"FROM " +
				"sys_user AS su " +
				"LEFT JOIN sys_user_roles AS sur ON su.id = sur.sys_user_id " +
				"LEFT JOIN sys_role as sr on sr.id=sur.roles_id  " +
				"LEFT JOIN sys_role_module as srm on srm.role_id=sr.id " +
				"LEFT JOIN sys_module as sm on sm.id=srm.module_id  " +
				"WHERE " +
				"su.id = ? order by sm.order_num asc ";
		List<SysModule> moduleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysModule.class), sysUser.getId());
		return moduleList;
	}

	@Override
	public List<String> findModuleUrlList(SysUser sysUser) {
		String sql = "SELECT " +
				"sm.action " +
				"FROM " +
				"sys_user AS su " +
				"LEFT JOIN sys_user_roles AS sur ON su.id = sur.sys_user_id " +
				"LEFT JOIN sys_role as sr on sr.id=sur.roles_id " +
				"LEFT JOIN sys_role_module as srm on srm.role_id=sr.id " +
				"LEFT JOIN sys_module as sm on sm.id=srm.module_id " +
				"WHERE " +
				" su.id = ? order by sm.order_num asc ";
		List<String> list = jdbcTemplate.query(sql, new RowMapper<String>(){
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString("action");
			}
		}, sysUser.getId());
		return list;
	}

	@Override
	public List<SysModule> getModuleListByRoleId(String roleId) {
		String sql = "select sm.* from sys_role as sr " +
				"left join sys_role_module as srm on sr.id=srm.role_id " +
				"left join sys_module as sm on srm.module_id=sm.id where sr.id=?";
		List<SysModule> moduleList = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SysModule.class), roleId);
		return moduleList;
	}
}
