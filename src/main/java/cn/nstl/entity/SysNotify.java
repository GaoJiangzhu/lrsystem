package cn.nstl.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 通知实体
 * @author liuhaiyuan
 */
@Entity
@Data
@Table(name = "sys_notify")
public class SysNotify {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;
    /**
     * 荐购初审数量
     */
    @Column(name = "recommend_flow_one_count")
    private int recommendFlowOneCount;
    /**
     * 荐购复审数量
     */
    @Column(name = "recommend_flow_two_count")
    private int recommendFlowTwoCount;
    /**
     * 荐购遴选数量
     */
    @Column(name = "resource_flow_one_count")
    private int resourceFlowoneCount;
    /**
     * 审核分配数量
     */
    @Column(name = "resource_flow_two_count")
    private int resourceFlowTwoCount;
    /**
     * 订购审核数量
     */
    @Column(name = "order_flow_count")
    private int orderFlowCount;

    public SysNotify() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRecommendFlowOneCount() {
        return recommendFlowOneCount;
    }

    public void setRecommendFlowOneCount(int recommendFlowOneCount) {
        this.recommendFlowOneCount = recommendFlowOneCount;
    }

    public int getRecommendFlowTwoCount() {
        return recommendFlowTwoCount;
    }

    public void setRecommendFlowTwoCount(int recommendFlowTwoCount) {
        this.recommendFlowTwoCount = recommendFlowTwoCount;
    }

    public int getResourceFlowoneCount() {
        return resourceFlowoneCount;
    }

    public void setResourceFlowoneCount(int resourceFlowoneCount) {
        this.resourceFlowoneCount = resourceFlowoneCount;
    }

    public int getResourceFlowTwoCount() {
        return resourceFlowTwoCount;
    }

    public void setResourceFlowTwoCount(Integer resourceFlowTwoCount) {
        this.resourceFlowTwoCount = resourceFlowTwoCount;
    }

    public int getOrderFlowCount() {
        return orderFlowCount;
    }

    public void setOrderFlowCount(int orderFlowCount) {
        this.orderFlowCount = orderFlowCount;
    }

    public void setResourceFlowTwoCount(int resourceFlowTwoCount) {
        this.resourceFlowTwoCount = resourceFlowTwoCount;
    }
}
