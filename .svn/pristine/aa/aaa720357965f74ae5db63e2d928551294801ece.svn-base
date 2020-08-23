package cn.nstl.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by geely
 */
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
//保证序列化json的时候,如果是null的对象,key也会消失
public class Response<T> implements Serializable {

    private int status;
    private String msg;
    private T aaData;
    private T data1;
    //总页数
    @Transient
    private int total = 0;
    //下一页
    @Transient
    private int page = 0;
    //每页显示总数
    @Transient
    private int records = 10;
    @Transient
    private int recordsTotal;

    private int recordsFiltered;
    private int draw;


    private Response(int status){
        this.status = status;
    }
    private Response(int status, T aaData){
        this.status = status;
        this.aaData = aaData;
    }

    private Response(int status, String msg, T aaData){
        this.status = status;
        this.msg = msg;
        this.aaData = aaData;
    }

    private Response(int status, String msg, T aaData, T data1){
        this.status = status;
        this.msg = msg;
        this.aaData = aaData;
        this.data1 = data1;
    }

    private Response(int status, String msg){
        this.status = status;
        this.msg = msg;
    }

    @JsonIgnore
    //使之不在json序列化结果当中
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public int getStatus(){
        return status;
    }
    public T getAaData(){
        return aaData;
    }
    public String getMsg(){
        return msg;
    }
    public T getData1(){
        return data1;
    }

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

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public static <T> Response<T> createBySuccess(){
        return new Response<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> Response<T> createBySuccessMessage(String msg){
        return new Response<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> Response<T> createBySuccess(T aaData){
        return new Response<T>(ResponseCode.SUCCESS.getCode(),aaData);
    }

    public static <T> Response<T> createBySuccess(String msg, T aaData){
        return new Response<T>(ResponseCode.SUCCESS.getCode(),msg,aaData);
    }

    public static <T> Response<T> createBySuccess(String msg, T aaData, T data1){
        return new Response<T>(ResponseCode.SUCCESS.getCode(),msg,aaData, data1);
    }

    public static <T> Response<T> createByError(){
        return new Response<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }


    public static <T> Response<T> createByErrorMessage(String errorMessage){
        return new Response<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    public static <T> Response<T> createByErrorCodeMessage(int errorCode, String errorMessage){
        return new Response<T>(errorCode,errorMessage);
    }
}