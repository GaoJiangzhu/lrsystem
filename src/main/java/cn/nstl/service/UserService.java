package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.SysUser;

import java.util.List;
import java.util.Map;

/**
 * 用户管理接口
 * @author liuhaiyuan
 */
public interface UserService {

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
    Response findUserList(Map<String, Object > map, SysUser sysUser);

    /**
     * 保存用户
     * @param sysUser 用户信息
     * @param user 为创建用户提供创建者
     * @return
     */
    Response save(SysUser sysUser,SysUser user);

    /**
     * 保存最后登录时间
     * @param sysUser 当前用户
     */
    void saveLoginDate(SysUser sysUser);

    /**
     * (批量)删除用户
     * @param sysUser 用户id以","间隔
     * @return
     */
    Response del(SysUser sysUser);

    /**
     * 通过用户id获取用户数据
     * @param id
     * @return
     */
    SysUser findOne(String id);

    /**
     * 用户重置密码
     * @param sysUser
     * @return
     */
    Response reset(SysUser sysUser);

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
    List<String> findUserListByModuleUrl(Object...url);

    /**
     * 更新密码
     * @param id 用户id
     * @param newPwd 新密码
     * @return
     */
    Response updatePwd(String id, String newPwd);

}
