package com.jalinyiel.coursystem.system.controller;

import com.jalinyiel.coursystem.system.domain.*;
import com.jalinyiel.coursystem.system.service.ChooseService;
import com.jalinyiel.coursystem.system.service.CourseService;
import com.jalinyiel.coursystem.system.service.StudentService;
import com.jalinyiel.coursystem.system.service.TeacherService;
import com.jalinyiel.coursystem.system.utils.Jumper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
public class ChooseController {
    @Autowired
    ChooseService chooseService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;
    @Autowired
    Jumper jumper;

    @RequestMapping("/grades")
    public String gotoGrades(Model model, HttpServletRequest request) {
        List<Choose> grades = chooseService.getAll();
        model.addAttribute("grades",grades);
        return jumper.go("manager/grades",request);
    }

    @RequestMapping("/choosedCourses")
    public String gotoStuChoosedCourses(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("user");
        List<Choose> choose = chooseService.findById(user.getUserId());
        List<Map<String,Object>> res = new LinkedList<>();
        for(Choose choose1:choose) {
            Map<String,Object> choosedCourseModel = new HashMap<>();
            Student student = studentService.findById(choose1.getStuId());
            Teacher teacher = teacherService.findById(choose1.getTeacherId());
            Course course = courseService.findByNo(choose1.getCourNo());
            choosedCourseModel.put("stuName",student.getStuName());
            choosedCourseModel.put("courName",course.getCourName());
            choosedCourseModel.put("teaName",teacher.getTeacherName());
            choosedCourseModel.put("grades",choose1.getGrades());
            res.add(choosedCourseModel);
        }
        model.addAttribute("choosedCourses",res);
        return "student/choosedCourses";
    }

    @RequestMapping(value = "/changeGrades",method = RequestMethod.POST)
    @ResponseBody
    public Message changeGrades(@RequestBody Choose choose) {
        System.out.println(choose);
        chooseService.updateGrades(choose);
        return Message.success();
    }

    @RequestMapping(value = "/deleteChoose",method = RequestMethod.POST)
    @ResponseBody
    public Message deleteChoose(@RequestBody Choose choose) {
        chooseService.deleteChoose(choose);
        return Message.success();
    }

    @RequestMapping(value = "/chooseCourse",method = RequestMethod.POST)
    @ResponseBody
    public Message chooseCourse(Integer courNo, Long teacherId,HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        Choose choose = new Choose(user.getUserId(),courNo,teacherId);
        chooseService.addChoose(choose);
        return Message.success();
    }

    @RequestMapping(value = "/quitCourse",method = RequestMethod.POST)
    @ResponseBody
    public Message quitCourse(Integer courNo, Long teacherId,HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        Choose choose = new Choose(user.getUserId(),courNo,teacherId);
        chooseService.deleteChoose(choose);
        return Message.success();
    }

    @RequestMapping("/checkStudents")
    public String gotoCheckStudent(Integer courNo, HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        System.out.println("userId: " + user.getUserId() + "courNo :" + courNo);
        List<ChooseDTO> chooseModels = chooseService.findByTeaIdAndCourNo(user.getUserId(),courNo);
        model.addAttribute("tasks",chooseModels);
        for(ChooseDTO chooseDTO:chooseModels) {
            System.out.println(chooseDTO);
        }
        return "teacher/checkStu";
    }

    @RequestMapping(value = "/createChoose",method = RequestMethod.POST)
    @ResponseBody
    public Message cretaeChoose(@RequestBody Choose choose) {
        chooseService.addChoose(choose);
        return Message.success();
    }
}
