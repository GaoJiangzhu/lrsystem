package cn.nstl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.nstl.entity.SysUser;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface SysUserRepository extends JpaRepository<SysUser, String> {


	/**
	 * 根据用户登录名称获取用户
	 * @param username 用户名称
	 * @return
	 */
	SysUser findByUsername(String username);

	/**
	 * 修改用户最后登录时间
	 * @param loginDate 最后登录时间
	 * @param id 用户id
	 */
	@Modifying
	@Transactional
	@Query("update SysUser set loginDate=:loginDate where id=:id")
	void updateLoginDate(@Param("loginDate") String loginDate, @Param("id") String id);

	/**
	 * 根据用户id查询用户对象
	 * @param id 用户id
	 * @return
	 */
	SysUser findById(String id);

	/**
	 * 根据用户id修改密码
	 * @param id 用户id
	 * @param pwd 密码
	 */
	@Modifying
	@Transactional
	@Query("update SysUser set password=:pwd where id=:id")
	void updatePasswordById(@Param("id") String id, @Param("pwd") String pwd);

	/**
	 * 查询非用户id但用户名称相同的用户
	 * @param id 用户id
	 * @param username 用户登录名
	 * @return
	 */
	SysUser findSysUserByIdIsNotAndUsername(String id, String username);

	/**
	 * 查询非用户id但邮箱地址相同的用户
	 * @param id 用户id
	 * @param email 邮箱地址
	 * @return
	 */
	SysUser findSysUserByIdIsNotAndEmail(String id, String email);

	/**
	 * 查询非用户id但手机号相同的用户
	 * @param id 用户id
	 * @param phone 手机号
	 * @return
	 */
	SysUser findSysUserByIdIsNotAndPhone(String id, String phone);

	/**
	 * 根据手机号查询用户对象
	 * @param phone 手机号
	 * @return
	 */
	SysUser findByPhone(String phone);

	/**
	 * 根据邮箱地址查询用户
	 * @param email 邮箱地址
	 * @return
	 */
	SysUser findByEmail(String email);
}
