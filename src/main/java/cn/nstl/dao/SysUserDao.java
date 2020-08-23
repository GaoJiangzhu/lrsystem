package cn.nstl.dao;

import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

/**
 * 用户dao接口
 * @author liuhaiyuan
 */
public interface SysUserDao {

    /**
     * 根据用户名称和用户密码获取用户列表
     * @param userName 用户名称
     * @param password 用户密码
     * @return
     */
    List<SysUser> getUser(String userName, String password);
    /**
     * 获取用户分页列表
     * @param map 查询条件和分页排序条件
     * @param sysUser 当前用户
     * @return
     */
    List<SysUser> findAll(Map<String, Object > map, SysUser sysUser);
    /**
     * 获取用户表总数
     * @param map 查询条件
     * @param sysUser 当前用户
     * @return
     */
    int countAll(Map<String, Object > map, SysUser sysUser);

    /**
     * 根据用户id删除用户
     * @param id 用户id
     */
    void deleteByUserId(String id);

    /**
     * 插入用户和角色的关系到中间表
     * @param userId 用户id
     * @param roleId 角色id
     */
    void saveMiddleTable(String userId, String roleId);

    /**
     * 根据用户id查询用户对象
     * @param id
     * @return
     */
    SysUser findById(String id);

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
    List<String> findUserListByModuleUrl(Object[] url);
}
