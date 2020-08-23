package cn.nstl.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "t_cover_info")
public class SysCover implements Serializable {
    private static final long serialVersionUID = -4493734267135022074L;
    //序号
    @Id
    @Column(name = "id")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator")
    private String id;

    /**
     *套名称
     */
    @Column(name = "cover_name")
    private String coverName;
    /**
     *EISSN
     */
    @Column(name = "eissn")
    private String eissn;
    /**
     *PISSN
     */
    @Column(name = "pissn")
    private String pissn;
    /**
     *EISBN
     */
    @Column(name = "eisbn")
    private String eisbn;
    /**
     *PISBN
     */
    @Column(name = "pisbn")
    private String pisbn;
    /**
     *出版国
     */
    @Column(name = "pub_country")
    private String pubCountry;
    /**
     *出版社
     */
    @Column(name = "publisher")
    private String publisher;
    /**
     *学科
     */
    @Column(name = "subject")
    private String subject;
    /**
     *语种
     */
    @Column(name = "language")
    private String language;
    /**
     *创建时间
     */
    @Column(name = "create_time")
    private String createTime;
    /**
     *创建人
     */
    @Column(name = "create_by")
    private String createBy;
    /**
     *更新时间
     */
    @Column(name = "update_time")
    private String updateTime;
    /**
     *更新人
     */
    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "is_del")
    private String isDel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoverName() {
        return coverName;
    }

    public void setCoverName(String coverName) {
        this.coverName = coverName;
    }

    public String getEissn() {
        return eissn;
    }

    public void setEissn(String eissn) {
        this.eissn = eissn;
    }

    public String getPissn() {
        return pissn;
    }

    public void setPissn(String pissn) {
        this.pissn = pissn;
    }

    public String getEisbn() {
        return eisbn;
    }

    public void setEisbn(String eisbn) {
        this.eisbn = eisbn;
    }

    public String getPisbn() {
        return pisbn;
    }

    public void setPisbn(String pisbn) {
        this.pisbn = pisbn;
    }

    public String getPubCountry() {
        return pubCountry;
    }

    public void setPubCountry(String pubCountry) {
        this.pubCountry = pubCountry;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }
}
