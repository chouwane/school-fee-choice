package pers.wh.school.fee.choice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pers.wh.school.fee.choice.entity.FeeItem;
import pers.wh.school.fee.choice.entity.Student;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class StudentDto extends Student implements Serializable {

    private List<FeeItem> feeItems;

    public void copyFrom(Student student){
        this.setId(student.getId());
        this.setCertNo(student.getCertNo());
        this.setName(student.getName());
        this.setClassRoom(student.getClassRoom());
        this.setParent(student.getParent());
        this.setContact(student.getContact());
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "feeItems=" + feeItems +
                "} " + super.toString();
    }
}
