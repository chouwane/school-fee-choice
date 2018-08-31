package pers.wh.school.fee.choice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * 学生缴费项目表
 */
@Entity
@Table(name = "t_student_fee")
@IdClass(StudentFeeKey.class)
@Getter
@Setter
@ToString
public class StudentFee {

    /**
     * 学生编号
     */
    @Id
    @Column(name = "xsid")
    private long studentId;

    /**
     * 项目编号
     */
    @Id
    @Column(name = "xmid")
    private long feeId;

    /**
     * 是否已选择
     */
    @Column(name = "choosed")
    private boolean checked;

}
