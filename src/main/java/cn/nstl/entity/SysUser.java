package cn.nstl.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import cn.nstl.entity.base.Page;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;


/**
 * Created by LG on 2018/3/1.
 * @author LG
 */
@Entity
@Data
@Table(name = "sys_user")
public class SysUser extends Page implements UserDetails {

    private static final long serialVersionUID = -6193288028931761228L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    private String id;
    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;
    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    @Transient
    private String password2;
    /**
     * 创建日期
     */
    @Column(name = "createdate")
    private String createDate;
    /**
     * 状态：0：不可用；1：可用；
     */
    @Column(name = "status")
    private Integer status;
    /**
     * 角色id
     */
    @Column(name = "role_id")
    private String roleId;
    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    @Column(name = "img_code")
    private String imgCode;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "img_check")
    private String imgCheck;

    @Column(name = "email")
    private String email;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "isadmin")
    private String isAdmin;

    @Column(name = "login_date")
    private String loginDate;
    @Column(name = "phone")
    private String phone;
    @Column(name = "organ_id")
    private String organId;
    @Transient
    private String organName;
    @Transient
    private String organTreeLevel;

//    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
//    @JoinTable(name = "sys_user_roles", joinColumns = @JoinColumn(name = "sys_user_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "roles_id", referencedColumnName = "id"))
//    private List<SysRole> roles;

    @Transient
    private List<String> authList = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> auths = new ArrayList<>();
        List<String> roles = new ArrayList<>(Arrays.asList("ROLE_HHH"));
        for (String  role : roles) {
            auths.add(new SimpleGrantedAuthority(role));
        }
//        auths.add(new SimpleGrantedAuthority("ROLE_HHH"));
        return auths;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgCheck() {
        return imgCheck;
    }

    public void setImgCheck(String imgCheck) {
        this.imgCheck = imgCheck;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getOrganTreeLevel() {
        return organTreeLevel;
    }

    public void setOrganTreeLevel(String organTreeLevel) {
        this.organTreeLevel = organTreeLevel;
    }

    public List<String> getAuthList() {
        return authList;
    }

    public void setAuthList(List<String> authList) {
        this.authList = authList;
    }
}
