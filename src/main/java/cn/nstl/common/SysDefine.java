package cn.nstl.common;

import cn.nstl.utils.DateUtils;

import java.util.LinkedHashMap;
import java.util.Map;

public class SysDefine {
    public static String PROMPT_YES = "1";
    public static String PROMPT_NO = "0";
    public static String PROMPT_STRING = "promot";

    /**
     * 菜单模块数据字典
     */
    public interface SysModule{
        int FIRST_LEVEL = 1;
        int SECOND_LEVEL = 2;
        int THIRD_LEVEL = 3;

        String CHECKED_YES = "1";
        String CHECKED_NO = "0";
        //荐购初审审核
        String RECOMMENT_FIRSTTRIAL = "/resourceRecommend/oneTrial";
        //荐购复审审核
        String RECOMMENT_TWOTRIAL = "/resourceRecommend/twoTrial";
        //荐购遴选
        String RECOMMENT_DISTUNIT = "/selection/dist_unit";
        /**
         * 审核分配
         */
        //同意
        String SELECTION_AGREE = "/selection/assignAgree";
        //驳回
        String SELECTION_REFUSE = "/selection/assignRefuse";

        /**
         * 订购审核
         */
        //同意
        String ORDER_AGREE = "/orderManagement/orderAuditAgree";
        //驳回
        String ORDER_REFUSE = "/orderManagement/orderAuditRefuse";


    }

    /**
     * 用户模块数据字典
     */
    public interface SysUser{
        /**
         * 是管理员
         */
        String ISADMIN_SUPER = "1";
        /**
         * 普通管理员
         */
        String ISADMIN_DEPT = "2";
        /**
         * 普通用户
         */
        String ISADMIN_NORMAL = "3";

        /**
         * 可用
         */
        int STATUS_YES = 1;
        /**
         * 不可用
         */
        int STATUS_NO = 0;

        String INITIAL_PWD = "123456";

        Map<String,String> USER_DATE_MAP = new LinkedHashMap<String,String>(){
            {
                put(ISADMIN_SUPER, "超级管理员");
                put(ISADMIN_DEPT, "部门管理员");
                put(ISADMIN_NORMAL, "普通用户");
            }
        };

    }

    /**
     * 角色管理
     */
    public interface SysRole{

        /**
         * 可用
         */
        int STATUS_YES = 1;
        /**
         * 不可用
         */
        int STATUS_NO = 0;
    }

    /**
     * 数据字典参数管理
     */
    public interface SysParam{
        Integer LEVEL_0 = 1;//一级
        Integer LEVEL_1 = 2;//二级
        Integer LEVEL_2 = 3;//三级

        String IS_DEL_YES = "1";//已删除
        String IS_DEL_NO = "0";//未删除

        String SUBJECT = "C002";
        String LANGUAGE = "language";
        String COUNTRY = "country";

        Integer SCORE_DEFAULT = 0;
        Integer WEIGHT_DEFAULT = 1;
    }

    /**
     * 组织架构字典项
     */
    public interface SysOrgan{
        String ROOT = "0";
    }

    /**
     * Log日志管理数据字典
     */
    public interface SysLog{
        //成功
        String OPT_SUCCESS = "1";
        //失败
        String OPT_ERROR = "0";

        String LOGIN = "LOGIN";
        String LOGINOUT = "LOGINOUT";
        String ADD = "ADD";
        String MODIFY = "MODIFY";
        String DELETE = "DELETE";
        Map<String,String> LOG_TYPE_MAP = new LinkedHashMap<String,String>(){
            {
                put(OPT_SUCCESS, "成功");
                put(OPT_ERROR, "失败");
            }
        };
    }

    /**
     * 荐购遴选 - 数据字典
     * */
    public interface SysRecommended {
        //审核状态(0:待审核1:初审通过2:初审未通过3:复审通过4:复审未通过)
        /**
         * 待审核
         */
        String STATUS_AUDITING = "0";
        /**
         * 初审通过
         */
        String STATUS_FIRSTTRAIL_AGREE = "1";
        /**
         *初审未通过
         */
        String STATUS_FIRSTTRAIL_REFUSE = "2";
        /**
         *复审通过
         */
        String STATUS_TWOTRAIL_AGREE = "3";
        /**
         *复审未通过
         */
        String STATUS_TWOTRAIL_REFUSE = "4";
        Map<String,String> REC_TYPE_MAP = new LinkedHashMap<String,String>(){
            {
                put("", "");
            }
        };
    }

    /**
     * 荐购分配 - 数据字典
     * */
    public interface SysSelection {
        /**
         * 未分配
         */
        String STATUS_DISTRIBUTE_NO = "1";
        /**
         * 已分配
         */
        String STATUS_DISTRIBUTE_YES = "2";
        /**
         * 审核通过
         */
        String STATUS_AUDITING_AGREE= "3";
        /**
         * 审核驳回
         */
        String STATUS_AUDITING_REFUSE = "4";
        /**
         * 审核订单驳回
         */
        String STATUS_ORDER_NO= "5";
    }


    /**
     * 荐购分配 - 数据字典
     * */
    public interface SysReview {
        /**
         * 待审核
         */
        String STATUS_REVIEW_NO = "1";
        /**
         * 资源正常
         */
        String STATUS_REVIEW_YES = "0";
    }

    /**
     * 订单管理 - 数据字典
     * */
    public interface SysOrder {
        //审核状态 0待审核 1通过 2驳回
        //订购状态0未订购1已订购2停订3续订4驳回
        /**
         * 0待审核
         */
        String STATUS_ORDER_NO = "0";
        /**
         *1通过
         */
        String STATUS_ORDER_YES = "1";
        /**
         *2驳回
         */
        String STATUS_ORDER_PAUSE = "2";
        String STATUS_ORDER_GOON = "3";
        String STATUS_ORDER_REFUSE = "4";

    }

    /**
     * 续订停订
     * */
    public interface SysOrderStatus {
        //状态描述 1 获取续订停订数据 0 获取订购审核数据
        /**
         * 0 获取订购审核数据
         */
        String STATUS_ORDER_ZIZE = "0";
        /**
         *1 获取续订停订数据
         */
        String STATUS_ORDER_ONE = "1";
    }

    /**
     * 年度订单 - 数据字典
     * */
    public interface SysAnnualOrder {
        Map<String,String> ANO_TYPE_MAP = new LinkedHashMap<String,String>(){
            {
                put("0", "未订购");
                put("1", "已订购");
                put("2", "停订");
                put("3", "续订");
                put("4", "驳回");
            }
        };
        Map<String,String> YEAR_TYPE_MAP = new LinkedHashMap<String,String>(){
            {
                int year = DateUtils.getYear();
                System.out.println(year);
                for (int i = 0 ; i < 5 ;  i++){
                    put(String.valueOf(year-i), String.valueOf(year-i));
                }
            }
        };
    }

    public interface SysCover{
        String ISDEL_YES = "1";
        String ISDEL_NO = "0";
    }


    public interface SysResourceRecommend{
        /**
         * 待审核
         */
        String  FLOW_STATUS_DSH="0";
        /**
         * 初审通过
         */
        String  FLOW_STATUS_CSTG="1";
        /**
         * 初审未通过
         */
        String  FLOW_STATUS_CSWTG="2";
        /**
         * 复审通过
         */
        String  FLOW_STATUS_FSTG="3";
        /**
         * 复审未通过
         */
        String  FLOW_STATUS_FSWTG="4";
        /**
         * 未参加审核
         */
        String  FLOW_STATUS_WCJSH="5";
    }
}
