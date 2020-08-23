package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysRoleDao;
import cn.nstl.entity.SysRole;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysRoleRepository;
import cn.nstl.service.RoleService;
import cn.nstl.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Override
    public Response findRoleList(Map<String, Object> map, SysUser sysUser) {
        List<SysRole> sysUserList = this.sysRoleDao.findAll(map, sysUser);
        Response response = Response.createBySuccess("操作成功",sysUserList);
        int count = this.sysRoleDao.countAll(map, sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public Response save(SysRole sysRole) {
        if (StringUtils.isBlank(sysRole.getName())){
            return Response.createByErrorMessage("角色名称不能为空");
        }
        if (StringUtils.isBlank(sysRole.getId())){
            if (this.sysRoleDao.findByName(sysRole)){
                return Response.createByErrorMessage("角色名称重复");
            }
        }else {
            SysRole byIdIsNotAndName = this.sysRoleRepository.findByIdIsNotAndName(sysRole.getId(), sysRole.getName());
            if (byIdIsNotAndName!=null){
                return Response.createByErrorMessage("角色名称重复");
            }
        }
//        if (StringUtils.isBlank(sysRole.getModuleIds())){
//            return Response.createByErrorMessage("请给角色分配权限");
//        }
        sysRole.setStatus(SysDefine.SysRole.STATUS_YES);
        sysRole.setCreateDate(DateUtils.getFullStringByDate(new Date()));
        SysRole save = this.sysRoleRepository.save(sysRole);
        //删除关联role_id的中间表
        this.sysRoleDao.deleteRoleByIds(save.getId());
        String[] moduleIds = sysRole.getModuleIds().split(",");
        for (int i = 0; i < moduleIds.length; i++) {
            this.sysRoleDao.saveMidTable(save.getId(), moduleIds[i]);
        }
        return Response.createBySuccessMessage("保存成功");
    }

    @Override
    public Response del(SysRole sysRole) {
        String[] roleIds = sysRole.getId().split(",");
        int successCount = 0;
        int errorCount = 0;
        for (int i = 0; i < roleIds.length; i++) {
            int rowCount = this.sysRoleDao.findUsersByRoleId(roleIds[i]);
            if (rowCount>0){
                errorCount++;
            }else {
                this.sysRoleRepository.delete(roleIds[i]);
                this.sysRoleDao.deleteRoleByIds(roleIds[i]);
                successCount++;
            }

        }
        StringBuffer msg = new StringBuffer("成功删除"+successCount+"条");
        if (errorCount>0){
            msg.append("，失败"+errorCount+"条！(原因：角色使用中不能被删除)");
        }
        return Response.createBySuccessMessage(msg.toString());
    }

    @Override
    public List<SysRole> findAll() {
        return this.sysRoleRepository.findAll();
    }

    @Override
    public List<SysRole> findRolesByUserId(String id) {
        return this.sysRoleDao.findRolesByUserId(id);
    }

    @Override
    public SysRole findById(String id) {
        return this.sysRoleRepository.findOne(id);
    }
}
