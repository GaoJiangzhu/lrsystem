package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysUserRepository;
import cn.nstl.utils.DateUtils;
import cn.nstl.utils.Md5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.nstl.dao.SysUserDao;
import cn.nstl.service.UserService;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 用户管理接口实现类
 * @author liuhaiyuan
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
    SysUserDao sysUserDao;

	@Autowired
	private SysUserRepository sysUserRepository;

    /**
     * 根据用户名称和用户密码获取用户列表
     * @param userName 用户名称
     * @param password 用户密码
     * @return
     */
	@Override
    public List<SysUser> getUser(String userName, String password) {
        return sysUserDao.getUser(userName, password);
    }

    /**
     * 获取用户分页列表
     * @param map 查询条件和分页排序条件
     * @param sysUser 当前用户
     * @return
     */
    @Override
    public Response findUserList(Map<String, Object > map, SysUser sysUser) {
        List<SysUser> sysUserList = this.sysUserDao.findAll(map, sysUser);
        Response response = Response.createBySuccess("操作成功",sysUserList);
        int count = this.sysUserDao.countAll(map, sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    /**
     * 保存用户
     * @param sysUser 用户信息
     * @param compareUser 为创建用户提供创建者
     * @return
     */
    @Override
    public Response save(SysUser sysUser,SysUser compareUser) {
	    if (StringUtils.isBlank(sysUser.getUsername())){
	        return Response.createByErrorMessage("请填写用户名");
        }
        if (StringUtils.isBlank(sysUser.getEmail())){
            return Response.createByErrorMessage("请填写邮箱地址");
        }
        if (StringUtils.isBlank(sysUser.getUsername())){
            return Response.createByErrorMessage("请填写手机号");
        }
        if (StringUtils.isBlank(sysUser.getId())){
            SysUser byUsername = this.sysUserRepository.findByUsername(sysUser.getUsername());
            if (byUsername !=null){
                return Response.createByErrorMessage("用户名已存在");
            }
            SysUser email = this.sysUserRepository.findByEmail(sysUser.getEmail());
            if (email !=null){
                return Response.createByErrorMessage("邮箱地址已存在");
            }
            SysUser phone = this.sysUserRepository.findByPhone(sysUser.getPhone());
            if (phone !=null){
                return Response.createByErrorMessage("手机号已存在");
            }
            if (!sysUser.getPassword().equals(sysUser.getPassword2())){
                return Response.createByErrorMessage("密码与确认密码不一致");
            }
            sysUser.setPassword(Md5Util.getMd5(sysUser.getPassword()));
            sysUser.setCreateDate(DateUtils.getFullStringByDate(new Date()));
        }else{
            SysUser username = this.sysUserRepository.findSysUserByIdIsNotAndUsername(sysUser.getId(), sysUser.getUsername());
            if (username !=null){
                return Response.createByErrorMessage("用户名已存在");
            }
            SysUser email = this.sysUserRepository.findSysUserByIdIsNotAndEmail(sysUser.getId(), sysUser.getEmail());
            if (email !=null){
                return Response.createByErrorMessage("邮箱地址已存在");
            }
            SysUser phone = this.sysUserRepository.findSysUserByIdIsNotAndPhone(sysUser.getId(), sysUser.getPhone());
            if (phone !=null){
                return Response.createByErrorMessage("手机号已存在");
            }
            SysUser one = this.sysUserRepository.findOne(sysUser.getId());
            if (one == null){
                return Response.createByErrorMessage("用户不存在");
            }
            sysUser.setPassword(one.getPassword());
            sysUser.setCreateDate(one.getCreateDate());
            sysUser.setLoginDate(one.getLoginDate());
        }

        String[] roleIds = sysUser.getRoleId().split(",");
        sysUser.setRoleId(null);

        SysUser user = this.sysUserRepository.save(sysUser);
        this.sysUserDao.deleteByUserId(user.getId());
        //删除用户与角色的关系
        for (int i = 0; i < roleIds.length; i++) {
            this.sysUserDao.saveMiddleTable(user.getId(), roleIds[i]);
        }
        return Response.createBySuccessMessage("保存成功");
    }
    /**
     * 保存最后登录时间
     * @param sysUser 当前用户
     */
    @Override
    public void saveLoginDate(SysUser sysUser) {
        this.sysUserRepository.updateLoginDate(DateUtils.getFullStringByDate(new Date()), sysUser.getId());
    }
    /**
     * (批量)删除用户
     * @param sysUser 用户id以","间隔
     * @return
     */
    @Override
    public Response del(SysUser sysUser) {
        String[] ids = sysUser.getId().split(",");
        for (int i = 0; i < ids.length; i++) {
            this.sysUserRepository.delete(ids[i]);
            this.sysUserDao.deleteByUserId(ids[i]);
        }
        return Response.createBySuccess("删除成功");
    }

    /**
     * 通过用户id获取用户数据
     * @param id
     * @return
     */
    @Override
    public SysUser findOne(String id) {
        return this.sysUserRepository.findOne(id);
    }

    /**
     * 用户重置密码
     * @param sysUser
     * @return
     */
    @Override
    public Response reset(SysUser sysUser) {
        this.sysUserRepository.updatePasswordById(sysUser.getId(), SysDefine.SysUser.INITIAL_PWD);
        return Response.createBySuccessMessage("操作成功");
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
    public List<String> findUserListByModuleUrl(Object...url) {
        return this.sysUserDao.findUserListByModuleUrl(url);
    }


    @Override
    public Response updatePwd(String id, String newPwd) {
        this.sysUserRepository.updatePasswordById(id, Md5Util.getMd5(newPwd));
        return Response.createBySuccess();
    }

}
