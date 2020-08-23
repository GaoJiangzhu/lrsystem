package cn.nstl.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtil {

    private static Properties props;

    static {
        String fileName = "params.properties";
        props = new Properties();
        try {
            props.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final String UPLOAD_PATH = props.getProperty("upload.path");


    public static String getProperty(String key){
        String value = props.getProperty(key);
        if (StringUtils.isBlank(value))
            return null;
        return value;
    }

    public static  String getProperty(String key, String defaultValue){
        String value = props.getProperty(key);
        if (StringUtils.isBlank(value))
            return defaultValue;
        return value;
    }
}
