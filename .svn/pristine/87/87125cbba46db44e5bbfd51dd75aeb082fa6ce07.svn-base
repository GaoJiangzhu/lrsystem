package cn.nstl.aop;

import cn.nstl.common.Constant;
import cn.nstl.common.LogMsg;
import cn.nstl.common.Response;
import cn.nstl.common.SysDefine;
import cn.nstl.entity.SysLog;
import cn.nstl.entity.SysUser;
import cn.nstl.service.LogService;
import cn.nstl.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/11
 */
//证明是一个配置文件(使用@Component也可以,因为点入后会发现@Configuration还是使用了@Component)
@Configuration
//证明是一个切面
@Aspect
public class LogAOP {

    private static Logger logger = Logger.getLogger(LogAOP.class);

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private LogService logService;

    //环绕aop
    //execution表达式 此表达式表示扫描controller下所有类的所有方法都执行此aop
    @Before("execution (* cn.nstl.controller..*.*(..))")
    public Object before(JoinPoint pro) throws Throwable {
        if (!request.getRequestURI().equals("/logout.do")) {
            return pro;
        }
        String methodName = pro.getSignature().getName();
        Object[] args = pro.getArgs();
        Class<?>[] argTypes = new Class[pro.getArgs().length];
        for (int i = 0; i < args.length; i++) {
            argTypes[i] = args[i].getClass();
        }
        LogMsg logMsg = null;
        //获取所有方法
        Method[] methods = pro.getSignature().getDeclaringType().getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                logMsg = method.getAnnotation(LogMsg.class);
            }
        }
        if (logMsg != null) {
            if (request.getRequestURI().indexOf("/logout.do")!=-1) {
                SysUser sysUser = Constant.getSysUser(request);
                SysLog sysLog = new SysLog();
                sysLog.setIp(getIpAddress(request));
                sysLog.setContent(logMsg.value());
                sysLog.setUrl(request.getRequestURI());
                sysLog.setUser(sysUser.getUsername());
                sysLog.setDate(DateUtils.getFullString(new DateTime()));
                sysLog.setDescription(logMsg.value());
                sysLog.setType(SysDefine.SysLog.OPT_SUCCESS);
                sysLog.setUserId(sysUser.getId());
                this.logService.save(sysLog);
            }
        }
        //执行调用的方法
        return pro;
    }


    //环绕aop
    //execution表达式 此表达式表示扫描controller下所有类的所有方法都执行此aop
    @AfterReturning(returning = "rvt", pointcut = "execution (* cn.nstl.controller..*.*(..))")
    public Object testAop(JoinPoint pro, Object rvt) throws Throwable {
        String methodName = pro.getSignature().getName();
        Object[] args = pro.getArgs();
        Class<?>[] argTypes = new Class[pro.getArgs().length];
        for (int i = 0; i < args.length; i++) {
            if (args[i] == null){
                continue;
            }
            argTypes[i] = args[i].getClass();
        }
        LogMsg logMsg = null;
        //获取所有方法
        Method[] methods = pro.getSignature().getDeclaringType().getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                logMsg = method.getAnnotation(LogMsg.class);
            }
        }
        if (logMsg != null) {
            if ("/logout.do".equals(request.getRequestURI())) {
                return rvt;
            }
            SysUser sysUser = Constant.getSysUser(request);
            if (sysUser == null){
                return rvt;
            }
            SysLog sysLog = new SysLog();
            sysLog.setIp(getIpAddress(request));
            sysLog.setContent(logMsg.value());
            sysLog.setUrl(request.getRequestURI());
            sysLog.setDate(DateUtils.getFullString(new DateTime()));
            sysLog.setDescription(logMsg.value());
            sysLog.setUser(sysUser.getUsername());
            sysLog.setUserId(sysUser.getId());
            if (rvt instanceof Response) {
                Response response = (Response) rvt;
                if (response.isSuccess()) {
                    sysLog.setType(SysDefine.SysLog.OPT_SUCCESS);
                } else {
                    sysLog.setType(SysDefine.SysLog.OPT_ERROR);
                }
            } else {
                sysLog.setType(SysDefine.SysLog.OPT_SUCCESS);
            }
            this.logService.save(sysLog);
        }
        //执行调用的方法
        return rvt;
    }

    /**
     * 获取IP
     *
     * @param request
     * @return
     */
    public static String getIpAddress(HttpServletRequest request) throws Exception {
        String ip = request.getHeader("X-Forwarded-For");
        if(StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if(index != -1){
                return ip.substring(0,index);
            }else{
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if(StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            return ip;
        }
        return request.getRemoteAddr();
    }

    public static SysUser getUser() throws Exception {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return (SysUser) request.getSession().getAttribute(Constant.SESSION_KEY);
    }
}
