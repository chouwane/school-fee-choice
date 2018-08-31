package pers.wh.school.fee.choice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.wh.school.fee.choice.dao.StudentFeeDao;
import pers.wh.school.fee.choice.entity.StudentFee;
import pers.wh.school.fee.choice.entity.StudentFeeKey;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentFeeDaoTest {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private StudentFeeDao studentFeeDao;

    @Test
    public void test1(){
        StudentFeeKey key = new StudentFeeKey(1,1);
        StudentFee studentFee = entityManager.find(StudentFee.class,key);
        System.out.println(studentFee.toString());
    }

    @Test
    public void test2(){
        StudentFee studentFee = studentFeeDao.findByStudentIdAndFeeId(1,1);
        System.out.println(studentFee);

    }

}
