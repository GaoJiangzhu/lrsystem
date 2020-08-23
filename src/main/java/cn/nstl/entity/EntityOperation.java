package cn.nstl.entity;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.Column;
import javax.persistence.Table;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/8/20
 */
public class EntityOperation {

    private static Logger logger = Logger.getLogger(EntityOperation.class);

    public int update(JdbcTemplate jdbcTemplate){
        Map<String, Object> updSql = getUpdSql();
        return jdbcTemplate.update(updSql.get("sql").toString(),(String[])updSql.get("data"));
    }

    /**
     * 获取修改Sql语句
     * */
    public Map<String, Object> getUpdSql(){
        Table annotation1 = getClass().getAnnotation(Table.class);
//        定义前置sql
        StringBuffer updSql = new StringBuffer("UPDATE `"+annotation1.name()+"` SET ");
//        定义注入数组
        String[] data = new String[]{};
//        定义sql数据状态 默认 false 若数据有值这变为 true
        boolean sqlStatus = false;
        try {
            //获取属性
            Field[] declaredFields = getClass().getDeclaredFields();
            for (Field field : declaredFields) {
//                获取属性注解
                Column annotation = field.getAnnotation(Column.class);
                if (annotation == null)
                    continue;
//                获取注解内值
                String annotationName = annotation.name();
//                获取属性值
                String attributesVale = getFieldValueByName(field.getName());
//                属性不为空 进行 sql拼接
                if (StringUtils.isNotEmpty(annotationName) && StringUtils.isNotEmpty(attributesVale)){
                    updSql.append(annotationName+"=?,");
                    data = attrExpand(data,attributesVale);
                    sqlStatus = true;
                }
            }
            if (sqlStatus){
                String substring = updSql.substring(0, updSql.length() - 1) + " WHERE `id`= ?";
                data = attrExpand(data,getFieldValueByName("id"));
                Map<String,Object> dataMap = new HashMap<>();
                dataMap.put("sql",substring);
                dataMap.put("data",data );
                return dataMap;
            }
            else
                return null;
        }catch (Exception e){

            return null;
        }
    }

    /**
     * 获取属性值
     * */
    private String getFieldValueByName(String fieldName) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(this, new Object[] {});
            return value==null?"":value.toString();
        } catch (Exception e) {
            System.out.println(e);
            return "";
        }
    }

//    数组扩容并赋值
    private String[] attrExpand(String[] data,String value){
        String[] data1 = new String[data.length+1];
        for (int i = 0 ; i < data.length ; i++) {
            data1[i] = data[i];
        }
        data1[data.length] = value;
        return data1;
    }


}
