package cn.nstl.service;

import cn.nstl.common.Response;
import cn.nstl.entity.Subscriber;

import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/8/22
 */
public interface StatisticalService {

    /**
     * 获取部门统计数据
     * */
    Response getSubscriberList(Map<String, Object> map);

    /**
     * 年度统计
     * */
    Map<String,Object> annualStatistics();
}
