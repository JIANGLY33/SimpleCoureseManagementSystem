package com.jalinyiel.coursystem.system.repository;

import com.jalinyiel.coursystem.system.domain.Course;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.*;

public interface CourseMapper {

    @Select("SELECT * FROM course")
    @Results({
            @Result(column = "cour_no",property = "courNo"),
            @Result(column = "cour_name",property = "courName"),
            @Result(column = "credit",property = "credit")
    })
    List<Course> getAll();

    @Select("SELECT teach.cour_no,cour_name,teach.teacher_id,teacher_name,credit,time FROM teach,teacher,course " +
            "WHERE teach.cour_no = course.cour_no AND teach.teacher_id = teacher.teacher_id")
    @Results({
            @Result(column = "cour_no",property = "courNo"),
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "time",property = "time"),
            @Result(column = "credit",property = "credit"),
            @Result(column = "teacher_name",property = "teacherName"),
            @Result(column = "cour_name",property = "courName")
    })
    List<Map<String,Object>> getAllCourseWithTea();

    @Select("SELECT * FROM course WHERE cour_no = #{courNo}")
    @Results({
            @Result(column = "cour_no",property = "courNo"),
            @Result(column = "cour_name",property = "courName"),
            @Result(column = "credit",property = "credit")
    })
    Course findByNo(Integer no);

    @Update("UPDATE course SET cour_name = #{courName},credit = #{credit} WHERE cour_no = #{courNo}")
    void update(Course course);

    @Delete("DELETE FROM course WHERE cour_no = #{no}")
    void deleteByNo(Integer no);

    @Insert("INSERT INTO course(cour_no,cour_name,credit) VALUES (#{courNo},#{courName},#{credit})")
    void insert(Course course);
}