package pers.wh.school.fee.choice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.wh.school.fee.choice.dto.ResponseDto;
import pers.wh.school.fee.choice.dto.StudentDto;
import pers.wh.school.fee.choice.entity.Student;
import pers.wh.school.fee.choice.service.StudentService;

import javax.servlet.http.HttpSession;


@RestController
public class AjaxController {

    @Autowired
    private StudentService studentService;

    /**
     * 1、	登录
     * a)	家长输入身份证号，然后点击登陆
     * b)	系统根据输入的身份证号去学生信息表中按sfzid查询
     * c)	如查询到，则跳转项目选择页面
     * d)	如查询不到，则提示“未找到学生信息”
     * @param certNo
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseDto login(HttpSession session, String certNo){
        ResponseDto res = new ResponseDto();

        Student student = studentService.studentQuery(certNo);
        if(student == null){
            res.setCode(-1);
            res.setDesc("未找到学生信息");
        }else{
            res.setData(student);
            session.setAttribute("student", student);
        }

        return res;
    }

    @RequestMapping(value = "/studentFeeItems", method = RequestMethod.POST)
    public ResponseDto studentFeeItems(HttpSession session){
        ResponseDto res = new ResponseDto();

        Student user = (Student) session.getAttribute("student");
        String certNo = user.getCertNo();
        StudentDto student = studentService.studentFeeItems(certNo);
        if(student == null){
            res.setCode(-1);
            res.setDesc("未找到学生费用信息");
        }else{
            res.setData(student);
        }

        return res;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public ResponseDto save(@RequestBody StudentDto studentDto){
        ResponseDto res = new ResponseDto();

        studentService.save(studentDto);

        return res;
    }

}
