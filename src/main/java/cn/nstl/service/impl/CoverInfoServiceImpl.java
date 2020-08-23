package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.dao.SysCoverInfoDao;
import cn.nstl.entity.SysCover;
import cn.nstl.entity.SysParam;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysCoverInfoRepository;
import cn.nstl.service.CoverInfoService;
import cn.nstl.service.ParamService;
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
public class CoverInfoServiceImpl implements CoverInfoService {


    @Autowired
    private SysCoverInfoDao sysCoverInfoDao;

    @Autowired
    private SysCoverInfoRepository sysCoverInfoRepository;

    @Autowired
    private ParamService paramService;

    @Override
    public Response findList(Map<String, Object> map, SysUser sysUser) {
        List<SysCover> sysCoverList = this.sysCoverInfoDao.findAll(map, sysUser);

        for (int i=0;i<sysCoverList.size();i++){
            SysCover item = sysCoverList.get(i);
            if (item.getLanguage()!=null){
                String[] languageIds = item.getLanguage().split(",");
                StringBuffer buffer = new StringBuffer();
                int len = languageIds.length;
                for (int j=0;j<len;j++){
                    if (StringUtils.isNotBlank(languageIds[j])){
                        SysParam sysParam = this.paramService.findById(languageIds[j]);
                        if (sysParam == null){
                            continue;
                        }
                        buffer.append(sysParam.getName()+",");
                    }
                }
                if (buffer.toString().length()-1>0){
                    item.setLanguage(buffer.toString().substring(0, buffer.toString().length()-1));
                }else {
                    item.setLanguage(StringUtils.EMPTY);
                }
            }
            SysParam sysParam = this.paramService.findById(item.getSubject());
            if (sysParam!=null){
                item.setSubject(sysParam.getName());
            }
            sysParam = this.paramService.findById(item.getPubCountry());
            if (sysParam!=null){
                item.setPubCountry(sysParam.getName());
            }
        }
        Response response = Response.createBySuccess("操作成功",sysCoverList);
        int count = this.sysCoverInfoDao.countAll(map, sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public Response save(SysCover sysCoverInfo, SysUser sysUser) {
//        String[] languageIds = sysCoverInfo.getLanguage().split(",");
        if (StringUtils.isBlank(sysCoverInfo.getId())){
            sysCoverInfo.setCreateBy(sysUser.getId());
            sysCoverInfo.setCreateTime(DateUtils.getFullStringByDate(new Date()));
//            sysCoverInfo.setLanguage(null);
            SysCover returnObj = this.sysCoverInfoRepository.save(sysCoverInfo);
//            for (int i=0;i<languageIds.length;i++){
//                //再新增
//                this.sysCoverInfoDao.insertCoverParam(returnObj.getId(), languageIds[i]);
//            }
        }else{
            SysCover one = this.sysCoverInfoRepository.findOne(sysCoverInfo.getId());
            if (one == null){
                return Response.createByErrorMessage("数据不存在");
            }
            sysCoverInfo.setCreateBy(one.getCreateBy());
            sysCoverInfo.setCreateTime(one.getCreateTime());
            sysCoverInfo.setUpdateBy(sysUser.getId());
            sysCoverInfo.setUpdateTime(DateUtils.getFullStringByDate(new Date()));
            sysCoverInfo.setIsDel(SysDefine.SysCover.ISDEL_NO);
//            for (int i=0;i<languageIds.length;i++){
//                //先删除
//                this.sysCoverInfoDao.deleteCoverParam(sysCoverInfo.getId());
//                //再新增
//                this.sysCoverInfoDao.insertCoverParam(sysCoverInfo.getId(), languageIds[i]);
//            }
//            sysCoverInfo.setLanguage(null);
            this.sysCoverInfoRepository.save(sysCoverInfo);
        }

        return Response.createBySuccess();
    }

    @Override
    public SysCover findOne(String id) {
        return this.sysCoverInfoRepository.findOne(id);
    }

    @Override
    public List<SysCover> findAll() {
        return this.sysCoverInfoDao.findList();
    }

    @Override
    public Response del(String ids) {
        if (StringUtils.isBlank(ids)){
            return Response.createByErrorMessage("请选择要删除的数据");
        }
        String[] idsArr = ids.split(",");
        for (int i=0;i<idsArr.length;i++){
            this.sysCoverInfoRepository.updateIsDelById(SysDefine.SysCover.ISDEL_YES, idsArr[i]);
        }
        return Response.createBySuccessMessage("删除成功");
    }
}
