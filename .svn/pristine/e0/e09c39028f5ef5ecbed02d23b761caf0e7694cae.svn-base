package cn.nstl.entity;

import cn.nstl.entity.base.Page;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "sys_organ")
public class SysOrgan extends Page implements Serializable {
    private static final long serialVersionUID = 8014100963049354510L;
    @Id
    @Column(name = "id")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(name = "organ_name")
    private String name;
    @Column(name = "organ_code")
    private String code;
    @Column(name = "pid")
    private String pId;
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "update_time")
    private String updateTime;
    @Column(name = "update_by")
    private String updateBy;
    @Column(name = "tree_level")
    private String treeLevel;
    @Column(name = "is_del")
    private String idDel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getTreeLevel() {
        return treeLevel;
    }

    public void setTreeLevel(String treeLevel) {
        this.treeLevel = treeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIdDel() {
        return idDel;
    }

    public void setIdDel(String idDel) {
        this.idDel = idDel;
    }
}
