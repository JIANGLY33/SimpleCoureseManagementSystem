package com.jalinyiel.coursystem.system.controller;

import com.jalinyiel.coursystem.system.domain.Message;
import com.jalinyiel.coursystem.system.domain.Teacher;
import com.jalinyiel.coursystem.system.domain.TeacherDTO;
import com.jalinyiel.coursystem.system.domain.User;
import com.jalinyiel.coursystem.system.service.TeacherService;
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
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @Autowired
    UserService userService;
    @Autowired
    Jumper jumper;

    @RequestMapping("/teachersInformation")
    public String gotoTeachersInformation(Model model, HttpServletRequest request) {
        List<TeacherDTO> teacherDTOS = teacherService.getAllDto();
        model.addAttribute("teachers",teacherDTOS);
        return jumper.go("manager/teachers_information",request);
    }

    @RequestMapping("/gotoTeaIndex")
    public String gotoTeaIndex(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        Teacher teacher = teacherService.findById(user.getUserId());
        model.addAttribute("teacher",teacher);
        return "teacher/teacherInfo";
    }

    @RequestMapping(value = "/teaUpdate",method = RequestMethod.POST)
    @ResponseBody
    public Message updateTeacher(@RequestBody Teacher teacher) {
        teacherService.update(teacher);
        return Message.success();
    }

    @RequestMapping(value = "/deleteTeacher",method = RequestMethod.POST)
    @ResponseBody
    public Message deleteById(Long teacherId) {
        System.out.println(teacherId);
        teacherService.deleteById(teacherId);
        return Message.success();
    }

    @RequestMapping(value = "/createTeacher",method = RequestMethod.POST)
    @ResponseBody
    public Message createTeacher(Teacher teacher) {
        teacherService.insert(teacher);
        return Message.success();
    }
}
