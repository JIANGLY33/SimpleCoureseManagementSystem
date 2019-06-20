package com.jalinyiel.coursystem.system.repository;

import com.jalinyiel.coursystem.system.domain.Choose;
import com.jalinyiel.coursystem.system.domain.ChooseDTO;
import java.util.List;

import org.apache.ibatis.annotations.*;

public interface ChooseMapper {

    @Select("SELECT * FROM choose")
    @Results({
            @Result(column = "stu_id",property = "stuId"),
            @Result(column = "cour_no",property = "courNo"),
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "grades",property = "grades")
    })
    List<Choose> getAll();

    @Select("SELECT * FROM choose WHERE stu_id = #{uerId}")
    @Results({
            @Result(column = "stu_id",property = "stuId"),
            @Result(column = "cour_no",property = "courNo"),
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "grades",property = "grades")
    })
    List<Choose> findById(Long userId);

    @Update("UPDATE choose SET grades = #{grades} WHERE stu_id = #{stuId} AND " +
            "cour_no = #{courNo} AND teacher_id = #{teacherId}")
    void changeGrades(Choose choose);

    @Delete("DELETE FROM choose WHERE stu_id = #{stuId} AND " +
    "cour_no = #{courNo} AND teacher_id = #{teacherId} ")
    void deleteChoose(Choose choose);

    @Insert("INSERT INTO choose(stu_id,cour_no,teacher_id,grades) VALUES (#{stuId},#{courNo},#{teacherId},#{grades})")
    void add(Choose choose);

    @Select("SELECT choose.stu_id,choose.cour_no,stu_name,cour_name,grades,teacher_id FROM choose,student,course " +
            "WHERE choose.stu_id = student.stu_id AND choose.cour_no = course.cour_no AND teacher_id = #{teaId} " +
            "AND choose.cour_no = #{courNo}")
    @Results({
            @Result(column = "stu_id",property = "stuId"),
            @Result(column = "cour_no",property = "courNo"),
            @Result(column = "teacher_id",property = "teacherId"),
            @Result(column = "grades",property = "grades"),
            @Result(column = "stu_name",property = "stuName"),
            @Result(column = "cour_name",property = "courName")
    })
    List<ChooseDTO> findByTeaIdAndCourNo(Long teaId, Integer courNo);
}