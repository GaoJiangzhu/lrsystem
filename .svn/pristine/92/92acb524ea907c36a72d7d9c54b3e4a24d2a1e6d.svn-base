package cn.nstl.entity;

import cn.nstl.entity.base.Page;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_acount_num")
public class AcountNum extends Page {


    private static final long serialVersionUID = -3771346540235789823L;
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "acount_num")
    private String acountNum;

    @Column(name = "proxy_cor_id")
    private String proxyCorId;

    @Column(name = "organ_id")
    private String organId;

    @Column(name = "mark")
    private String mark;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_time")
    private String updateTime;

    @Column(name = "update_by")
    private String updateBy;

    @Transient
    private String organName;

    @Transient
    private String proxyCorName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcountNum() {
        return acountNum;
    }

    public void setAcountNum(String acountNum) {
        this.acountNum = acountNum;
    }

    public String getProxyCorId() {
        return proxyCorId;
    }

    public void setProxyCorId(String proxyCorId) {
        this.proxyCorId = proxyCorId;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getProxyCorName() {
        return proxyCorName;
    }

    public void setProxyCorName(String proxyCorName) {
        this.proxyCorName = proxyCorName;
    }
}
