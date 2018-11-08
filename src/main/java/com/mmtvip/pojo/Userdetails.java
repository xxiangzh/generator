package com.mmtvip.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_details")
public class Userdetails {
    /**
     * 编号ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 添加时间
     */
    private Date time;

    /**
     * 账户收支操作项(1 在线支付 2 手工充值 3 转账入 4 解冻 ... 1001 转账出 1002 冻结...)
     */
    private Integer operation;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 关联的id(支付id,标id,账单id,对方user_id...)
     */
    @Column(name = "relation_id")
    private Long relationId;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 冻结
     */
    private BigDecimal freeze;

    /**
     * 待收金额
     */
    @Column(name = "recieve_amount")
    private BigDecimal recieveAmount;

    /**
     * 备注
     */
    private String summary;

    public Userdetails(Long id, Long userId, Date time, Integer operation, BigDecimal amount, Long relationId, BigDecimal balance, BigDecimal freeze, BigDecimal recieveAmount, String summary) {
        this.id = id;
        this.userId = userId;
        this.time = time;
        this.operation = operation;
        this.amount = amount;
        this.relationId = relationId;
        this.balance = balance;
        this.freeze = freeze;
        this.recieveAmount = recieveAmount;
        this.summary = summary;
    }

    /**
     * 获取编号ID
     *
     * @return id - 编号ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 获取添加时间
     *
     * @return time - 添加时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 获取账户收支操作项(1 在线支付 2 手工充值 3 转账入 4 解冻 ... 1001 转账出 1002 冻结...)
     *
     * @return operation - 账户收支操作项(1 在线支付 2 手工充值 3 转账入 4 解冻 ... 1001 转账出 1002 冻结...)
     */
    public Integer getOperation() {
        return operation;
    }

    /**
     * 获取交易金额
     *
     * @return amount - 交易金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 获取关联的id(支付id,标id,账单id,对方user_id...)
     *
     * @return relation_id - 关联的id(支付id,标id,账单id,对方user_id...)
     */
    public Long getRelationId() {
        return relationId;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 获取冻结
     *
     * @return freeze - 冻结
     */
    public BigDecimal getFreeze() {
        return freeze;
    }

    /**
     * 获取待收金额
     *
     * @return recieve_amount - 待收金额
     */
    public BigDecimal getRecieveAmount() {
        return recieveAmount;
    }

    /**
     * 获取备注
     *
     * @return summary - 备注
     */
    public String getSummary() {
        return summary;
    }
}