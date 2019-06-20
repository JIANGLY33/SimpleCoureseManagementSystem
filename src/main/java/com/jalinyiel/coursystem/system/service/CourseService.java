package com.jalinyiel.coursystem.system.service;

import com.jalinyiel.coursystem.system.domain.Course;
import com.jalinyiel.coursystem.system.repository.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;

@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public List<Course> getAll() {
        return courseMapper.getAll();
    }

    public List<Map<String,Object>> getAllWithTea() {
        return courseMapper.getAllCourseWithTea();
    }

    public Course findByNo(Integer no) {
        return courseMapper.findByNo(no);
    }

    public void update(Course course) {
        courseMapper.update(course);
    }

    public void deleteByNo(Integer no) {
        courseMapper.deleteByNo(no);
    }

    public void insert(Course course) {
        courseMapper.insert(course);
    }
}
