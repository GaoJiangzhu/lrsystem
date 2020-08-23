package cn.nstl.entity;

import cn.nstl.entity.base.Page;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_proxy_corporation")
public class ProxyCorporation extends Page {

    private static final long serialVersionUID = 2347598087551321681L;
    @Id
    @Column(name = "id")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "proxy_cor_name")
    private String proxyCorName;

    @Column(name = "proxy_cor_code")
    private String proxyCorCode;
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "update_time")
    private String updateTime;
    @Column(name = "update_by")
    private String updateBy;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProxyCorName() {
        return proxyCorName;
    }

    public void setProxyCorName(String proxyCorName) {
        this.proxyCorName = proxyCorName;
    }

    public String getProxyCorCode() {
        return proxyCorCode;
    }

    public void setProxyCorCode(String proxyCorCode) {
        this.proxyCorCode = proxyCorCode;
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
}
