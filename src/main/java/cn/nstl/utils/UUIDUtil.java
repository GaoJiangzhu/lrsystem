package cn.nstl.utils;

import java.util.UUID;

public class UUIDUtil {

    /**
     * 获得一个UUID
     * @return String UUID
     */
    public static synchronized String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(UUIDUtil.getUUID());
    }
}
