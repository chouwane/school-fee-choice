package pers.wh.school.fee.choice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.wh.school.fee.choice.entity.Student;

import java.util.List;

@Repository
public interface  StudentDao extends JpaRepository<Student,Long> {

    /**
     * 根据身份证号查找
     * @param certNo
     * @return
     */
    List<Student> findByCertNo(String certNo);

}
