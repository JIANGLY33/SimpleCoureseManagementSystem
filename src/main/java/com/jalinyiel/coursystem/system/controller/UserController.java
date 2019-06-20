package com.jalinyiel.coursystem.system.controller;

import com.jalinyiel.coursystem.system.domain.Message;
import com.jalinyiel.coursystem.system.domain.Student;
import com.jalinyiel.coursystem.system.domain.User;
import com.jalinyiel.coursystem.system.service.StudentService;
import com.jalinyiel.coursystem.system.service.UserService;
import com.jalinyiel.coursystem.system.utils.Jumper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
//    @Autowired
//    StudentService studentService;

    @Autowired
    Jumper jumper;



    @RequestMapping("/")
    public String jumpIndex() {
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Message logIn(User user) {
        boolean flag = userService.checkUser(user);
        if(!flag) {
            return Message.fail().add("user",user);
        }
        else {
            return Message.success().add("user",user);
        }
    }

    @RequestMapping(value = "/manage",method = RequestMethod.POST)
    public String jump(User user,HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        if(user.getIdentity().equals("学生")){
            return "forward:/gotoStudentIndex";
        }
        else if(user.getIdentity().equals("教师")){
            return "forward:/gotoTeaIndex";
        }
        else return "manager/form_validation";
    }

    @RequestMapping("/changePassword")
    public String gotoChangePassword(HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        if(user.getIdentity().equals("超级管理员")) {
            return jumper.go("manager/form_validation",request);
        }
        else if(user.getIdentity().equals("教师")) {
            return jumper.go("forward:/gotoTeaIndex",request);
        } else {
            return jumper.go("forward:/gotoStudentIndex",request);
        }
    }

//    @RequestMapping("/studentsInformation")
//    public String gotoStudentsInformation(Model model, HttpServletRequest request) {
//        List<Student> students = studentService.getAll();
//        model.addAttribute("students",students);
//        for(Student s:students) System.out.println("表格：" + s);
//        return jumper.go("/manager/students_information",request);
//    }

//    @RequestMapping("/teachersInformation")
//    public String gotoTeachersInformation(HttpServletRequest request) {
//        return jumper.go("/manager/teachers_information",request);
//    }

//    @RequestMapping("/courseInformation")
//    public String gotoCourseInformation(HttpServletRequest request) {
//        return jumper.go("/manager/courses_information",request);
//    }

//    @RequestMapping("/grades")
//    public String gotoGrades(HttpServletRequest request) {
//        return jumper.go("/manager/grades",request);
//    }

//    @RequestMapping("/teachingTasks")
//    public String gotoTeachingTasks(HttpServletRequest request) {
//        return jumper.go("/manager/teaching_task",request);
//    }

//    public String go(String s,HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        User user = (User)session.getAttribute("user");
//        if(user == null)return "404";
//        if(userService.checkUser(user))
//            return s;
//        return "404";
//    }

    @RequestMapping("/logout")
    public String logOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "index";
    }

    @RequestMapping("/managerChangeInfo")
    @ResponseBody
    public Message changeManagerInf(String password,HttpServletRequest request) {
        HttpSession session = request.getSession();
        if(password == null)return Message.fail();
        else {
            User user = (User)session.getAttribute("user");
            user.setPassword(password);
            userService.modifyPassword(user);
            return Message.success();
        }

    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public Message deleteById(Long id) {
        userService.deleteById(id);
        return Message.success();
    }

    @RequestMapping("/updatePassword")
    @ResponseBody
    public Message updatePassword(@RequestBody User user) {
        userService.changePasswordById(user);
        return Message.success();
    }

    @RequestMapping(value = "/createUser",method = RequestMethod.POST)
    @ResponseBody
    public Message createNewUser(@RequestBody User user) {
        userService.insert(user);
        return Message.success();
    }

}
