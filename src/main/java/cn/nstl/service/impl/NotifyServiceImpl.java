package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.dao.SysNotifyDao;
import cn.nstl.entity.SysNotify;
import cn.nstl.entity.SysUser;
import cn.nstl.repository.SysNotifyRepository;
import cn.nstl.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private SysNotifyRepository sysNotifyRepository;

    @Autowired
    private SysNotifyDao sysNotifyDao;

    @Override
    public void deleteByUserIds(List<String> userIdList) {
        this.sysNotifyDao.deleteAll();
    }

    @Override
    public void save(List<SysNotify> notify) {
        this.sysNotifyRepository.save(notify);
    }

    @Override
    public Response findByUserId(SysUser sysUser) {
        List<SysNotify> sysNotifyList = this.sysNotifyDao.findByUserId(sysUser.getId());
        if (sysNotifyList.size() == 0){
            return Response.createBySuccess(new SysNotify());
        }
        return Response.createBySuccess(sysNotifyList.get(sysNotifyList.size()-1));
    }
}
