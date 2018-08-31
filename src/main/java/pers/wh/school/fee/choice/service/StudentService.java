package pers.wh.school.fee.choice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.wh.school.fee.choice.dao.FeeItemDao;
import pers.wh.school.fee.choice.dao.StudentDao;
import pers.wh.school.fee.choice.dao.StudentFeeDao;
import pers.wh.school.fee.choice.dto.StudentDto;
import pers.wh.school.fee.choice.entity.FeeItem;
import pers.wh.school.fee.choice.entity.Student;
import pers.wh.school.fee.choice.entity.StudentFee;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private FeeItemDao feeItemDao;
    @Autowired
    private StudentFeeDao studentFeeDao;

    public Student studentQuery(String certNo){
        List<Student> list = studentDao.findByCertNo(certNo);
        if(list != null && list.size() == 1){
            return list.get(0);
        }
        return null;
    }

    public List<FeeItem> feeItemQueryAll(){
        return feeItemDao.findAll();
    }


    /**
     * 准备登陆后所需信息
     * @param certNo
     * @return
     */
    public StudentDto studentFeeItems(String certNo){

        Student student = this.studentQuery(certNo);
        if(student != null){
            StudentDto studentDto = new StudentDto();
            studentDto.copyFrom(student);

            List<FeeItem> feeItems = feeItemQueryAll();
            if(feeItems != null && !feeItems.isEmpty()){
                for(FeeItem item : feeItems){
                    if(!item.isRequired()){
                        StudentFee studentFee = studentFeeDao.findByStudentIdAndFeeId(student.getId(),item.getId());
                        if(studentFee != null){
                            item.setChecked(studentFee.isChecked());
                        }
                    }else {
                        //必填项必选
                        item.setChecked(true);
                    }
                }
            }
            studentDto.setFeeItems(feeItems);
            return studentDto;

        }

        return null;
    }

    /**
     * 保存学生的选择
     * @param studentDto
     */
    public void save(StudentDto studentDto){

        List<FeeItem> feeItems = studentDto.getFeeItems();
        if(feeItems != null && !feeItems.isEmpty()){
            for(FeeItem item : feeItems){
                StudentFee studentFee = new StudentFee();
                studentFee.setStudentId(studentDto.getId());
                studentFee.setFeeId(item.getId());
                studentFee.setChecked(item.isChecked());
                studentFeeDao.save(studentFee);
            }
        }

    }

}
