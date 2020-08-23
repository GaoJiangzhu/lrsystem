package cn.nstl.common;

import cn.nstl.entity.SysUser;
import cn.nstl.entity.vo.SearchParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constant<T> {

    public static String SESSION_KEY = "CURRENT_USER";
    public static String AUTH_KEY = "CURRENT_USER_AUTH";


    public static SysUser getSysUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        SysUser sysUser = (SysUser)session.getAttribute(Constant.SESSION_KEY);
        return sysUser;
    }

    public static Map<String, String> getUserAuth(HttpServletRequest request){
        HttpSession session = request.getSession();
        return (Map<String, String>)session.getAttribute(Constant.AUTH_KEY);
    }

    public static String parse2Params(String params){
        JSONArray param = JSON.parseArray(params);
        StringBuffer sb = new StringBuffer();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < param.size(); i++) {
            String[] obj = param.getString(i).split("-", 3);
            String key = EncrypAES.dencrypt(obj[0]);
            if (map.containsKey(key)){
                map.put(key, map.get(key) + " or " + key + parseItem(obj));
            }else{
                map.put(key, key + parseItem(obj));
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(" and ("+entry.getValue()+") ");
        }
        return sb.toString();
    }


    public static String parseItem(String[] obj){
        switch (obj[1]){
            case "gt":
                return " > '" + obj[2] + "' ";
            case "lt":
                return " < '" + obj[2] + "' ";
            case "eq":
                return " = '" + obj[2] + "' ";
            case "neq":
                return " != '" + obj[2] + "' ";
            case "ge":
                return " >= '" + obj[2] + "' ";
            case "le":
                return " <= '" + obj[2] + "' ";
            case "contain":
                return " like '%" + obj[2] + "%' ";
            case "notcontain":
                return " not like '%" + obj[2] + "%' ";
            case "startwith":
                return " like '" + obj[2] + "%' ";
            case "endwith":
                return " like '%" + obj[2] + "' ";
            default:
                return " ";
        }
    }

    public static Map<String,Object> getParams(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String ele = parameterNames.nextElement();
            if ("start".equals(ele)){
                String start = request.getParameter(ele);
                map.put(ele, start);
                continue;
            }
            if ("length".equals(ele)){
                String length = request.getParameter(ele);
                map.put(ele, length);
                continue;
            }
            if ("draw".equals(ele)){
                String draw = request.getParameter(ele);
                map.put(ele, draw);
                continue;
            }
            if ("params".equals(ele)){
                String params = request.getParameter(ele);
                map.put(ele, params);
                continue;
            }
            if ("order[0][column]".equals(ele)){
                String order = request.getParameter(ele);//排序的列号
                String orderDir = request.getParameter("order[0][dir]");//排序的顺序asc or desc
                String orderColumn = request.getParameter("columns["+order+"][data]");
                map.put("order", orderColumn);
                map.put("orderBy", orderDir);
                continue;
            }
        }
        map.put("start",map.get("start")==null?0:map.get("start"));
        map.put("length",map.get("length")==null?10:map.get("length"));
        return map;
    }

    public static SearchParams parse2Params2(String params, List<Object> objects) {
        JSONArray param = JSON.parseArray(params);
        StringBuffer sb = new StringBuffer();

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < param.size(); i++) {
            String[] obj = param.getString(i).split("-", 3);
            String key = EncrypAES.dencrypt(obj[0]);
            if (map.containsKey(key)){
                map.put(key, map.get(key) + " or " + key + parseItem2(obj, objects));
            }else{
                map.put(key, key + parseItem2(obj, objects));
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(" and ("+entry.getValue()+") ");
        }

        return new SearchParams(sb.toString(),objects);
    }

    public static String parseItem2(String[] obj, List<Object> objects){
        switch (obj[1]){
            case "gt":
                objects.add(obj[2]);
                return " > ? ";
            case "lt":
                objects.add(obj[2]);
                return " < ? ";
            case "eq":
                objects.add(obj[2]);
                return " = ? ";
            case "neq":
                objects.add(obj[2]);
                return " != ? ";
            case "ge":
                objects.add(obj[2]);
                return " >= ? ";
            case "le":
                objects.add(obj[2]);
                return " <= ? ";
            case "contain":
                objects.add("%"+obj[2]+"%");
                return " like ? ";
            case "notcontain":
                objects.add("%"+obj[2]+"%");
                return " not like ? ";
            case "startwith":
                objects.add(obj[2]+"%");
                return " like ? ";
            case "endwith":
                objects.add("%"+obj[2]);
                return " like ? ";
            default:
                return " ";
        }
    }

    public static Map<String, Object> transferList2Map(List<Map<String, Object>> listmap){
        Map<String, Object> map = new HashMap<>();
        for (Map<String, Object> item : listmap){
            map.put(item.get("id").toString(), item.get("name"));
        }
        return map;
    }
}
