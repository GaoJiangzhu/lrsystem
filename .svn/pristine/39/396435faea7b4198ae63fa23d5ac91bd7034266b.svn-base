package cn.nstl.entity;

import cn.nstl.entity.base.Page;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "sys_role" )
public class SysRole extends Page implements GrantedAuthority {
    private static final long serialVersionUID = -4983693389035351492L;
    @Id
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private String id;
    /**
     * 角色名
     */
    @Column(name = "name")
    private String name;
    /**
     * 创建时间
     */
    @Column(name = "createdate")
    private String createDate;
    /**
     * 可访问api
     */
    @Column(name = "api")
    private String api;
    /**
     * 状态：0：不可用；1：可用；
     */
    @Column(name = "status")
    private Integer status;

//    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
//    @JoinTable(name = "sys_role_module", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "module_id", referencedColumnName = "id"))
//    private List<SysModule> moduleList;

    @Transient
    private String moduleIds = "";
    @Transient
    private String text;

    @Transient
    private Integer userCount;

    @Override
    public String getAuthority() {
        return name;
    }



}
