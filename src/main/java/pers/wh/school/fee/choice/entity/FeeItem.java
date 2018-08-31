package pers.wh.school.fee.choice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 缴费项目
 */
@Entity
@Table(name = "t_fee_item")
@Getter
@Setter
@ToString
public class FeeItem {

    /**
     * 项目编号
     */
    @Id
    @Column(name = "xmid")
    private long id;

    /**
     * 项目名称
     */
    @Column(name = "xmmc")
    private String name;

    /**
     * 金额
     */
    @Column(name = "amount",precision = 10, scale = 2)
    private BigDecimal amount;

    /**
     * 是否必选
     * 1-必选 0-可选
     */
    @Column(name = "essential")
    private boolean required;

    @Transient
    private boolean checked;
}
