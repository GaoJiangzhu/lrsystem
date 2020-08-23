package cn.nstl.config;

import cn.nstl.common.Constant;
import cn.nstl.entity.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Service
public class SecurityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        HttpSession session = request.getSession();

//            判断是否已有该用户登录的session
        SysUser sysUser = Constant.getSysUser(request);
        if(sysUser == null){
            response.sendRedirect("/login");
            return false;
        }

//        Map<String, String> userAuth = Constant.getUserAuth(request);
//        if (!StringUtils.equals(userAuth.get(request.getRequestURI()), request.getRequestURI())){
//            response.sendRedirect("/login");
//            return false;
//        }

        return true;
    }
}
