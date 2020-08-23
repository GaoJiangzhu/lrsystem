package cn.nstl.entity;

import cn.nstl.entity.base.Page;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "sys_module")
public class SysModule extends Page implements Serializable {
    private static final long serialVersionUID = 1297856136066585492L;
    @Id
    @Column(name = "id")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(name = "module_name")
    private String moduleName;
    @Column(name = "parent_id")
    private String parentId;
    @Column(name = "order_num")
    private Integer orderNum;
    @Column(name = "action")
    private String action;
    @Column(name = "role_id")
    private String roleId;
    @Column(name = "level")
    private Integer level;
    @Column(name = "tree_level")
    private String treeLevel;
    @Column(name = "module_order")
    private Integer moduleOrder;
    @Column(name = "icon")
    private String icon;
    /**
     * 0默认不被选中，1被选中
     */
    @Transient
    private String checked = "0";
    @Transient
    private String pName;
    @Transient
    private List<SysModule> children = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<SysModule> getChildren() {
        return children;
    }

    public void setChildren(List<SysModule> children) {
        this.children = children;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getTreeLevel() {
        return treeLevel;
    }

    public void setTreeLevel(String treeLevel) {
        this.treeLevel = treeLevel;
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }
}
