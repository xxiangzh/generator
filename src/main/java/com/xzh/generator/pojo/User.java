package com.xzh.generator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_users")
public class User {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 创建时间
     */
    private Date time;

    /**
     * 用户昵称
     */
    private String name;

    /**
     * 注册入口：1 pc 2 app 3 wechat 4 other
     */
    private Integer client;

    /**
     * 图像
     */
    private String photo;

    /**
     * 真实姓名
     */
    @Column(name = "reality_name")
    private String realityName;

    /**
     * 录登密码
     */
    private String password;

    /**
     * 密码连续错误次数
     */
    @Column(name = "password_continuous_errors")
    private Integer passwordContinuousErrors;

    /**
     * 密码连续错误被锁定
     */
    @Column(name = "is_password_error_locked")
    private Boolean isPasswordErrorLocked;

    /**
     * 密码连续错误被锁定时间
     */
    @Column(name = "password_error_locked_time")
    private Date passwordErrorLockedTime;

    /**
     * 支付密码
     */
    @Column(name = "pay_password")
    private String payPassword;

    /**
     * 支付密码连续错误次数
     */
    @Column(name = "pay_password_continuous_errors")
    private Integer payPasswordContinuousErrors;

    /**
     * 支付密码错误被锁定
     */
    @Column(name = "is_pay_password_error_locked")
    private Boolean isPayPasswordErrorLocked;

    /**
     * 支付密码错误被锁定时间
     */
    @Column(name = "pay_password_error_locked_time")
    private Date payPasswordErrorLockedTime;

    /**
     * 是否锁定提现[1:锁定，不可提现，0:可提现]
     */
    @Column(name = "is_lock_withdraw")
    private Boolean isLockWithdraw;

    /**
     * 是否允许登录(锁定) 0 否(可以登录) 1 是
     */
    @Column(name = "is_allow_login")
    private Boolean isAllowLogin;

    /**
     * 后台管理员锁定时间
     */
    @Column(name = "lock_time")
    private Date lockTime;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    private Long loginCount;

    /**
     * 上次登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 登录入

口：1 pc 2 app 3 wechat 4 other
     */
    @Column(name = "login_client")
    private Byte loginClient;

    /**
     * 上次登录ip
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

    /**
     * 上次退出时间
     */
    @Column(name = "last_logout_time")
    private Date lastLogoutTime;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 箱邮是否已经验证通过
     */
    @Column(name = "is_email_verified")
    private Boolean isEmailVerified;

    /**
     * 手机号码
     */
    private String mobile1;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 手机是否已经验证通过
     */
    @Column(name = "is_mobile_verified")
    private Boolean isMobileVerified;

    /**
     * 是否已设置密码保护问题（冗余）
     */
    @Column(name = "is_secret_set")
    private Boolean isSecretSet;

    /**
     * 安全问题设置时间
     */
    @Column(name = "secret_set_time")
    private Date secretSetTime;

    /**
     * 安全问题1ID
     */
    @Column(name = "secret_question_id1")
    private Integer secretQuestionId1;

    /**
     * 安全问题答案1
     */
    private String answer1;

    /**
     * 安全问题2ID
     */
    @Column(name = "secret_question_id2")
    private Integer secretQuestionId2;

    /**
     * 安全问题答案2
     */
    private String answer2;

    /**
     * 安全问题3ID
     */
    @Column(name = "secret_question_id3")
    private Integer secretQuestionId3;

    /**
     * 安全问题答案3
     */
    private String answer3;

    /**
     * 第二联系方式
     */
    private String mobile2;

    /**
     * 身份证号吗
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 1 男 2 女 3 未知
     */
    private Byte sex;

    private Date birthday;

    /**
     * 城市Id
     */
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 家庭住址
     */
    @Column(name = "family_address")
    private String familyAddress;

    /**
     * 家庭电话
     */
    @Column(name = "family_telephone")
    private String familyTelephone;

    /**
     * 公司
     */
    private String company;

    /**
     * 公司地址
     */
    @Column(name = "company_address")
    private String companyAddress;

    /**
     * 办公电话
     */
    @Column(name = "office_telephone")
    private String officeTelephone;

    /**
     * 传真号码
     */
    @Column(name = "fax_number")
    private String faxNumber;

    /**
     * 教育情况ID
     */
    @Column(name = "education_id")
    private Integer educationId;

    /**
     * 婚姻状况ID
     */
    @Column(name = "marital_id")
    private Integer maritalId;

    /**
     * 房贷情况ID
     */
    @Column(name = "house_id")
    private Integer houseId;

    /**
     * 车贷情况ID
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 是否编辑了基本信息 0 否 1 是
     */
    @Column(name = "is_add_base_info")
    private Boolean isAddBaseInfo;

    /**
     * 0 = 正常状态; 1 = 已擦除状态; 
     */
    @Column(name = "is_erased")
    private Boolean isErased;

    /**
     * 推荐时间
     */
    @Column(name = "recommend_time")
    private Date recommendTime;

    /**
     * 管户者user_id
     */
    @Column(name = "recommend_user_id")
    private Long recommendUserId;

    /**
     * 原始的邀请人id
     */
    @Column(name = "recommend_invite_user_id")
    private Long recommendInviteUserId;

    /**
     * 注册会员时的奖励方式 0.按个数 1. 提成
     */
    @Column(name = "recommend_reward_type")
    private Byte recommendRewardType;

    /**
     * 0 未确定 1 借款会员 2 投资会员 3 复合会员
     */
    @Column(name = "master_identity")
    private Byte masterIdentity;

    /**
     * 标记

会员入口：1 pc 2 app 3 wechat 4 other
     */
    @Column(name = "master_client")
    private Byte masterClient;

    /**
     * 成为借款会员时间
     */
    @Column(name = "master_time_loan")
    private Date masterTimeLoan;

    /**
     * 成为理财会员时间
     */
    @Column(name = "master_time_invest")
    private Date masterTimeInvest;

    /**
     * 成为复合会员时间
     */
    @Column(name = "master_time_complex")
    private Date masterTimeComplex;

    /**
     * 是否是vip  1-vip会员  0-非vip会员
     */
    @Column(name = "vip_status")
    private Boolean vipStatus;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 资金池余额（资金托管模式新增字段）
     */
    private BigDecimal balance2;

    /**
     * 冻结金额
     */
    private BigDecimal freeze;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 信用积分
     */
    @Column(name = "credit_score")
    private Integer creditScore;

    /**
     * 信用等级
     */
    @Column(name = "credit_level_id")
    private Integer creditLevelId;

    /**
     * 管理员是否拒收站内信 0 否 1 是  
     */
    @Column(name = "is_refused_receive")
    private Boolean isRefusedReceive;

    /**
     * 拒收时间
     */
    @Column(name = "refused_time")
    private Date refusedTime;

    /**
     * 拒收原因
     */
    @Column(name = "refused_reason")
    private String refusedReason;

    /**
     * 是否是黑名单 0 否 1 是
     */
    @Column(name = "is_blacklist")
    private Boolean isBlacklist;

    /**
     * 被加入黑名单时间
     */
    @Column(name = "joined_time")
    private Date joinedTime;

    /**
     * 被加入黑名单的原因
     */
    @Column(name = "joined_reason")
    private String joinedReason;

    /**
     * 分配的时间
     */
    @Column(name = "assigned_time")
    private Date assignedTime;

    /**
     * 分配给哪个管理员管理
     */
    @Column(name = "assigned_to_supervisor_id")
    private Long assignedToSupervisorId;

    /**
     * 备用邮箱
     */
    private String email2;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 信用额度
     */
    @Column(name = "credit_line")
    private BigDecimal creditLine;

    /**
     * 注册时的信用额度
     */
    @Column(name = "last_credit_line")
    private BigDecimal lastCreditLine;

    /**
     * 是否是有效会员 0 否 1 是
     */
    @Column(name = "is_active")
    private Boolean isActive;

    /**
     * 用户表资金改动标记
     */
    private String sign1;

    /**
     * 用户明细表改动标记
     */
    private String sign2;

    /**
     * QQ绑定key
     */
    @Column(name = "qq_key")
    private String qqKey;

    /**
     * 微博绑定key
     */
    @Column(name = "weibo_key")
    private String weiboKey;

    /**
     * 二维码图片
     */
    @Column(name = "qr_code")
    private String qrCode;

    /**
     * ips账号
     */
    @Column(name = "ips_acct_no")
    private String ipsAcctNo;

    /**
     * 自动投标授权号
     */
    @Column(name = "ips_bid_auth_no")
    private String ipsBidAuthNo;

    /**
     * 自动还款授权号
     */
    @Column(name = "ips_repay_auth_no")
    private String ipsRepayAuthNo;

    /**
     * user_id (百度云推送)
     */
    @Column(name = "device_user_id")
    private String deviceUserId;

    /**
     * channel_id (百度云推送)
     */
    @Column(name = "channel_id")
    private String channelId;

    /**
     * 设备类型 1 android 2 ios
     */
    @Column(name = "device_type")
    private Byte deviceType;

    /**
     * 是否账单提醒推送 0 否 1 是
     */
    @Column(name = "is_bill_push")
    private Boolean isBillPush;

    /**
     * 是否投资满标提醒推送 0 否 1 是
     */
    @Column(name = "is_invest_push")
    private Boolean isInvestPush;

    /**
     * 是否活动提醒推送 0 否 1 是
     */
    @Column(name = "is_activity_push")
    private Boolean isActivityPush;

    @Column(name = "open_id")
    private String openId;

    /**
     * 微信二维码图片
     */
    @Column(name = "qr_code_wechat")
    private String qrCodeWechat;

    /**
     * 虚拟体验币
     */
    @Column(name = "vir_amount")
    private BigDecimal virAmount;

    /**
     * 手机区号 86:中国;1:北美地区
     */
    @Column(name = "regionNum")
    private Integer regionnum;

    /**
     * 是否开通浙商银行存管账户 0 否 1 是
     */
    @Column(name = "is_czb_active")
    private Boolean isCzbActive;

    /**
     * 用户理财风险类型
1：保守型
2：稳健型
3：积极型
     */
    @Column(name = "invest_type")
    private Integer investType;

    /**
     * 月度投资是否授权：0否1是
     */
    @Column(name = "is_month_invest_active")
    private Boolean isMonthInvestActive;

    /**
     * 是否宜宾绑卡
     */
    @Column(name = "is_bind_card")
    private Boolean isBindCard;

    /**
     * 虚拟id
     */
    @Column(name = "virtual_id")
    private Long virtualId;

    /**
     * 客户类型 1：个人；2：企业
     */
    @Column(name = "cust_type")
    private Byte custType;
}