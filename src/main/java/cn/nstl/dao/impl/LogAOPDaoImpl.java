package cn.nstl.dao.impl;

import cn.nstl.controller.StatisticalController;
import cn.nstl.dao.LogAOPDao;
import cn.nstl.entity.SysLog;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/11
 */
@Repository
public class LogAOPDaoImpl implements cn.nstl.dao.LogAOPDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static Logger logger = Logger.getLogger(LogAOPDaoImpl.class);

    @Override
    public void addLog(SysLog sysLog) throws Exception{
        String sql = "INSERT INTO `sys_logs` (`id`, `user`, `role`, `description`, `url`, `type`, `content`, `date`, `ip`) VALUES (?, ?,?,?, ?, ?, ?, ?, ?)";
        String[] str = new String[]{
                sysLog.getId(),
                sysLog.getUser(),
                sysLog.getRole(),
                sysLog.getDescription(),
                sysLog.getUrl(),
                sysLog.getType(),
                sysLog.getContent(),
                sysLog.getDate(),
                sysLog.getIp()
        };
        int update = jdbcTemplate.update(sql,str);
        logger.info("添加【"+sysLog.getType()+"】类日志"+update+"条");
    }
}
