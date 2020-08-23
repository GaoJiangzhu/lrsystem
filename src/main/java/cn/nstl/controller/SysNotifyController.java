package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.controller.base.BaseController;
import cn.nstl.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notify")
public class SysNotifyController extends BaseController {


    @Autowired
    private NotifyService notifyService;

    @RequestMapping("data")
    public Response data(){
        return this.notifyService.findByUserId(Constant.getSysUser(request));
    }
}
