package com.jalinyiel.coursystem.system.controller;

import com.jalinyiel.coursystem.system.domain.Message;
import com.jalinyiel.coursystem.system.domain.Student;
import com.jalinyiel.coursystem.system.domain.StudentDTO;
import com.jalinyiel.coursystem.system.domain.User;
import com.jalinyiel.coursystem.system.service.StudentService;
import com.jalinyiel.coursystem.system.service.UserService;
import com.jalinyiel.coursystem.system.utils.Jumper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    UserService userService;
    @Autowired
    Jumper jumper;


    @RequestMapping("/studentsInformation")
    public String gotoStudentsInformation(Model model,HttpServletRequest request) {
        List<StudentDTO> studentDTOS = studentService.getAllStuDTO();
        model.addAttribute("students",studentDTOS);
        return jumper.go("/manager/students_information",request);
    }

    @RequestMapping("/gotoStudentIndex")
    public String getAStudentInfo(Model model,HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        Student student= studentService.findById(user.getUserId());
        System.out.println(student);
        model.addAttribute("student",student);
        return "student/studentInfo";
    }

    @RequestMapping(value = "/stuUpdate",method = RequestMethod.POST)
    @ResponseBody
    public Message updateStudent(@RequestBody Student student) {
        studentService.update(student);
        return Message.success();
    }

    @RequestMapping(value = "deleteStudent",method = RequestMethod.POST)
    @ResponseBody
    public Message deleteById(Long stuId) {
        System.out.println(stuId);
        studentService.deleteById(stuId);
        return Message.success();
    }

    @RequestMapping(value = "/createStudent",method = RequestMethod.POST)
    @ResponseBody
    public Message createStudent(@RequestBody Student student) {
        studentService.insert(student);
        return Message.success();
    }
}

