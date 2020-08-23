package cn.nstl.dao;

import java.util.List;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/8/22
 */
public interface StatisticalDao {

    List getSubscriberList(Map<String, Object> map);

    int getSubscriberSum(Map<String, Object> map);

    int getResSum();

    Map<String, String> getResMSum();

    int getRecSum();

    Map<String,String> getRecMSum();

    int getOrderSum();

    int getOrderMoney();

    Map<String,String> getOrderMSum();

    Map<String,String> getOrderMMoney();
}
