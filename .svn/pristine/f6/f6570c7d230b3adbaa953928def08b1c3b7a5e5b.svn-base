package cn.nstl.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by WuHongjie on 2018/7/25.
 * @author WuHongjie
 */
@Entity
@Data
@Table(name = "t_recommend_info")
public class SysResourceRecommend {

    @Id
    @Column(name = "id")
    private String id;

    //题名
    @Column(name = "title")
    private String title;

    @Column(name = "Pissn")
    private String pissn;

    @Column(name = "Eissn")
    private String eissn;

    @Column(name = "Pisbn")
    private String pisbn;

    @Column(name = "Eisbn")
    private String eisbn;

    //推荐机构ID
    @Column(name = "organization_id")
    private String organizationId;

    //推荐理由
    @Column(name = "reason")
    private String reason;

    //审核状态
    @Column(name = "flow_status")
    private String flowStatus;

    //初审人id
    @Column(name = "flow_one_userid")
    private String flowOneUserid;

    //初审人姓名
    @Column(name = "flow_one_username")
    private String flowOneUsername;

    //初审日期
    @Column(name = "flow_one_systime")
    private String flowOneSystime;

    //复审人id
    @Column(name = "flow_two_userid")
    private String flowTwoUserid;

    //复审人姓名
    @Column(name = "flow_two_username")
    private String flowTwoUsername;

    //复审日期
    @Column(name = "flow_two_systime")
    private String flowTwoSystime;

    //荐购日期
    @Column(name = "systime")
    private String systime;

    //荐购人id
    @Column(name = "sysuserid")
    private String sysuserid;

    //建构人姓名
    @Column(name = "sysusername")
    private String sysusername;

    @Transient
    private String organName;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPissn() {
        return pissn;
    }

    public void setPissn(String pissn) {
        this.pissn = pissn;
    }

    public String getEissn() {
        return eissn;
    }

    public void setEissn(String eissn) {
        this.eissn = eissn;
    }

    public String getPisbn() {
        return pisbn;
    }

    public void setPisbn(String pisbn) {
        this.pisbn = pisbn;
    }

    public String getEisbn() {
        return eisbn;
    }

    public void setEisbn(String eisbn) {
        this.eisbn = eisbn;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    public String getFlowOneUserid() {
        return flowOneUserid;
    }

    public void setFlowOneUserid(String flowOneUserid) {
        this.flowOneUserid = flowOneUserid;
    }

    public String getFlowOneUsername() {
        return flowOneUsername;
    }

    public void setFlowOneUsername(String flowOneUsername) {
        this.flowOneUsername = flowOneUsername;
    }

    public String getFlowOneSystime() {
        return flowOneSystime;
    }

    public void setFlowOneSystime(String flowOneSystime) {
        this.flowOneSystime = flowOneSystime;
    }

    public String getFlowTwoUserid() {
        return flowTwoUserid;
    }

    public void setFlowTwoUserid(String flowTwoUserid) {
        this.flowTwoUserid = flowTwoUserid;
    }

    public String getFlowTwoUsername() {
        return flowTwoUsername;
    }

    public void setFlowTwoUsername(String flowTwoUsername) {
        this.flowTwoUsername = flowTwoUsername;
    }

    public String getFlowTwoSystime() {
        return flowTwoSystime;
    }

    public void setFlowTwoSystime(String flowTwoSystime) {
        this.flowTwoSystime = flowTwoSystime;
    }

    public String getSystime() {
        return systime;
    }

    public void setSystime(String systime) {
        this.systime = systime;
    }

    public String getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(String sysuserid) {
        this.sysuserid = sysuserid;
    }

    public String getSysusername() {
        return sysusername;
    }

    public void setSysusername(String sysusername) {
        this.sysusername = sysusername;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }
}
