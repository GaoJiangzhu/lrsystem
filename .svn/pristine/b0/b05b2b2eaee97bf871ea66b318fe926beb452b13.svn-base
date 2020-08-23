package cn.nstl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("database")
public class DatabaseController {

    private static String BASE_PATH = "database/";
    @RequestMapping("list")
    public String index(){
        return BASE_PATH + "list";
    }

    /*
        数据库管理列表添加
     */
    @RequestMapping("add")
    public String add(){
        return BASE_PATH + "form-elements";
    }

    /*
        数据库管理列表页
     */
    @RequestMapping("grid")
    public String grid(){
        return BASE_PATH + "jqgrid";
    }

    /*
        数据库收录品种管理列表
     */
    @RequestMapping("varietyManagementList")
    public String varietyManagementList(){
        return BASE_PATH + "varietyManagementList";
    }


    /*
        数据库订购管理列表
     */
    @RequestMapping("orderManagementList")
    public String orderManagementList(){
        return BASE_PATH + "orderManagementList";
    }


    /*
       数据库附加文档管理列表
     */
    @RequestMapping("additionalDocumentManagementList")
    public String additionalDocumentManagementList(){
        return BASE_PATH + "additionalDocumentManagementList";
    }

}
