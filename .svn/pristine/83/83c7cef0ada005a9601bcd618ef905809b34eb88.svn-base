package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysOrganDao;
import cn.nstl.entity.SysOrgan;
import cn.nstl.repository.SysOrganRepository;
import cn.nstl.service.OrganService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrganServiceImpl implements OrganService {

    @Autowired
    private SysOrganRepository sysOrganRepository;

    @Autowired
    private SysOrganDao sysOrganDao;

    @Override
    public List<SysOrgan> findAll() {
        return this.sysOrganRepository.findAll();
    }

    @Override
    public Response save(SysOrgan sysOrgan) {
        if (StringUtils.isBlank(sysOrgan.getName())) {
            return Response.createByErrorMessage("请填写名称");
        }
        if (StringUtils.isBlank(sysOrgan.getCode())) {
            return Response.createByErrorMessage("请填写编码");
        }
        if (StringUtils.isBlank(sysOrgan.getId())) {
            List<SysOrgan> byNameOrCode = this.sysOrganRepository.findByNameOrCode(sysOrgan.getName(), sysOrgan.getCode());
            if (byNameOrCode.size() > 0) {
                return Response.createByErrorMessage("名称或编码重复");
            }
            if (StringUtils.isBlank(sysOrgan.getpId())){
                sysOrgan.setpId(SysDefine.SysOrgan.ROOT);
                List<SysOrgan> byPId = this.sysOrganRepository.findByPId(SysDefine.SysOrgan.ROOT);
                if (byPId.size() == 0) {
                    sysOrgan.setTreeLevel("001");
                } else {
                    return Response.createByErrorMessage("请选择上级");
                }
            }else if (StringUtils.isNotBlank(sysOrgan.getpId())) {
                //增加子节点
                List<SysOrgan> byPId = this.sysOrganRepository.findByPId(sysOrgan.getpId());
                if (byPId.size() == 0) {
                    SysOrgan one = this.sysOrganRepository.findOne(sysOrgan.getpId());
                    sysOrgan.setTreeLevel(one.getTreeLevel() + "001");
                } else {
                    String treeLevel = "";
                    for (int i = 0; i < byPId.size(); i++) {
                        if (StringUtils.isBlank(treeLevel)){
                            treeLevel = byPId.get(i).getTreeLevel();
                            continue;
                        } else if (byPId.size() == 1) {
                            treeLevel = byPId.get(i).getTreeLevel();
                            continue;
                        }
                        if (treeLevel.compareTo(byPId.get(i).getTreeLevel()) < 0){
                            treeLevel = byPId.get(i).getTreeLevel();
                        }
                    }
                    if (StringUtils.isBlank(treeLevel)) {
                        treeLevel = "0";
                    }
                    String newTreeLevel = treeLevel.substring(treeLevel.length() - 3);
                    newTreeLevel = String.valueOf(Integer.valueOf(newTreeLevel) + 1);

                    newTreeLevel = String.valueOf(newTreeLevel);
                    int len = newTreeLevel.length() < 3 ? 3 - newTreeLevel.length() : newTreeLevel.length() + 1;
                    for (int i = 0; i < len; i++) {
                        newTreeLevel = "0" + newTreeLevel;
                    }
                    sysOrgan.setTreeLevel(treeLevel.substring(0, treeLevel.length() - 3) + newTreeLevel);
                }
            }
        } else {
            List<SysOrgan> byNameOrCodeAndIsNotId = this.sysOrganDao.findByNameOrCodeAndIsNotId(sysOrgan);
            if (byNameOrCodeAndIsNotId.size() > 0) {
                return Response.createByErrorMessage("名称或编码重复");
            }
            this.sysOrganDao.updateNameAndCodeById(sysOrgan);
            return Response.createBySuccess("保存成功");
        }

        this.sysOrganRepository.save(sysOrgan);
        return Response.createBySuccess("保存成功");
    }

    @Override
    public Response edit(SysOrgan sysOrgan) {
        SysOrgan one = this.sysOrganRepository.findOne(sysOrgan.getId());
        return Response.createBySuccess(one);
    }

    @Override
    public Response del(SysOrgan sysOrgan) {
        SysOrgan one = this.sysOrganRepository.findOne(sysOrgan.getId());
        this.sysOrganRepository.deleteByTreeLevelIsStartingWith(one.getTreeLevel());
        return Response.createBySuccessMessage("删除成功");
    }

    @Override
    public SysOrgan findById(String organId) {
        return this.sysOrganRepository.findOne(organId);
    }

}
