package pers.wh.school.fee.choice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 学生信息
 */
@Entity
@Table(name = "t_student")
@Getter@Setter@ToString
public class Student {
    /**
     * 编号
     */
    @Id
    @Column(name="xsid")
    private long id;

    /**
     * 身份证号
     */
    @Column(name="sfzid")
    private String certNo;

    /**
     * 姓名
     */
    @Column(name="name")
    private String name;

    /**
     * 年级
     */
    @Column(name = "grade")
    private String grade;

    /**
     * 班级
     */
    @Column(name="class")
    private String classRoom;

    /**
     * 家长
     */
    @Column(name="parent")
    private String parent;

    /**
     * 联系方式
     */
    @Column(name="contact")
    private String contact;
}
