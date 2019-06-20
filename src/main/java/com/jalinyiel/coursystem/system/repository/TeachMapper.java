package com.jalinyiel.coursystem.system.repository;

import com.jalinyiel.coursystem.system.domain.Teach;

import java.util.List;


import org.apache.ibatis.annotations.*;

public interface TeachMapper {

    @Select("SELECT * FROM teach")
    @Results({
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "cour_no",property = "courNo"),
            @Result(column = "time",property = "time")
    })
    List<Teach> getAll();

    @Select("SELECT * FROM teach WHERE teacher_id = #{id}")
    @Results({
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "cour_no",property = "courNo"),
            @Result(column = "time",property = "time")
    })
    List<Teach> findById(Long id);

    @Update("UPDATE teach SET time = #{time} WHERE teacher_id = #{teacherId} AND cour_no = #{courNo}")
    void updateTeach(Teach teach);

    @Delete("DELETE FROM teach WHERE teacher_id = #{teacherId} AND cour_no = #{courNo}")
    void deleteTeach(Teach teach);

    @Insert("INSERT INTO teach(teacher_id,cour_no,time) VALUES (#{teacherId},#{courNo},#{time})")
    void add(Teach teach);
}