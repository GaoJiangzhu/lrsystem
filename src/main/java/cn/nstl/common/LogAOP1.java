package cn.nstl.common;

import cn.nstl.controller.StatisticalController;
import cn.nstl.entity.SysUser;
import cn.nstl.service.ILogAOPService;
import cn.nstl.service.RoleService;
import cn.nstl.utils.DateUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.SourceLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/11
 */
//证明是一个配置文件(使用@Component也可以,因为点入后会发现@Configuration还是使用了@Component)
//@Configuration
////证明是一个切面
//@Aspect
public class LogAOP1 {

    private static Logger logger = Logger.getLogger(LogAOP1.class);

    @Autowired
    private ILogAOPService logAOPservice;

    //环绕aop
    //execution表达式 此表达式表示扫描controller下所有类的所有方法都执行此aop
//    @Around("execution (* cn.nstl.controller..*.*(..))")
    public Object testAop(ProceedingJoinPoint pro) throws Throwable {

        Map<String, Object> dataMap = getDataMap();
        //执行调用的方法
        Object proceed = pro.proceed();
//        通过URL进行日志
        try {
            forUrlConfirmMod(pro,proceed,dataMap);
        } catch (Exception e) {
            logger.error(e);
        }
        return proceed;
    }

    //通过URL确认操作步骤
    private void forUrlConfirmMod(ProceedingJoinPoint pro, Object proceed, Map<String, Object> dataMap) throws Exception {
        String url = dataMap.get("url").toString();
        dataMap.put("result",proceed);
        //登录
        if (url.equals("/new/loginindex") && dataMap.get("password") != null && dataMap.get("username") != null){
            logAOPservice.addLog(SysDefine.SysLog.LOG_TYPE_MAP.get(SysDefine.SysLog.LOGIN),getGatLogMsg(dataMap,pro));
        }
        //注销
        else if (url.equals("/new/loginOut.html")){
            logAOPservice.addLog(SysDefine.SysLog.LOG_TYPE_MAP.get(SysDefine.SysLog.LOGINOUT),getGatLogMsg(dataMap,pro));
        }
        //添加
        else if (url.indexOf("/add") != -1){
            logAOPservice.addLog(SysDefine.SysLog.LOG_TYPE_MAP.get(SysDefine.SysLog.ADD),getGatLogMsg(dataMap,pro));
        }
        //修改
        else if (url.indexOf("/upd") != -1){
            logAOPservice.addLog(SysDefine.SysLog.LOG_TYPE_MAP.get(SysDefine.SysLog.MODIFY),getGatLogMsg(dataMap,pro));
        }
        //删除
        else if (url.indexOf("/del") != -1){
            logAOPservice.addLog(SysDefine.SysLog.LOG_TYPE_MAP.get(SysDefine.SysLog.DELETE),getGatLogMsg(dataMap,pro));
        }
    }
//        获取LogMsg注解
    private Map<String, Object> getGatLogMsg(Map<String, Object> dataMap, ProceedingJoinPoint pro)throws Exception {
//        获取对象
        Signature signature = pro.getSignature();
//        获取class
        Class declaringType = signature.getDeclaringType();
//        调用方法名称
        String name = signature.getName();
        LogMsg logMsg = null;
//        获取所有方法
        Method[] methods = declaringType.getMethods();
        for (Method method : methods) {
            if (method.getName().toString().equals(name)){
                logMsg = method.getAnnotation(LogMsg.class);
            }
        }
        if (logMsg == null){
            dataMap.put("meldes", "暂无数据");
        }else {
            //        得到注解内容
            String value = logMsg.value();
            dataMap.put("meldes", value);
        }
        return dataMap;
    }

    //    获取前台传入参数
//    暂时直接获取参数，如果之后又规则在进行修改
    private Map<String, Object> getDataMap() throws Exception {
        Map<String, Object> dataMap = new HashMap<>();
//        获取request请求提(需要时备用)
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        dataMap.put("url",request.getRequestURI());
        dataMap.put("IP",getIpAddress(request));
        Enumeration enu=request.getParameterNames();
        while(enu.hasMoreElements()){
            String paraName=(String)enu.nextElement();
            dataMap.put(paraName,request.getParameter(paraName) );
        }
        SysUser user = getUser();
        if (user != null)
            dataMap.put("user", user);
        return dataMap;
    }

/**
*  获取IP
* @param request
* @return
*/
  public static String getIpAddress(HttpServletRequest request) throws Exception {
      String ip = request.getHeader("x-forwarded-for");
      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
              ip = request.getHeader("Proxy-Client-IP");
          }
      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
              ip = request.getHeader("WL-Proxy-Client-IP");
          }
      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
              ip = request.getHeader("HTTP_CLIENT_IP");
          }
      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
              ip = request.getHeader("HTTP_X_FORWARDED_FOR");
          }
      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
              ip = request.getRemoteAddr();
          }
      return ip;
  }

  public static SysUser getUser() throws Exception {
      HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
      return (SysUser)request.getSession().getAttribute(Constant.SESSION_KEY);
  }
}
