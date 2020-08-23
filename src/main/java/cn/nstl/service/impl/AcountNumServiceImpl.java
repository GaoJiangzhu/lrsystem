package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.dao.SysAcountNumDao;
import cn.nstl.entity.AcountNum;
import cn.nstl.entity.ProxyCorporation;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysAcountNumRepository;
import cn.nstl.service.AcountNumService;
import cn.nstl.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AcountNumServiceImpl implements AcountNumService {

    @Autowired
    private SysAcountNumDao sysAcountNumDao;

    @Autowired
    private SysAcountNumRepository acountNumRepository;

    @Override
    public Response findList(Map<String, Object> map, SysUser sysUser) {
        List<AcountNum> sysUserList = this.sysAcountNumDao.findAll(map, sysUser);
        Response response = Response.createBySuccess("操作成功",sysUserList);
        int count = this.sysAcountNumDao.countAll(map, sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public AcountNum findOne(String id) {
        return this.acountNumRepository.findOne(id);
    }

    @Override
    public Response save(AcountNum acountNum, SysUser sysUser) {
        if (StringUtils.isBlank(acountNum.getAcountNum())){
            return Response.createByErrorMessage("请填写户号");
        }
        if (StringUtils.isBlank(acountNum.getId())){
            StringBuffer buffer = new StringBuffer();
            String[] acountNums = acountNum.getAcountNum().replaceAll("，", ",").split(",");
            for (int i=0;i<acountNums.length;i++){
                String acount = acountNums[i];
                AcountNum acounts = this.acountNumRepository.findByAcountNum(acount);
                if (acounts!=null){
                    buffer.append(acount + "、");
                    continue;
                }
                acountNum.setAcountNum(acount);
                acountNum.setCreateTime(DateUtils.getFullStringByDate(new Date()));
                acountNum.setCreateBy(sysUser.getId());
                this.acountNumRepository.save(acountNum);
            }
            if(StringUtils.isNotBlank(buffer)){
                return Response.createBySuccessMessage(buffer.toString()+"户号已存在，存储失败，其他户号存储成功");
            }
        }else{
            AcountNum acount = this.acountNumRepository.findByAcountNumAndIdNot(acountNum.getAcountNum(), acountNum.getId());
            if (acount!=null){
                return Response.createByErrorMessage("户号重复");
            }
            acountNum.setUpdateBy(sysUser.getId());
            acountNum.setUpdateTime(DateUtils.getFullStringByDate(new Date()));
            int rowCount = this.sysAcountNumDao.update(acountNum);
            if (rowCount<1){
                return Response.createByErrorMessage("更新失败");
            }
        }
        return Response.createBySuccessMessage("操作成功");
    }

    @Override
    public Response del(String ids) {
        List<String> list = CollectionUtils.arrayToList(ids.split(","));
        int count = this.acountNumRepository.deleteByIdIn(list);
        if (count<1){
            return Response.createBySuccessMessage("删除失败");
        }
        return Response.createBySuccessMessage("操作成功");
    }

    @Override
    public int findByProxyCorId(String proxyCorId) {
        return this.acountNumRepository.findByProxyCorId(proxyCorId);
    }
}
