package cn.nstl.service.impl;

import cn.nstl.aop.LogAOP;
import cn.nstl.common.Response;
import cn.nstl.dao.LogAOPDao;
import cn.nstl.entity.SysLog;
import cn.nstl.entity.SysUser;
import cn.nstl.service.ILogAOPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/11
 */
@Service
public class LogAOPServieImpl implements ILogAOPService {

    @Autowired
    private LogAOPDao logAOPDao;

    @Override
    public void addLog(String type, Map<String, Object> dataMap) throws Exception {
//        添加用户日志
        logAOPDao.addLog(getAddLogParm(type,dataMap));
    }

//    封装添加数据
    private SysLog getAddLogParm(String type, Map<String, Object> dataMap) throws Exception {
        SysUser user = (SysUser)dataMap.get("user");
        SysLog sysLog = new SysLog();

        sysLog.setDescription(dataMap.get("meldes").toString());
        sysLog.setIp(dataMap.get("IP").toString());
        sysLog.setUrl(dataMap.get("url").toString());
        sysLog.setType(type);
        sysLog.setContent("用户"+type+"数据");

//        如果用户为空表明没有登录 或者 之前没有获取的用户信息
        if (user == null){
//            再次获取确认用户是否登录
                user = LogAOP.getUser();
//            如果操作为【登录】 user 不为 null 表示登录成功
            Response response = (Response)dataMap.get("result");
            if (response.getStatus() == 0){
                sysLog.setUser(user.getUsername());
                sysLog.setRole(user.getRoleName());
                sysLog.setContent("用户登录系统");
            }else if (response.getStatus() == 1){
                sysLog.setUser(dataMap.get("username").toString());
                sysLog.setRole("");
                sysLog.setContent("用户登录系统失败");
            }
        }else {
            sysLog.setUser(user.getUsername());
            sysLog.setRole(user.getRoleName());
            if (type .equals("注销")){
                sysLog.setContent("用户注销系统");
            }
            if (type.equals("登录")){
                sysLog.setContent("用户登录系统");
            }
        }
        return sysLog;
    }
}
