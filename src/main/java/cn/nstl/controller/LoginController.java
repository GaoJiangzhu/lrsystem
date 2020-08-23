package cn.nstl.controller;
import cn.nstl.common.Constant;
import cn.nstl.common.LogMsg;
import cn.nstl.common.Response;
import cn.nstl.common.ResponseCode;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysModule;
import cn.nstl.entity.SysOrgan;
import cn.nstl.entity.SysUser;
import cn.nstl.service.ModuleService;
import cn.nstl.service.OrganService;
import cn.nstl.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("")
public class LoginController extends BaseController {

	private static Logger logger = Logger.getLogger(LoginController.class);

	private static final String BATH_PATH = "login/";
	@Autowired
	UserService userService;

	@Autowired
	private ModuleService moduleService;

	@Autowired
	private OrganService organService;

	@RequestMapping("/login")
	public String newLogin(){
		return BATH_PATH + "login";

	}

	@RequestMapping("/loginindex")
	@ResponseBody
	@LogMsg("用户登录")
	public Response loginindex(@RequestParam(value = "username") String username,
							   @RequestParam(value = "password") String password, HttpSession session) {

		List<SysUser> sysUserList = userService.getUser(username, password);
		if (sysUserList.size() == 1) {
			SysUser sysUser = sysUserList.get(0);
			if (StringUtils.isNotBlank(sysUser.getOrganId())){
				SysOrgan sysOrgan = this.organService.findById(sysUser.getOrganId());
				sysUser.setOrganTreeLevel(sysOrgan.getTreeLevel());
			}
			sysUser.setAuthList(this.moduleService.findModuleUrlList(sysUser));
			session.setAttribute(Constant.SESSION_KEY, sysUser);
			this.userService.saveLoginDate(sysUser);
			return Response.createBySuccess();
		} else {
			return Response.createByErrorCodeMessage(ResponseCode.ERROR.getCode(),"用户不存在或密码错误");
		}
	}



	//loginOut
	@RequestMapping("/loginOut")
	@LogMsg("用户注销")
	public String loginOut(HttpSession session){
		session.removeAttribute(Constant.SESSION_KEY);
		return "redirect:login";

	}


}
