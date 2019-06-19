package com.jalinyiel.coursystem.system.controller;

import com.jalinyiel.coursystem.system.domain.Course;
import com.jalinyiel.coursystem.system.domain.Message;
import com.jalinyiel.coursystem.system.service.CourseService;
import com.jalinyiel.coursystem.system.utils.Jumper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class CourseController {
    @Autowired
    Jumper jumper;
    @Autowired
    CourseService courseService;

    @RequestMapping("/courseInformation")
    public String gotoCourseInformation(Model model, HttpServletRequest request) {
        List<Course> courses = courseService.getAll();
        model.addAttribute("courses",courses);
        return jumper.go("/manager/courses_information",request);
    }

    @RequestMapping("/allcourses")
    public String gotoStuCourseInformation(Model model, HttpServletRequest request) {
        List<Map<String,Object>> courseWithTea = courseService.getAllWithTea();
        model.addAttribute("courses",courseWithTea);
        return jumper.go("/student/stuCourses",request);
    }

    @RequestMapping("/teaAllCourses")
    public String gotoTeaCourseInformation(Model model, HttpServletRequest request) {
        List<Course> courses = courseService.getAll();
        model.addAttribute("courses",courses);
        return jumper.go("/teacher/teaCourses",request);
    }

    @RequestMapping(value = "/courseUpdate",method = RequestMethod.POST)
    @ResponseBody
    public Message updateCourse(@RequestBody Course course) {
        System.out.println(course.getCourNo());
        System.out.println(course.getCourName());
        System.out.println(course.getCredit());
        courseService.update(course);
        return Message.success();
    }

    @RequestMapping(value = "/deleteCourse",method = RequestMethod.POST)
    @ResponseBody
    public Message deleteCourseByNo( Long courNo) {
        System.out.println(courNo);
        courseService.deleteByNo(courNo);
        return Message.success();
    }

    @RequestMapping(value = "/createCourse",method = RequestMethod.POST)
    @ResponseBody
    public Message createNewCourse(@RequestBody Course course) {
        courseService.insert(course);
        return Message.success();
    }

}
