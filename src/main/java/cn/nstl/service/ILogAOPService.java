package cn.nstl.service;

import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/11
 */
public interface ILogAOPService {
//    添加日志
    void addLog(String type, Map<String, Object> dataMap) throws Exception;
}
