package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.dao.FundManageDao;
import cn.nstl.entity.SysUser;
import cn.nstl.service.FundManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wuhongjie
 * @Date: Created in 15:41 2018/8/23
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FundManageServiceImpl implements FundManageService {

    @Autowired
    FundManageDao fundManageDao;


    @Override
    public Response cypherList(Map<String, Object > map,SysUser sysUser) {
        List findFristTrialList = this.fundManageDao.cypherList(map,sysUser);
        Response response = Response.createBySuccess("操作成功",findFristTrialList);
        int count = this.fundManageDao.findCount(map,sysUser);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

}
