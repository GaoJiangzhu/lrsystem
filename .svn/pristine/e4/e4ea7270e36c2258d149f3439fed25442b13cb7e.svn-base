package cn.nstl.entity;

import javax.persistence.*;

import cn.nstl.entity.base.Page;
import cn.nstl.utils.DateUtils;
import cn.nstl.utils.UUIDUtil;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
@Data
@Table(name = "sys_logs")
public class SysLog extends Page  {


    private static final long serialVersionUID = 3596169401897269444L;
    @Id
    @Column(name = "id")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "user")
    private String user;

    @Column(name = "role")
    private String role;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "type")
    private String type;

    @Column(name = "content")
    private String content;

    @Column(name = "date")
    private String date;

    @Column(name = "ip")
    private String ip;

    @Transient
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SysLog(String user, String role, String description, String url, String type, String content) {
        this.id = UUIDUtil.getUUID();
        this.user = user;
        this.role = role;
        this.description = description;
        this.url = url;
        this.type = type;
        this.content = content;
        this.date =  DateUtils.getNowTime();
    }

    public SysLog() {
        this.id = UUIDUtil.getUUID();
        this.date =  DateUtils.getNowTime();
    }

    @Override
    public String toString() {
        return "SysLog{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", ip='" + ip +
                '}';
    }
}
