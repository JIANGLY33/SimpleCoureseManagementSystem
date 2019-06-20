package com.jalinyiel.coursystem.system.repository;

import com.jalinyiel.coursystem.system.domain.Student;
import com.jalinyiel.coursystem.system.domain.StudentDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface StudentMapper {
    @Select("SELECT * FROM student")
    @Results({
            @Result(column = "stu_id",property = "stuId"),
            @Result(column = "stu_name",property = "stuName"),
            @Result(column = "classes",property = "classes"),
            @Result(column = "subject",property = "subject")
    })
    List<Student> getAll();

    @Select("SELECT * FROM student WHERE stu_id = #{id}")
    @Results({
            @Result(column = "stu_id",property = "stuId"),
            @Result(column = "stu_name",property = "stuName"),
            @Result(column = "classes",property = "classes"),
            @Result(column = "subject",property = "subject")
    })
    Student findById(Long id);

    @Delete("DELETE FROM student WHERE stu_id = #{id}")
    void deleteById(Long id);

    @Update("UPDATE student SET stu_name = #{stuName},classes = #{classes},subject = #{subject} " +
            "WHERE stu_id = #{stuId}")
    void update(Student student);

    @Select("SELECT stu_id,stu_name,classes,subject,password FROM student,user WHERE " +
            "stu_id = user_id")
    @Results({
            @Result(column = "stu_id",property = "stuId"),
            @Result(column = "stu_name",property = "stuName"),
            @Result(column = "classes",property = "classes"),
            @Result(column = "subject",property = "subject"),
            @Result(column = "password",property = "password")
    })
    List<StudentDTO> getAllStuDTO();

    @Insert("INSERT INTO student(stu_id,stu_name,classes,subject) VALUES (#{stuId},#{stuName},#{classes},#{subject})")
    void insert(Student student);
}