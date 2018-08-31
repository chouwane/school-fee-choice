package pers.wh.school.fee.choice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.wh.school.fee.choice.entity.Student;
import pers.wh.school.fee.choice.entity.StudentFee;
import pers.wh.school.fee.choice.entity.StudentFeeKey;

@Repository
public interface StudentFeeDao extends JpaRepository<StudentFee,StudentFeeKey> {


    StudentFee findByStudentIdAndFeeId(long studentId, long feeId);

}
