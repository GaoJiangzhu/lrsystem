package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.dao.SysProxyCorporationDao;
import cn.nstl.entity.ProxyCorporation;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysProxyCorationRepository;
import cn.nstl.service.AcountNumService;
import cn.nstl.service.ProxyCorationService;
import cn.nstl.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ProxyCorationServiceImpl implements ProxyCorationService {

    @Autowired
    private SysProxyCorporationDao sysProxyCorporationDao;

    @Autowired
    private SysProxyCorationRepository sysProxyCorationRepository;

    @Autowired
    private AcountNumService acountNumService;

    @Override
    public Response findList(Map<String, Object> map, SysUser sysUser) {
        List<ProxyCorporation> sysUserList = this.sysProxyCorporationDao.findAll(map, sysUser);
        Response response = Response.createBySuccess("操作成功",sysUserList);
        int count = this.sysProxyCorporationDao.countAll(map, sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public ProxyCorporation findOne(String id) {
        return this.sysProxyCorationRepository.findOne(id);
    }

    @Override
    public Response save(ProxyCorporation proxyCorporation, SysUser sysUser) {
        if (StringUtils.isBlank(proxyCorporation.getId())){
            ProxyCorporation corporation = this.sysProxyCorationRepository.findByProxyCorCode(proxyCorporation.getProxyCorCode());
            if (corporation!=null){
                return Response.createByErrorMessage(proxyCorporation.getProxyCorCode() + " 已存在");
            }

            corporation = this.sysProxyCorationRepository.findByProxyCorName(proxyCorporation.getProxyCorName());
            if (corporation!=null){
                return Response.createByErrorMessage(proxyCorporation.getProxyCorName() + " 已存在");
            }
            proxyCorporation.setCreateBy(sysUser.getId());
            proxyCorporation.setCreateTime(DateUtils.getFullStringByDate(new Date()));
            this.sysProxyCorationRepository.save(proxyCorporation);
        }else {
            ProxyCorporation corporation = this.sysProxyCorationRepository.findByProxyCorCodeAndIdNot(proxyCorporation.getProxyCorCode(), proxyCorporation.getId());
            if (corporation!=null){
                return Response.createByErrorMessage(proxyCorporation.getProxyCorCode() + " 已存在");
            }
            corporation = this.sysProxyCorationRepository.findByProxyCorNameAndIdNot(proxyCorporation.getProxyCorName(), proxyCorporation.getId());
            if (corporation!=null){
                return Response.createByErrorMessage(proxyCorporation.getProxyCorName() + " 已存在");
            }
            proxyCorporation.setUpdateBy(sysUser.getId());
            proxyCorporation.setUpdateTime(DateUtils.getFullStringByDate(new Date()));
            int count = this.sysProxyCorporationDao.update(proxyCorporation);
            if (count<1){
                return Response.createByErrorMessage("更新失败");
            }
        }
        return Response.createBySuccessMessage("操作成功");
    }

    @Override
    public Response del(String ids) {
        List<String> list = CollectionUtils.arrayToList(ids.split(","));
        int deleteCount = 0;
        int errorCount = 0;
        for (String s: list){
            int count = this.acountNumService.findByProxyCorId(s);
            if (count <1){
                int delcount = this.sysProxyCorationRepository.deleteById(s);
                if (delcount <1){
                    errorCount++;
                }else {
                    delcount++;
                }
            }
        }
        StringBuffer buffer = new StringBuffer("删除成功"+deleteCount+"条数据");
        if (errorCount>0){
            buffer.append("失败"+errorCount+"条数据！原因代理公司有户号");
        }else {
            buffer.append("!");
        }
        return Response.createBySuccessMessage(buffer.toString());
    }

    @Override
    public List<ProxyCorporation> findAll() {
        return this.sysProxyCorationRepository.findAll(new Sort(Sort.Direction.ASC, "createBy"));
    }
}
