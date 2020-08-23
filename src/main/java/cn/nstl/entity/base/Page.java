package cn.nstl.entity.base;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2018/6/29 15:29
 **/
public class Page implements Serializable{

    //总页数
    @Transient
    public int total = 0;
    //下一页
    @Transient
    public int page = 0;
    //每页显示总数
    @Transient
    public int records = 10;
    @Transient
    public int rows = 10;
    @Transient
    public int start = 0;
    @Transient
    public int length = 10;
    @Transient
    public int recordsTotal;
    @Transient
    public int draw;

    @Transient
    public String params;

    @Transient
    public String order;
    @Transient
    public String sort;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
