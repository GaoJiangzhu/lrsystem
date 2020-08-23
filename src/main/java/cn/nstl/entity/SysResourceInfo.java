package cn.nstl.entity;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: Wuhongjie
 * @Date: Created in 10:16 2018/7/26
 */

@Entity
@Data
@Table(name = "t_resource_info")
public class SysResourceInfo extends EntityOperation{

    @Id
    @Column(name = "id")
    private String id;

    //荐购ID
    @Column(name = "recommend_id")
    private String recommendId;

    //题名
    @Column(name = "title")
    private String title;

    //其他题名
    @Column(name = "other_title")
    private String otherTitle;

    //分辑号
    @Column(name = "series_number")
    private String seriesNumber;

    //分辑名
    @Column(name = "series_title")
    private String seriesTitle;

    //责任者
    @Column(name = "author")
    private String author;

    @Column(name = "Pissn")
    private String pissn;

    @Column(name = "Eissn")
    private String eissn;

    @Column(name = "Pisbn")
    private String pisbn;

    @Column(name = "Eisbn")
    private String eisbn;

    //套id
    @Column(name = "cover_id")
    private String coverId;

    //种类id
    @Column(name = "kind_id")
    private String kindId;

    //卷期
    @Column(name = "coiling_period")
    private String coilingPeriod;

    //学科
    @Column(name = "subject")
    private String subject;

    //出版社
    @Column(name = "publisher")
    private String publisher;

    //国别
    @Column(name = "country")
    private String country;

    //出版年
    @Column(name = "pub_year")
    private String pubYear;

    //创刊年
    @Column(name = "founded_year")
    private String foundedYear;

    //语种
    @Column(name = "language")
    private String language;

    //出版频率
    @Column(name = "pub_feq")
    private String pubFeq;

    //内容简介
    @Column(name = "Intro")
    private String Intro;

    //分类号
    @Column(name = "classi_number")
    private String classiNumber;

    //期刊URL地址
    @Column(name = "url")
    private String url;

    //载体
    @Column(name = "carrier")
    private String carrier;

    //文献类型
    @Column(name = "type")
    private String type;

    //出版模式
    @Column(name = "pub_pattern")
    private String pubPattern;

    //出版状态
    @Column(name = "pub_status")
    private String pubStatus;

    //创建日期
    @Column(name = "systime")
    private String systime;

    //创建人id
    @Column(name = "sysuserid")
    private String sysuserid;

    //创建人姓名
    @Column(name = "sysusername")
    private String sysusername;

    //分配单位
    @Column(name = "dist_unit")
    private String distUnit;

    //订单分配状态
    @Column(name = "order_status")
    private String orderStatus;

    //遴选分配状态
    @Column(name = "distribution_status")
    private String distributionStatus;


    //遴选分配状态
    @Column(name = "trial_opinion")
    private String trialOpinion;


    //遴选分配状态
    @Column(name = "review_status")
    private String reviewStatus;


    //荐购审核状态
    @Transient
    private String flowStatus;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setInfoId(String infoId) {
        this.id = infoId;
    }

    public String getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(String recommendId) {
        this.recommendId = recommendId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOtherTitle() {
        return otherTitle;
    }

    public void setOtherTitle(String otherTitle) {
        this.otherTitle = otherTitle;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getCoverId() {
        return coverId;
    }

    public void setCoverId(String coverId) {
        this.coverId = coverId;
    }

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId;
    }

    public String getCoilingPeriod() {
        return coilingPeriod;
    }

    public void setCoilingPeriod(String coilingPeriod) {
        this.coilingPeriod = coilingPeriod;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPubYear() {
        return pubYear;
    }

    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }

    public String getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(String foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPubFeq() {
        return pubFeq;
    }

    public void setPubFeq(String pubFeq) {
        this.pubFeq = pubFeq;
    }

    public String getIntro() {
        return Intro;
    }

    public void setIntro(String intro) {
        Intro = intro;
    }

    public String getClassiNumber() {
        return classiNumber;
    }

    public void setClassiNumber(String classiNumber) {
        this.classiNumber = classiNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPubPattern() {
        return pubPattern;
    }

    public void setPubPattern(String pubPattern) {
        this.pubPattern = pubPattern;
    }

    public String getPubStatus() {
        return pubStatus;
    }

    public void setPubStatus(String pubStatus) {
        this.pubStatus = pubStatus;
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

    public SysResourceInfo() {
        super();
    }

    public String getDistUnit() {
        return distUnit;
    }

    public void setDistUnit(String distUnit) {
        this.distUnit = distUnit;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDistributionStatus() {
        return distributionStatus;
    }

    public void setDistributionStatus(String distributionStatus) {
        this.distributionStatus = distributionStatus;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getTrialOpinion() {
        return trialOpinion;
    }

    public void setTrialOpinion(String trialOpinion) {
        this.trialOpinion = trialOpinion;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}
