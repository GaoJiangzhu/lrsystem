package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysModuleDao;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysModuleRepository;
import cn.nstl.entity.SysModule;
import cn.nstl.service.ModuleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private SysModuleRepository sysModuleRepository;

    @Autowired
    private SysModuleDao sysModuleDao;
    /**
     * 获取菜单
     * @return
     */
    @Override
    public List<SysModule> getModule(SysUser sysUser) {
        List<SysModule> moduleList;
        if (SysDefine.SysUser.ISADMIN_SUPER.equalsIgnoreCase(sysUser.getIsAdmin())){
            Sort sort = new Sort(Sort.Direction.ASC, "orderNum");
            moduleList = this.sysModuleRepository.findAll(sort);
        }else{
            moduleList = this.sysModuleDao.findModuleByUser(sysUser);
        }
        List<SysModule> resultList = new ArrayList<>();
        List<SysModule> moduleListByRoleId = new ArrayList<>();
        if (StringUtils.isNotBlank(sysUser.getRoleId())){
            moduleListByRoleId = this.getModuleListByRoleId(sysUser.getRoleId());
        }
        //处理一级菜单
        for (int i = 0; i < moduleList.size(); i++) {
            if (SysDefine.SysModule.FIRST_LEVEL == moduleList.get(i).getLevel()
                    && "0".equalsIgnoreCase(moduleList.get(i).getParentId())){
                if (moduleListByRoleId.contains(moduleList.get(i))){
                    moduleList.get(i).setChecked(SysDefine.SysModule.CHECKED_YES);
                }
                resultList.add(moduleList.get(i));
                moduleList.remove(i);
                i--;
            }
        }

        //处理二级菜单
        for (int i = 0; i < resultList.size(); i++) {
            for (int j = 0; j < moduleList.size(); j++) {
                if (resultList.get(i).getId().equalsIgnoreCase(moduleList.get(j).getParentId())){
                    if (moduleListByRoleId.contains(moduleList.get(j))){
                        moduleList.get(j).setChecked(SysDefine.SysModule.CHECKED_YES);
                    }
                    resultList.get(i).getChildren().add(moduleList.get(j));
                    moduleList.remove(j);
                    j--;
                }
            }
        }
        //处理三级菜单
        for (int i = 0; i < resultList.size(); i++) {
            SysModule sysModule = resultList.get(i);
            for (int j = 0; j < sysModule.getChildren().size(); j++) {
                SysModule sysModule1 = sysModule.getChildren().get(j);
                for (int k = 0; k < moduleList.size(); k++) {
                    if (sysModule1.getId().equalsIgnoreCase(moduleList.get(k).getParentId())){
                        if (moduleListByRoleId.contains(moduleList.get(k))){
                            moduleList.get(k).setChecked(SysDefine.SysModule.CHECKED_YES);
                        }
                        sysModule1.getChildren().add(moduleList.get(k));
                    }
                }
            }
        }
        return resultList;
    }

    @Override
    public List<SysModule> getSecModule(String treeLevel) {
        List<SysModule> moduleList = this.sysModuleRepository.findSysModuleByTreeLevelStartsWithAndLevelIsNot(treeLevel, SysDefine.SysModule.FIRST_LEVEL);
        List<SysModule> resultList = new ArrayList<>();
        for (int i = 0; i < moduleList.size(); i++) {
            if (moduleList.get(i).getLevel()==SysDefine.SysModule.SECOND_LEVEL){
                resultList.add(moduleList.get(i));
                moduleList.remove(i);
                i--;
            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            for (int j = 0; j < moduleList.size(); j++) {
                if (resultList.get(i).getId().equalsIgnoreCase(moduleList.get(j).getParentId())){
                    resultList.get(i).getChildren().add(moduleList.get(j));
                }
            }
        }
        return resultList;
    }

    @Override
    public SysModule getSysModuleByTreeLevel(String treeLevel) {
        return this.sysModuleRepository.findByTreeLevelEqualsAndLevelEquals(treeLevel, SysDefine.SysModule.FIRST_LEVEL);
    }

    @Override
    public Response findSecModuleList(String parentId) {
        return Response.createBySuccess(this.sysModuleRepository.findByParentId(parentId));
    }

    @Override
    public Response save(SysModule sysModule) {
        if (StringUtils.isBlank(sysModule.getModuleName())){
            return Response.createByErrorMessage("模块名称不能为空");
        }
        //设置级别
        if (StringUtils.isBlank(sysModule.getParentId())){
            sysModule.setLevel(SysDefine.SysModule.FIRST_LEVEL);
            sysModule.setParentId("0");
            //设置treelevel
            List<SysModule> byLevel = this.sysModuleRepository.findByLevel(SysDefine.SysModule.FIRST_LEVEL);
            String treeLevel = "";
            for (int i = 0; i < byLevel.size(); i++) {
                if (byLevel.get(i).getTreeLevel().compareTo(byLevel.get(i).getTreeLevel()) < 0){
                    treeLevel = byLevel.get(i).getTreeLevel();
                }else {
                    treeLevel = byLevel.get(i).getTreeLevel();
                }
                if (i+1<byLevel.size()-1){
                    break;
                }
            }
            if (StringUtils.isBlank(treeLevel)){
                treeLevel = "0";
            }
            Integer newTreeLevel = Integer.valueOf(treeLevel)+2;
            treeLevel = String.valueOf(newTreeLevel);
            if (treeLevel.length() > byLevel.get(0).getTreeLevel().length()){
                return Response.createByErrorMessage("treeLevel保存报错");
            }
            int len = treeLevel.length();
            for (int i = 0; i < byLevel.get(0).getTreeLevel().length()-len; i++) {
                treeLevel = "0" + treeLevel;
            }
            sysModule.setTreeLevel(treeLevel);
        }else{
            SysModule one = this.sysModuleRepository.findOne(sysModule.getParentId());
            if (one == null){
                return Response.createByErrorMessage("父级不存在");
            }
            if (one.getLevel() == SysDefine.SysModule.FIRST_LEVEL){
                sysModule.setLevel(SysDefine.SysModule.SECOND_LEVEL);

            }else{
                sysModule.setLevel(SysDefine.SysModule.THIRD_LEVEL);
            }
            //设置treelevel
            List<SysModule> byParentId = this.sysModuleRepository.findByParentId(one.getId());
            String treeLevel = "";
            if (byParentId.size() == 0){
                treeLevel = one.getTreeLevel()+"001";
                sysModule.setTreeLevel(treeLevel);
            }else {
                for (int i = 0; i < byParentId.size(); i++) {
                    if (byParentId.get(i).getTreeLevel().compareTo(byParentId.get(i).getTreeLevel()) < 0){
                        treeLevel = byParentId.get(i).getTreeLevel();
                    }else {
                        treeLevel = byParentId.get(i).getTreeLevel();
                    }
                    if (i+1==byParentId.size()-1){
                        break;
                    }
                }
                String newTreeLevel = treeLevel.substring(treeLevel.length()-3);
                newTreeLevel = String.valueOf(Integer.valueOf(newTreeLevel)+2);
                int len = newTreeLevel.length();
                for (int i = 0; i < 3-len; i++) {
                    newTreeLevel = "0" + newTreeLevel;
                }
                sysModule.setTreeLevel(treeLevel.substring(0,treeLevel.length()-3) + newTreeLevel);
            }

        }

        if (sysModule.getOrderNum() == null){
            List<SysModule> list = this.sysModuleRepository.findByParentIdOrderByOrderNumDesc(sysModule.getParentId());
            sysModule.setOrderNum(list.get(0).getOrderNum()+1);
        }
        this.sysModuleRepository.save(sysModule);
        return Response.createBySuccess("保存成功");
    }

    @Override
    public Response findAll(SysModule sysModule) {
        List<SysModule> sysUserList = this.sysModuleDao.findAll(sysModule);
        Response response = Response.createBySuccess("操作成功",sysUserList);
        response.setRecords(sysModule.getRecords());
        int count = this.sysModuleDao.countAll(sysModule);
        response.setTotal(count/sysModule.getRows()+1);
        response.setPage(sysModule.getPage());
        response.setRecords(count);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(sysModule.getDraw());
        return response;
    }

    @Override
    public Response del(String id) {
        this.sysModuleRepository.delete(id);
        return Response.createBySuccess("删除成功");
    }

    @Override
    public List<String> findModuleUrlList(SysUser sysUser) {
        return this.sysModuleDao.findModuleUrlList(sysUser);
    }

    @Override
    public List<SysModule> getModuleListByRoleId(String roleId) {
        return this.sysModuleDao.getModuleListByRoleId(roleId);
    }
}
