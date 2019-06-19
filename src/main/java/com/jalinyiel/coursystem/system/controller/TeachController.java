package com.jalinyiel.coursystem.system.controller;

import com.jalinyiel.coursystem.system.domain.Course;
import com.jalinyiel.coursystem.system.domain.Message;
import com.jalinyiel.coursystem.system.domain.Teach;
import com.jalinyiel.coursystem.system.domain.User;
import com.jalinyiel.coursystem.system.service.CourseService;
import com.jalinyiel.coursystem.system.service.TeachService;
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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
public class TeachController {
    @Autowired
    TeachService teachService;
    @Autowired
    CourseService courseService;
    @Autowired
    Jumper jumper;

    @RequestMapping("/teachingTasks")
    public String gotoTeachingTasks(Model model, HttpServletRequest request) {
        List<Teach> tasks = teachService.getAll();
        model.addAttribute("tasks",tasks);
        return jumper.go("/manager/teaching_task",request);
    }

    @RequestMapping("/tasks")
    public String gotoTeaTasks(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        List<Teach> teach = teachService.findById(user.getUserId());
        List<Map<String,Object>> res = new LinkedList<>();
        for(Teach teach1 : teach) {
            Course course = courseService.findByNo(teach1.getCourNo());
            Map<String,Object> taskModel = new HashMap<>();
            taskModel.put("courseName",course.getCourName());
            taskModel.put("credit",course.getCredit());
            taskModel.put("time",teach1.getTime());
            taskModel.put("courNo",course.getCourNo());
            res.add(taskModel);
        }
        model.addAttribute("tasks",res);
        return "teacher/tasks";
    }

    @RequestMapping("/taskUpdate")
    @ResponseBody
    public Message updateTeach(@RequestBody Teach teach) {
        teachService.updateTeache(teach);
        return Message.success();
    }

    @RequestMapping("/deleteTask")
    @ResponseBody
    public Message deleteTeach(@RequestBody Teach teach) {
        teachService.deleteTeach(teach);
        return Message.success();
    }

    @RequestMapping("/startCourse")
    @ResponseBody
    public Message startCourse(Long courNo, String time,HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        teachService.add(new Teach(user.getUserId(),courNo,time));
        return Message.success();
    }

    @RequestMapping("/endCourse")
    @ResponseBody
    public Message endCourse(Long courNo,HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        teachService.deleteTeach(new Teach(user.getUserId(),courNo,null));
        return Message.success();
    }

    @RequestMapping(value = "/createTeach",method = RequestMethod.POST)
    @ResponseBody
    public Message createTeach(@RequestBody Teach teach) {
        teachService.add(teach);
        return Message.success();
    }
}
