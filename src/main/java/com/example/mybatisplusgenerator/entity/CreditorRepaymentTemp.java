package com.example.mybatisplusgenerator.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 债权回款计划临时表
 * </p>
 *
 * @author jobob
 * @since 2021-10-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CreditorRepaymentTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 债权id
     */
    private Integer creditorId;

    /**
     * 费用类型(1-本金，2-利息，3-其他费用）
     */
    private String feeType;

    /**
     * 回款周期(停用）
     */
    private LocalDateTime paymentTime;

    /**
     * 回款开始时间
     */
    private LocalDateTime paymentStart;

    /**
     * 回款结束时间
     */
    private LocalDateTime paymentEnd;

    /**
     * 最低累计回款金额
     */
    private BigDecimal leastTotalMoney;

    /**
     * 最低回款金额
     */
    private BigDecimal leastMoney;

    /**
     * 违约金计息开始时间
     */
    private LocalDateTime startTime;

    /**
     * 逾期利率
     */
    private BigDecimal overRate;

    /**
     * 逾期天数
     */
    private Integer overTime;

    /**
     * 违约金
     */
    private BigDecimal overMoney;

    /**
     * 已收金额
     */
    private BigDecimal receivedAmount;

    /**
     * 应收金额
     */
    private BigDecimal shouldAmount;

    /**
     * 剩余未还金额
     */
    private BigDecimal lastAmount;

    /**
     * 打款凭证
     */
    private String voucherUrl;

    /**
     * 逾期状态（1-未逾期，2-已逾期）
     */
    private String overStatus;

    /**
     * 状态（1-未还款，2-未达标，3-已达标，4-已作废）
     */
    private String repaymentStatus;

    /**
     * 数据来源  0-系统生成，1-人为输入
     */
    private String source;

    /**
     * 回款期次
     */
    private Integer paybackPeriod;

    /**
     * 是否删除0-否，1-是
     */
    private Integer isDel;

    /**
     * 创建者
     */
    private String operateName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建部门
     */
    private String operateDept;


}
