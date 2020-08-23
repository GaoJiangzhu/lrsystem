package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.dao.SysLogDao;
import cn.nstl.entity.SysLog;
import cn.nstl.repository.SysLogRepository;
import cn.nstl.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private SysLogDao sysLogDao;

    @Autowired
    private SysLogRepository sysLogRepository;

    @Override
    public Response list(Map<String, Object > map) {
        List<SysLog> sysUserList = this.sysLogDao.findAll(map);
        Response response = Response.createBySuccess("操作成功",sysUserList);
        int count = this.sysLogDao.countAll(map);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    @Override
    public void save(SysLog sysLog) {
        this.sysLogRepository.save(sysLog);
    }
}
