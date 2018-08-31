package pers.wh.school.fee.choice.entity;

import java.io.Serializable;
import java.util.Objects;

public class StudentFeeKey implements Serializable {

    private long studentId;

    private long feeId;

    public StudentFeeKey(){}

    public StudentFeeKey(long studentId, long feeId) {
        this.studentId = studentId;
        this.feeId = feeId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getFeeId() {
        return feeId;
    }

    public void setFeeId(long feeId) {
        this.feeId = feeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentFeeKey that = (StudentFeeKey) o;
        return studentId == that.studentId &&
                feeId == that.feeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, feeId);
    }

    @Override
    public String toString() {
        return "StudentFeeKey{" +
                "studentId=" + studentId +
                ", feeId=" + feeId +
                '}';
    }
}
