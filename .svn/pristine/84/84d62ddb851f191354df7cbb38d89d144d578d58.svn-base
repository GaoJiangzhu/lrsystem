package cn.nstl.entity;

import cn.nstl.utils.DateUtils;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author:Tangcheng
 * @Date:
 * */
@Entity
@Data
@Table(name = "t_order_info")
public class SysOrder extends EntityOperation implements Serializable  {

    private static final long serialVersionUID = 4400805868854248544L;
    //序号
    @Id
    @Column(name = "id")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    private String id;


    //唯一订购号
    @Column(name = "u_order_number")
    private String uOrderNumber;

    //订购号
    @Column(name = "order_number")
    private String orderNumber;

    //载体
    @Column(name = "carrier")
    private String carrier;

    //订购机构
    @Column(name = "organization_id")
    private String organizationId;

    //订购年份
    @Column(name = "order_year")
    private String orderYear;

    //合同起始年
    @Column(name = "c_start_year")
    private String CStartYear;

    //合同终止年
    @Column(name = "c_end_year")
    private String CEndYear;

    //订购状态
    @Column(name = "order_status")
    private String orderStatus;

    //订购类型
    @Column(name = "order_type")
    private String orderType;

    //订购模式
    @Column(name = "order_pattern")
    private String orderPattern;

    //开通范围
    @Column(name = "opening_range")
    private String openingRange;

    //全文可访问起始年
    @Column(name = "a_start_year")
    private String AStartYear;

    //全文可访问截止年
    @Column(name = "a_end_year")
    private String AEndYear;

    //停订原因
    @Column(name = "reason")
    private String reason;

    //本地元数据保存
    @Column(name = "has_metadata")
    private String hasMetadata;


    //到货情况
    @Column(name = "arrival_status")
    private String arrivalStatus;

    //是否订到
    @Column(name = "is_ordered")
    private String isOrdered;

    //决算年度
    @Column(name = "auditing_year")
    private String auditingYear;

    //经费来源
    @Column(name = "fund_source")
    private String fundSource;

    //预算额度
    @Column(name = "budget")
    private String budget;

    //应支付价格
    @Column(name = "should_pay")
    private String shouldPay;

    //支付价格
    @Column(name = "paid")
    private String paid;

    //未支付价格
    @Column(name = "not_pay")
    private String notPay;

    //合计人民币
    @Column(name = "cny_total")
    private String cnyTotal;

    //订购价格/合同金额
    @Column(name = "order_pay")
    private String orderPay;

    //补贴额度
    @Column(name = "subsidy")
    private String subsidy;

    //续订预估价格
    @Column(name = "order_per_pay")
    private String orderPerPay;

    //经费类型
    @Column(name = "fund_type")
    private String fundType;

    //合同币种
    @Column(name = "currency")
    private String currency;

    //修改时间
    @Column(name = "systime")
    private String systime;

    //修改人id
    @Column(name = "sysuserid")
    private String sysuserId;


    //修改人姓名
    @Column(name = "sysusername")
    private String sysuserName;

    //审核状态
    @Column(name = "flow_status")
    private String flowStatus;

    //初审人ID
    @Column(name = "flow_one_userid")
    private String flowoneUserid;

    //初审人姓名
    @Column(name = "flow_one_username")
    private String flowoneUsername;

    //初审人时间
    @Column(name = "flow_one_systime")
    private String flowoneSystime;

    //复审人ID
    @Column(name = "flow_two_userid")
    private String flowtwoUserid;

    //复审人姓名
    @Column(name = "flow_two_username")
    private String flowtwoUsername;

    //复审人时间
    @Column(name = "flow_two_systime")
    private String flowtwoSystime;

    //创建人
    @Column(name = "create_id")
    private String createId;

    //创建时间
    @Column(name = "create_time")
    private String createTime;

    //ISSN/ISBN号
    @Column(name = "pebs")
    private String pebs;

    @Transient
    private String organName;

    @Transient
    private String title;

    @Transient
    private String pissn;

    @Transient
    private String eissn;

    @Transient
    private String pisbn;

    @Transient
    private String eisbn;

    @Transient
    private String subject;

    @Transient
    private String country;

    @Transient
    private String publisher;
    @Transient
    private String coverName;
    private String res_id;

    public String getCoverName() {
        return coverName;
    }

    public void setCoverName(String coverName) {
        this.coverName = coverName;
    }

    public String getRes_id() {
        return res_id;
    }

    public void setRes_id(String res_id) {
        this.res_id = res_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public SysOrder(String uOrderNumber, SysUser sysUser , SysResourceLog sysResourceLog) {
        this.uOrderNumber = uOrderNumber;
        this.systime = DateUtils.getNowTime();
        this.createTime = DateUtils.getNowTime();
        this.createId = sysUser.getId();
        this.carrier = sysResourceLog.getCarrier();
        this.organizationId = sysUser.getOrganId();
        this.orderStatus = "0";
        this.orderYear = String.valueOf(DateUtils.getYear());
        this.res_id = sysResourceLog.getId();
    }

    public SysOrder(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuOrderNumber() {
        return uOrderNumber;
    }

    public void setuOrderNumber(String uOrderNumber) {
        this.uOrderNumber = uOrderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrderYear() {
        return orderYear;
    }

    public void setOrderYear(String orderYear) {
        this.orderYear = orderYear;
    }

    public String getCStartYear() {
        return CStartYear;
    }

    public void setCStartYear(String CStartYear) {
        this.CStartYear = CStartYear;
    }

    public String getAEndYear() {
        return AEndYear;
    }

    public void setAEndYear(String AEndYear) {
        this.AEndYear = AEndYear;
    }

    public String getCEndYear() {
        return CEndYear;
    }

    public void setCEndYear(String CEndYear) {
        this.CEndYear = CEndYear;
    }

    public String getAStartYear() {
        return AStartYear;
    }

    public void setAStartYear(String AStartYear) {
        this.AStartYear = AStartYear;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderPattern() {
        return orderPattern;
    }

    public void setOrderPattern(String orderPattern) {
        this.orderPattern = orderPattern;
    }

    public String getOpeningRange() {
        return openingRange;
    }

    public void setOpeningRange(String openingRange) {
        this.openingRange = openingRange;
    }


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getHasMetadata() {
        return hasMetadata;
    }

    public void setHasMetadata(String hasMetadata) {
        this.hasMetadata = hasMetadata;
    }

    public String getArrivalStatus() {
        return arrivalStatus;
    }

    public void setArrivalStatus(String arrivalStatus) {
        this.arrivalStatus = arrivalStatus;
    }

    public String getIsOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(String isOrdered) {
        this.isOrdered = isOrdered;
    }

    public String getAuditingYear() {
        return auditingYear;
    }

    public void setAuditingYear(String auditingYear) {
        this.auditingYear = auditingYear;
    }

    public String getFundSource() {
        return fundSource;
    }

    public void setFundSource(String fundSource) {
        this.fundSource = fundSource;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(String shouldPay) {
        this.shouldPay = shouldPay;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getNotPay() {
        return notPay;
    }

    public void setNotPay(String notPay) {
        this.notPay = notPay;
    }

    public String getCnyTotal() {
        return cnyTotal;
    }

    public void setCnyTotal(String cnyTotal) {
        this.cnyTotal = cnyTotal;
    }

    public String getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(String orderPay) {
        this.orderPay = orderPay;
    }

    public String getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(String subsidy) {
        this.subsidy = subsidy;
    }

    public String getOrderPerPay() {
        return orderPerPay;
    }

    public void setOrderPerPay(String orderPerPay) {
        this.orderPerPay = orderPerPay;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSystime() {
        return systime;
    }

    public void setSystime(String systime) {
        this.systime = systime;
    }

    public String getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(String sysuserId) {
        this.sysuserId = sysuserId;
    }

    public String getSysuserName() {
        return sysuserName;
    }

    public void setSysuserName(String sysuserName) {
        this.sysuserName = sysuserName;
    }

    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    public String getFlowoneUserid() {
        return flowoneUserid;
    }

    public void setFlowoneUserid(String flowoneUserid) {
        this.flowoneUserid = flowoneUserid;
    }

    public String getFlowoneUsername() {
        return flowoneUsername;
    }

    public void setFlowoneUsername(String flowoneUsername) {
        this.flowoneUsername = flowoneUsername;
    }

    public String getFlowoneSystime() {
        return flowoneSystime;
    }

    public void setFlowoneSystime(String flowoneSystime) {
        this.flowoneSystime = flowoneSystime;
    }

    public String getFlowtwoUserid() {
        return flowtwoUserid;
    }

    public void setFlowtwoUserid(String flowtwoUserid) {
        this.flowtwoUserid = flowtwoUserid;
    }

    public String getFlowtwoUsername() {
        return flowtwoUsername;
    }

    public void setFlowtwoUsername(String flowtwoUsername) {
        this.flowtwoUsername = flowtwoUsername;
    }

    public String getFlowtwoSystime() {
        return flowtwoSystime;
    }

    public void setFlowtwoSystime(String flowtwoSystime) {
        this.flowtwoSystime = flowtwoSystime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getPebs() {
        return pebs;

    }

    public void setPebs(String pebs) {
        this.pebs = pebs;
    }

//    public String getUpdSql(){
//        StringBuffer updSql = new StringBuffer();
//        try {
//            Field[] declaredFields = getClass().getDeclaredFields();
//            for (Field field : declaredFields) {
//                Column annotation = field.getAnnotation(Column.class);
//                if (annotation == null)
//                    continue;
//                String annotationName = annotation.name();
//                String attributesName = field.getName();
//                String attributesVale = getFieldValueByName(field.getName());
//                if (StringUtils.isNotEmpty(annotationName) && StringUtils.isNotEmpty(attributesVale))
//                    updSql.append(annotationName+"='"+attributesVale+"',");
//            }
//            if (updSql.length() > 0)
//                return updSql.substring(0, updSql.length() - 1);
//            else
//                return "";
//        }catch (Exception e){
//            return "";
//        }
//    }
//    private String getFieldValueByName(String fieldName) {
//        try {
//            String firstLetter = fieldName.substring(0, 1).toUpperCase();
//            String getter = "get" + firstLetter + fieldName.substring(1);
//            Method method = getClass().getMethod(getter, new Class[] {});
//            Object value = method.invoke(this, new Object[] {});
//            return value==null?"":value.toString();
//        } catch (Exception e) {
//            System.out.println(e);
//            return "";
//        }
//    }


}
