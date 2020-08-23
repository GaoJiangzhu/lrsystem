package cn.nstl.service.impl;

import cn.nstl.common.Response;
import cn.nstl.dao.StatisticalDao;
import cn.nstl.entity.Subscriber;
import cn.nstl.service.StatisticalService;
import cn.nstl.utils.DateUtils;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/8/22
 */
@Service
@Transactional
public class StatisticalServiceImpl implements StatisticalService {

    @Autowired
    private StatisticalDao statisticalDao;

    /**
     * 获取部门统计数据
     * */
    @Override
    public Response getSubscriberList(Map<String, Object> map) {

        List sysList = this.statisticalDao.getSubscriberList(map);
        Response response = Response.createBySuccess("操作成功",sysList);
        int count = this.statisticalDao.getSubscriberSum(map);
        response.setRecordsTotal(count);
        response.setRecordsFiltered(count);
        response.setDraw(map.get("draw")==null?0:Integer.valueOf(map.get("draw").toString()));
        return response;
    }

    /**
     * 年度统计
     * */
    @Override
    public Map<String, Object> annualStatistics() {
//        获取资源数量
        int resSum = statisticalDao.getResSum();
//        获取荐购总数
        int recSum = statisticalDao.getRecSum();
//        获取订单总数订单
        int orderSum = statisticalDao.getOrderSum();
//        获取订单金额
        int orderMoney = statisticalDao.getOrderMoney();
//        获取资源每月数量
        Map<String, String> resMSum = statisticalDao.getResMSum();
//        获取荐购每月数量
        Map<String, String> recMSum = statisticalDao.getRecMSum();
//        获取订单每月总数
        Map<String, String> orderMSum = statisticalDao.getOrderMSum();
//        获取订单每月金额
        Map<String,String> orderMMoney = statisticalDao.getOrderMMoney();

        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("title",DateUtils.getYear()+"年年度数据统计" );
        dataMap.put("legend", new String[]{"资源数量","荐购总数","总数订单","订单金额"});
        List series = new ArrayList();
        Map<String,Object> seriesResMSum = getSerise("资源数量",resMSum);
        Map<String,Object> seriesRecMSum = getSerise("荐购总数",recMSum);
        Map<String,Object> seriesOrderMSum = getSerise("总数订单",orderMSum);
        Map<String,Object> seriesOrderMMoney = getSerise("订单金额",orderMMoney);
        series.add(seriesResMSum);
        series.add(seriesRecMSum);
        series.add(seriesOrderMSum);
        series.add(seriesOrderMMoney);
        dataMap.put("series",series);
        dataMap.put("resSum", resSum);
        dataMap.put("recSum", recSum);
        dataMap.put("orderSum", orderSum);
        dataMap.put("orderMoney", orderMoney);
        return dataMap;
    }

    private Map<String, Object> getSerise(String name, Map<String, String> data) {
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("name",name );
        dataMap.put("type", "bar");
        Object dataList = getDataList(data);
        dataMap.put("data",dataList);
        Map markPoint = new HashMap();
        markPoint.put("data",new HashMap<>());
        Map markData = new HashMap();
            List markDataList = new ArrayList();
            Map max = new HashMap();
                max.put("type", "max");
                max.put("name", "年最高");
            Map min = new HashMap();
                min.put("type", "max");
                min.put("name", "年最高");
        markDataList.add(max);
        markDataList.add(min);
            markData.put("data", markDataList);
        dataMap.put("markPoint",markData);
        /*else {
            List list = (List)dataList;

            dataMap.put("markPoint","{ " +
                    "data : " +
                        "[ " +
                            "{name : '年最高', value : 10, xAxis: 7, yAxis: 12, symbolSize:18}, " +
                            "{name : '年最低', value : 3 xAxis: 11, yAxis: 3} " +
                        "] " +
                    "}");
        }*/

        /*{
            name:'订单数量',
                    type:'bar',
                data:[26, 59, 60, 264, 287, 77, 176, 122, 247, 148, 60, 23],
            markPoint : {
                data : [
                {name : '年最高', value : 172, xAxis: 7, yAxis: 172, symbolSize:18},
                {name : '年最低', value : 23, xAxis: 11, yAxis: 3}
                            ]
            },

        }*/
        return dataMap;
    }

    private Object getDataList(Map<String, String> data) {
        return new int[]{
                data.get("01")==null?0:Integer.valueOf(data.get("01")),
                data.get("02")==null?0:Integer.valueOf(data.get("02")),
                data.get("03")==null?0:Integer.valueOf(data.get("03")),
                data.get("04")==null?0:Integer.valueOf(data.get("04")),
                data.get("05")==null?0:Integer.valueOf(data.get("05")),
                data.get("06")==null?0:Integer.valueOf(data.get("06")),
                data.get("07")==null?0:Integer.valueOf(data.get("07")),
                data.get("08")==null?0:Integer.valueOf(data.get("08")),
                data.get("09")==null?0:Integer.valueOf(data.get("09")),
                data.get("10")==null?0:Integer.valueOf(data.get("10")),
                data.get("11")==null?0:Integer.valueOf(data.get("11")),
                data.get("12")==null?0:Integer.valueOf(data.get("12")),
        };
    }

}
