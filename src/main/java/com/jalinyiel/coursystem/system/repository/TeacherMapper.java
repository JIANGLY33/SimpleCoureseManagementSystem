package com.jalinyiel.coursystem.system.repository;

import com.jalinyiel.coursystem.system.domain.Teacher;
import com.jalinyiel.coursystem.system.domain.TeacherDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface TeacherMapper {
    @Select("SELECT * FROM teacher")
    @Results({
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "teacher_name",property = "teacherName"),
            @Result(column = "department",property = "department")
    })
    List<Teacher> getAll();


    @Select("SELECT teacher_id,teacher_name,department,password FROM teacher,user " +
            "WHERE teacher_id = user_id")
    @Results({
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "teacher_name",property = "teacherName"),
            @Result(column = "department",property = "department"),
            @Result(column = "password",property = "password")
    })
    List<TeacherDTO> getAllTeacherDTO();

    @Select("SELECT * FROM teacher WHERE teacher_id = #{id}")
    @Results({
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "teacher_name",property = "teacherName"),
            @Result(column = "department",property = "department")
    })
    Teacher findById(Long id);

    @Delete("DELETE FROM teacher WHERE teacher_id = #{id}")
    void deleteById(Long id);

    @Update("UPDATE teacher SET teacher_name = #{teacherName},department = #{department} WHERE teacher_id = #{teacherId}")
    void update(Teacher teacher);

    @Insert("INSERT INTO teacher(teacher_id,teacher_name,department) VALUES (#{teacherId},#{teacherName},#{department})")
    void insert(Teacher teacher);
}