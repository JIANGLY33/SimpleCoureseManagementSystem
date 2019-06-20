package com.jalinyiel.coursystem.system.service;

import com.jalinyiel.coursystem.system.domain.User;
import com.jalinyiel.coursystem.system.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public boolean checkUser(User user) {
        User tempuser = userMapper.getOne(user.getUserId());
        boolean flag = false;
        if(tempuser.getPassword().equals(user.getPassword()) && tempuser.getIdentity().equals(user.getIdentity()))flag = true;
        return flag;
    }

    public User getById(Long id) {
        return userMapper.getOne(id);
    }
    public void modifyPassword(User user) {
        userMapper.modifyPassword(user);
    }

    public void deleteById(Long id) {
        userMapper.deleteById(id);
    }

    public void changePasswordById(User user) {
        System.out.println(user);
//        userMapper.changePasswordById(user);
        userMapper.modifyPassword(user);
    }

    public void insert(User user) {
        userMapper.insert(user);
    }
}
