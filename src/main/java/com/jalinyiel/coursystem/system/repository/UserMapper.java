package com.jalinyiel.coursystem.system.repository;

import com.jalinyiel.coursystem.system.domain.User;

import java.util.List;

import org.apache.ibatis.annotations.*;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE user_id = #{id}")
    @Results({
            @Result(column = "user_id",property = "userId"),
            @Result(column = "password",property = "password"),
            @Result(column = "identity",property = "identity")
    })
    User getOne(Long id);

    @Update("UPDATE user SET password = #{password} WHERE user_id = #{userId}")
    void modifyPassword(User user);

    @Delete("DELETE FROM user WHERE user_id = #{id}")
    void deleteById(Long id);

    @Insert("INSERT INTO user (user_id,password,identity) VALUES (#{userId},#{password},#{identity})")
    void insert(User user);
}