package cn.nstl.entity;

import java.rmi.dgc.Lease;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/9/10
 */
public class SysResUpdRecord {
    private String name;

    private String beforeValue;

    private String laterValue;

    private String updValue = "-";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeforeValue() {
        return beforeValue;
    }

    public void setBeforeValue(String beforeValue) {
        this.beforeValue = beforeValue;
    }

    public String getLaterValue() {
        return laterValue;
    }

    public void setLaterValue(String laterValue) {
        this.laterValue = laterValue;
    }

    public String getUpdValue() {
        return updValue;
    }

    public void setUpdValue(String updValue) {
        this.updValue = updValue;
    }

    public void setValue(String beforeValue , String laterValue) {
        this.beforeValue = beforeValue;
        this.laterValue = laterValue;
        if (!beforeValue.equals(laterValue)){
            updValue = beforeValue + "->" + laterValue;
        }
    }

    public SysResUpdRecord(String name, String beforeValue, String laterValue) {
        this.name = name;
        this.beforeValue = beforeValue == null ? "-": beforeValue;
        this.laterValue = laterValue == null ? "-": laterValue;
        if (!this.beforeValue.equals(this.laterValue)){
            updValue = this.beforeValue + "->" + this.laterValue;
        }
    }
}
