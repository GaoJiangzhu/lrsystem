package cn.nstl.controller;

import cn.nstl.common.Constant;
import cn.nstl.common.Response;
import cn.nstl.common.SearchConfig;
import cn.nstl.controller.base.BaseController;
import cn.nstl.entity.*;
import cn.nstl.service.ParamService;
import cn.nstl.service.ResourceRecommendService;

import cn.nstl.utils.ExcelUtil;
import org.apache.commons.lang3.StringUtils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


@Controller
@RequestMapping("resourceRecommend")
public class ResourceRecommendController extends BaseController {
    private static String BASE_PATH = "resourceRecommend/";

    private  List<Object> infoList;

    @Autowired
    private ResourceRecommendService resourceRecommendService;

    @Autowired
    private ParamService paramService;
    /**
     *资源荐购列表页
     */
    @RequestMapping("list")
    public String index(Model model){
        model.addAttribute("search", SearchConfig.recommendSearch());
        model.addAttribute("items", SearchConfig.item());
        return BASE_PATH + "list";
    }

    /**
     * 获得荐购初审列表数据
     */
    @RequestMapping("findList")
    @ResponseBody
    public Response findList(){
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = Constant.getParams(request);
        return this.resourceRecommendService.findList(map,sysUser);
    }

    /**
     *新增资源荐购
     */
    @RequestMapping("add")
    public String add(){
        return BASE_PATH + "add";
    }

    /**
     *批量资源荐购
     */
    @RequestMapping("batchAdd")
    public String batchAdd(){
        return BASE_PATH + "batchAdd";
    }
    /**
     * 跳转荐购初审列表
     */
    @RequestMapping("firstTrial")
    public String firstTrial(Model model){
        model.addAttribute("search", SearchConfig.recommendSearch());
        model.addAttribute("items", SearchConfig.item());
        return BASE_PATH + "firstTrial";
    }

    /**
     * 获得荐购初审列表数据
     */
    @RequestMapping("firstTring")
    @ResponseBody
    public Response firstTring(){
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = Constant.getParams(request);
        return this.resourceRecommendService.findFristTrialList(map,sysUser);
    }

    /**
     * 荐购复审列表
     */
    @RequestMapping("secondTrial")
    public String secondTrial(Model model){
        model.addAttribute("search", SearchConfig.recommendSearch());
        model.addAttribute("items", SearchConfig.item());
        return BASE_PATH + "secondTrial";
    }


    /**
     * 获得荐购初审列表数据
     */
    @RequestMapping("secondTring")
    @ResponseBody
    public Response secondTring(){
        SysUser sysUser = Constant.getSysUser(request);
        Map<String, Object> map = Constant.getParams(request);
        return this.resourceRecommendService.FindSecondTrialList(map,sysUser);
    }
    /**
     * 单条荐购
     */
    @RequestMapping("singleAdd")
    public String singleAdd(){
        return BASE_PATH + "singleAdd";
    }


    /**
     * 查看详情
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("information")
    public String information(Model model,
                              @RequestParam(value = "id", required = false,defaultValue = "") String id,
                              @RequestParam(value = "type", required = false,defaultValue = "")String type) {
        if(StringUtils.isNotBlank(id)){
            SysResourceInfo sysResourceInfo=resourceRecommendService.findResourceInfo(id);
            model.addAttribute("info", sysResourceInfo);
            model.addAttribute("type", type);
        }else{
            model.addAttribute("info", new SysResourceInfo());
            model.addAttribute("type", type);
        }

        return BASE_PATH + "information";
    }


    /**
     * 荐购初审
     * @param isTrial
     * @param trialOpinion
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("oneTrial")
    public Response oneTrial(@RequestParam("isTrial") String isTrial,
                             @RequestParam("trialOpinion") String trialOpinion,
                             @RequestParam("ids") String ids){
        SysUser sysUser = Constant.getSysUser(request);
        return this.resourceRecommendService.oneTrial(isTrial,trialOpinion,ids,sysUser);
    }


    /**
     * 荐购复审
     * @param isTrial
     * @param trialOpinion
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("twoTrial")
    public Response twoTrial(@RequestParam("isTrial") String isTrial,
                             @RequestParam("trialOpinion") String trialOpinion,
                             @RequestParam("ids") String ids){
        SysUser sysUser = Constant.getSysUser(request);
        return this.resourceRecommendService.twoTrial(isTrial,trialOpinion,ids,sysUser);
    }


    /**
     * 单条查重
     * @param matching
     * @param title
     * @param pissn
     * @param pisbn
     * @param eissn
     * @param eisbn
     * @return
     */
    @ResponseBody
    @RequestMapping("findRepetition")
    public Response findRepetition(@RequestParam(value = "matching") String matching,
                                   @RequestParam(value = "title") String title,
                                   @RequestParam(value = "pissn") String pissn,
                                   @RequestParam(value = "pisbn") String pisbn,
                                   @RequestParam(value = "eissn") String eissn,
                                   @RequestParam(value = "eisbn") String eisbn){
         return this.resourceRecommendService.findRepetition(matching,title,pissn,pisbn,eissn,eisbn);
    }


    /**
     * 获取下拉框选项
     * @return
     */
    @ResponseBody
    @RequestMapping("getOptionValue")
    public Response getOptionValue(){
        return this.paramService.getOptionValue();
    }

    /**
     * 获取下拉框选项
     * @return
     */
    @ResponseBody
    @RequestMapping("getAuditOpinion")
    public Response getAuditOpinion(){
        return this.paramService.getAuditOpinion();
    }

    /**
     * 单条保存
     * @param sysResourceInfo
     * @param sysResourceRecommend
     * @return
     */
    @ResponseBody
    @RequestMapping("save")
    public Response save(SysResourceInfo sysResourceInfo, SysResourceRecommend sysResourceRecommend,SysResourceLog sysResourceLog){
        SysUser user = Constant.getSysUser(request);
        int num = resourceRecommendService.validateCode(sysResourceInfo);
        if(num!=0){
            return Response.createByErrorMessage("荐购信息已存在");
        }else{
             return this.resourceRecommendService.save(sysResourceInfo,sysResourceRecommend, sysResourceLog,user);
        }
    }

    /**
     * 批量查重报告页面
     * @return
     */
    @RequestMapping("repetition")
    public String repetition(){
        return BASE_PATH + "repetition";
    }

    /**
     * 上传浏览
     * @return
     */
    @RequestMapping("preview")
    public String preview(Model model){
        model.addAttribute("info",this.infoList );
        return BASE_PATH + "preview";
    }



//    @ResponseBody
//    @RequestMapping("readExcel")
//    public Response readExcel(@RequestParam(value="excelFile") MultipartFile file) throws Exception{
//        if (StringUtils.isBlank(file)){
//            Response.createByErrorMessage("请上传文件");
//        }
//
//        List<Object> infoList = ExcelUtil.getUplodExcelData(file, SysResourceInfo.class, getInfoMap());
//
//        HashMap map =new HashMap();
//        map.put("infoList",infoList);
//        if(this.infoList!=null){ this.infoList.clear();}
//        this.infoList=infoList;
//        return Response.createBySuccess("上传成功",map);
//    }

    /**
     * 批量上传
     * @param path
     * @return
     * @throws Exception
     */
    @RequestMapping("batchExcel")
    @ResponseBody
    public Response batchExcel(@RequestParam(value = "uploadpath") String path) throws Exception{
        if (StringUtils.isBlank(path)){
            Response.createByErrorMessage("请上传文件");
        }
        List<Object> infoList = ExcelUtil.getExcelData(path, SysResourceInfo.class, getInfoMap());
        HashMap map =new HashMap();
        map.put("infoList",infoList);
        if(this.infoList!=null){ this.infoList.clear();}
        this.infoList=infoList;
        return Response.createBySuccess("上传成功",map);
    }


    /**
     * 批量查重
     * @return
     */
    @RequestMapping("batchRepetition")
    @ResponseBody
    public Response batchRepetition(){
        return this.resourceRecommendService.batchRepetition(this.infoList);
    }

    /**
     * 批量新增
     * @return
     */
    @RequestMapping("batchSave")
    @ResponseBody
    public Response batchSave(){

        SysUser user = Constant.getSysUser(request);

        return this.resourceRecommendService.batchSave(this.infoList,user);

    }

    /**
     * 加入审核
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("addTring")
    public Response addTring( @RequestParam("ids") String ids){
        return this.resourceRecommendService.addTring(ids);
    }


    public Map getInfoMap(){
        HashMap map = new HashMap();
        map.put("题名","title");
        map.put("title","String");
        map.put("其他题名","otherTitle");
        map.put("otherTitle","String");
//        map.put("分辑号","seriesNumber");
//        map.put("seriesNumber","String");
//        map.put("分辑名","seriesTitle");
//        map.put("seriesTitle","String");
        map.put("责任者","author");
        map.put("author","String");
        map.put("PISSN","pissn");
        map.put("pissn","String");
        map.put("EISSN","eissn");
        map.put("eissn","String");
        map.put("PISBN","pisbn");
        map.put("pisbn","String");
        map.put("EISBN","eisbn");
        map.put("eisbn","String");
        map.put("套","coverId");
        map.put("coverId","String");
//        map.put("种类","kindId");
//        map.put("kindId","String");
        map.put("卷期","coilingPeriod");
        map.put("coilingPeriod","String");
        map.put("学科","subject");
        map.put("subject","String");
        map.put("出版社","publisher");
        map.put("publisher","String");
        map.put("国别","country");
        map.put("country","String");
        map.put("出版年","pubYear");
        map.put("pubYear","String");
        map.put("创刊年","foundedYear");
        map.put("foundedYear","String");
        map.put("语种","language");
        map.put("language","String");
        map.put("出版频率","pubFeq");
        map.put("pubFeq","String");
        map.put("内容简介","Intro");
        map.put("Intro","String");
//        map.put("分类号","classiNumber");
//        map.put("classiNumber","String");
        map.put("期刊URL地址","url");
        map.put("url","String");
        map.put("载体","carrier");
        map.put("carrier","String");
        map.put("文献类型","type");
        map.put("type","String");
        map.put("出版模式","pubPattern");
        map.put("pubPattern","String");
        map.put("出版状态","pubStatus");
        map.put("pubStatus","String");
        return map;
    }

    /**
     * 获取下拉框选项
     * @return
     */
    @ResponseBody
    @RequestMapping("findCover")
    public List<SysCover> findCover(){
        return this.resourceRecommendService.getCoverList();
    }
}
