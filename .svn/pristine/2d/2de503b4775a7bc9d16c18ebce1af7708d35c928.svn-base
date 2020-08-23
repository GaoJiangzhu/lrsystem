package cn.nstl.common;

import java.util.ArrayList;
import java.util.List;

public class SearchConfig {

    public static List<SEntity> resoucesMaintainSearch() {
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("title", SearchType.TEXT, "题名"));
        list.add(new SEntity("pissn", SearchType.TEXT, "PISSN"));
        list.add(new SEntity("pisbn", SearchType.TEXT, "PISBN"));
        list.add(new SEntity("eissn", SearchType.TEXT, "EISSN"));
        list.add(new SEntity("eisbn", SearchType.TEXT, "EISBN"));
        list.add(new SEntity("publisher", SearchType.TEXT, "单位"));
        list.add(new SEntity("id", SearchType.TEXT, "唯一订购号"));
        return list;
    }

    public static List<SEntity> arrivalsearch() {
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("organ_name", SearchType.TEXT, "订购单位"));
        return list;
    }

    public interface SearchType{
        String TEXT = "text";
        String DATE = "date";
        String NUMBER = "number";
        String SELECT = "select";
        String SELECT2 = "select2";
        String SELECT3 = "select3";
        String ORGAN = "organ";
    }

    public static List<SEntity> searchOrder() {
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("resLogo.title", "text", "题名"));
        list.add(new SEntity("resLogo.Pissn", "text", "Pissn"));
        list.add(new SEntity("resLogo.Eissn", "text", "Eissn"));
        list.add(new SEntity("resLogo.Pisbn", "text", "Pisbn"));
        list.add(new SEntity("resLogo.Eisbn", "text", "Eisbn"));
        list.add(new SEntity("resLogo.subject", "text", "学科"));
        list.add(new SEntity("param.name", "text", "国别"));
        list.add(new SEntity("resLogo.publisher", "text", "出版社"));
        return list;
    }

    public static List<SEntity> searchOrderYear() {
        List<SEntity> list = searchOrder();
        list.add(new SEntity("orderInfo.order_year", "select2", "开始订购年份"));
        list.add(new SEntity("orderInfo.order_year", "select2", "结束订购年份"));
        list.add(new SEntity("orderInfo.order_status", "select", "订单状态"));
        return list;
    }


    public static List<SEntity> search2Rec(boolean b){
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("title", "text", "题名"));
        list.add(new SEntity("carrier", "text", "载体"));
        list.add(new SEntity("country", "text", "国别"));
        list.add(new SEntity("language", "text", "语种"));
        list.add(new SEntity("publisher", "text", "出版社"));
        list.add(new SEntity("sys_rec.frequency", "text", "总分值"));
        if (b){
            list.add(new SEntity("Pissn", "text", "Pissn"));
            list.add(new SEntity("Eissn", "text", "Eissn"));
            list.add(new SEntity("Pisbn", "text", "Pisbn"));
            list.add(new SEntity("Eisbn", "text", "Eisbn"));
        }
        return list;
    }

    public static List<SEntity> search2Log(){
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("sys_logs.user", SearchType.TEXT, "用户"));
        list.add(new SEntity("sys_logs.type", SearchType.SELECT, "类型"));
        list.add(new SEntity("sys_logs.content", SearchType.TEXT, "内容"));
        list.add(new SEntity("sys_logs.date", SearchType.DATE, "时间"));
        list.add(new SEntity("sys_logs.ip", SearchType.TEXT, "IP"));
        return list;
    }

    public static List<SEntity> search2Role(){
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("sys_role.name", SearchType.TEXT, "角色"));
        list.add(new SEntity("sys_role.userCount", SearchType.NUMBER, "用户数量"));
        return list;
    }
    public static List<SEntity> search2User(){
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("sys_user.username", SearchType.TEXT, "登录名"));
        list.add(new SEntity("sys_user.real_name", SearchType.TEXT, "真实姓名"));
        list.add(new SEntity("sys_user.email", SearchType.TEXT, "邮件地址"));
        list.add(new SEntity("sys_user.isadmin", SearchType.SELECT, "管理员"));
        list.add(new SEntity("sys_user.createdate", SearchType.DATE, "创建时间"));
        list.add(new SEntity("sys_user.organ_id", SearchType.ORGAN, "所属机构"));
        return list;
    }

    public static List<SEntity> item(){
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("eq", "等于"));
        list.add(new SEntity("contain", "包含"));
        list.add(new SEntity("ge", "大于等于"));
        list.add(new SEntity("le", "小于等于"));
        list.add(new SEntity("gt", "大于"));
        list.add(new SEntity("lt", "小于"));
//        list.add(new SEntity("neq", "不等于"));
//        list.add(new SEntity("notcontain", "不包含"));
//        list.add(new SEntity("startwith", "开始于"));
//        list.add(new SEntity("endwith", "结束于"));
        return list;
    }


    static class SEntity{
        private String key;
        private String type;
        private String value;

        public SEntity(String key, String type, String value) {
            this.key = EncrypAES.encrypt(key);
            this.type = type;
            this.value = value;
        }

        public SEntity(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static List<SEntity> recommendSearch(){
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("tri.title", SearchType.TEXT, "题名"));
        list.add(new SEntity("tri.pissn", SearchType.TEXT, "PISSN"));
        list.add(new SEntity("tri.pisbn", SearchType.TEXT, "PISBN"));
        list.add(new SEntity("tri.eissn", SearchType.TEXT, "EISSN"));
        list.add(new SEntity("tri.eisbn", SearchType.TEXT, "EISBN"));
        list.add(new SEntity("so.id", SearchType.ORGAN, "推荐机构"));
        list.add(new SEntity("tri.systime", SearchType.DATE, "推荐时间"));
        return list;
    }

    public static List<SEntity> search2Cover() {
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("t_cover_info.cover_name", SearchType.TEXT, "套名称"));
        list.add(new SEntity("t_cover_info.eissn", SearchType.TEXT, "EISSN"));
        list.add(new SEntity("t_cover_info.pissn", SearchType.TEXT, "PISSN"));
        list.add(new SEntity("t_cover_info.eisbn", SearchType.TEXT, "EISBN"));
        list.add(new SEntity("t_cover_info.pisbn", SearchType.TEXT, "PISBN"));
        list.add(new SEntity("t_cover_info.publisher", SearchType.TEXT, "出版社"));
        list.add(new SEntity("t_cover_info.pub_country", SearchType.SELECT3, "出版国"));
        list.add(new SEntity("t_cover_info.subject", SearchType.SELECT2, "学科"));
        list.add(new SEntity("t_cover_info.language", SearchType.SELECT, "语种"));
        return list;
    }

    public static List<SEntity> search2Corporation() {
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("t_proxy_corporation.proxy_cor_name", SearchType.TEXT, "代理公司"));
        return list;
    }

    public static List<SEntity>  search2Acount() {
        List<SEntity> list = new ArrayList<>();
        list.add(new SEntity("t_acount_num.acount_num", SearchType.TEXT, "户号"));
        list.add(new SEntity("t_proxy_corporation.proxy_cor_name", SearchType.TEXT, "代理公司"));
        list.add(new SEntity("sys_organ.organ_name", SearchType.TEXT, "订购单位"));
        list.add(new SEntity("t_acount_num.mark", SearchType.TEXT, "备注"));
        return list;
    }

}


