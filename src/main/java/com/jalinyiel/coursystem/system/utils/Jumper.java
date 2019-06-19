package com.jalinyiel.coursystem.system.utils;

import com.jalinyiel.coursystem.system.domain.User;
import com.jalinyiel.coursystem.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
public class Jumper {

    @Autowired
    UserService userService;

    public String go(String s, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        if(user == null)return "404";
        if(userService.checkUser(user))
            return s;
        return "404";
    }
}
