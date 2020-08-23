package cn.nstl.controller;

import cn.nstl.common.*;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.SysOrgan;
import cn.nstl.entity.SysRole;
import cn.nstl.entity.SysUser;
import cn.nstl.service.OrganService;
import cn.nstl.service.RoleService;
import cn.nstl.service.UserService;
import cn.nstl.utils.ExcelUtil;
import cn.nstl.utils.Md5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 用户管理 控制器
 * @author liuhaiyuan
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {


    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private OrganService organService;

    private static String BATH_PATH = "user/";

    /**
     * 跳转用户管理列表页面
     * @param promot 添加或编辑用户跳转到列表页面时的成功提示状态
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String list(@RequestParam(value = "promot", required = false,defaultValue = "0") String promot,
                       Model model){
        model.addAttribute(SysDefine.PROMPT_STRING, promot);
        model.addAttribute("type",SysDefine.SysUser.USER_DATE_MAP);
        model.addAttribute("search", SearchConfig.search2User());
        model.addAttribute("items", SearchConfig.item());
        return BATH_PATH + "list";
    }


    /**
     * 获取用户列表的数据
     * @return
     */
    @RequestMapping("data")
    @ResponseBody
    public Response data(){
        Map<String, Object > map = Constant.getParams(request);
        return this.userService.findUserList(map, Constant.getSysUser(request));
    }

    /**
     * 跳转到用户列表的新增和编辑页面
     * @param model
     * @param id 用户id
     * @return
     */
    @RequestMapping("add")
    public String add(Model model,@RequestParam(value = "id", required = false,defaultValue = "") String id){
        if (StringUtils.isNotBlank(id)){
            SysUser sysUser = userService.findOne(id);

            if (StringUtils.isNotBlank(sysUser.getOrganId())){
                SysOrgan sysOrgan = this.organService.findById(sysUser.getOrganId());
                if (sysOrgan == null){
                    sysUser.setOrganId(StringUtils.EMPTY);
                }else{
                    sysUser.setOrganName(sysOrgan.getName());
                }
            }
            model.addAttribute("user", sysUser);
            List<SysRole> roleList = this.roleService.findRolesByUserId(id);
            model.addAttribute("roles", JSONSerializer.serialize(roleList));
        }else {
            model.addAttribute("user", new SysUser());
            model.addAttribute("roles", "");
        }
        model.addAttribute("roleList", this.roleService.findAll());
        return BATH_PATH + "add";
    }

    @RequestMapping("test")
    public String test(Model model,@RequestParam(value = "id", required = false) String id){
        if (StringUtils.isNotBlank(id)){
            SysUser sysUser = userService.findOne(id);
            model.addAttribute("user", sysUser);
            List<SysRole> roleList = this.roleService.findRolesByUserId(id);
            model.addAttribute("roles", JSONSerializer.serialize(roleList));
        }else {
            model.addAttribute("user", new SysUser());
        }

        model.addAttribute("roleList", this.roleService.findAll());
        return BATH_PATH + "test";
    }

    /**
     * 用户保存功能
     * @param sysUser 用户对象
     * @return
     */
    @ResponseBody
    @RequestMapping("save")
    public Response save(SysUser sysUser){
        SysUser user = Constant.getSysUser(request);
        return this.userService.save(sysUser, user);
    }

    /**
     * 用户(批量)删除功能
     * @param sysUser 用户的id以","间隔
     * @return
     */
    @ResponseBody
    @RequestMapping("del")
    public Response del(SysUser sysUser){
        return this.userService.del(sysUser);
    }

    /**
     * 重置密码
     * @param sysUser 用户id
     * @return
     */
    @ResponseBody
    @RequestMapping("reset")
    public Response reset(SysUser sysUser){
        return this.userService.reset(sysUser);
    }

    @RequestMapping("upload")
    public String upload(){
        return BATH_PATH+"upload2";
    }

    @RequestMapping("upload3")
    public String upload3(){
        return BATH_PATH+"upload3";
    }

    @RequestMapping("submit")
    @ResponseBody
    public Response submit(String path) throws Exception{
        if (StringUtils.isBlank(path)){
            Response.createByErrorMessage("请上传文件");
        }
        Map<String , String > map = new HashMap<>();
        map.put("用户名", "username");
        map.put("username", "String");
        List<Object> list = ExcelUtil.getExcelData(path, SysUser.class, map);
        for (Object user:list) {
            SysUser u = (SysUser)user;
        }
        return Response.createBySuccess();
    }


    @RequestMapping("updatePwd")
    @ResponseBody
    public Response updatePwd(String oldPwd, String newPwd, String confirmPwd) throws Exception{
        SysUser sysUser = Constant.getSysUser(request);
        SysUser one = this.userService.findOne(sysUser.getId());
        if (!StringUtils.equals(one.getPassword(), Md5Util.getMd5(oldPwd))){
            return Response.createByErrorMessage("旧密码错误");
        }
        if (!StringUtils.equals(newPwd, confirmPwd)){
            return Response.createByErrorMessage("确认密码不正确");
        }
        return this.userService.updatePwd(sysUser.getId(), newPwd);
    }
}

