package com.jalinyiel.coursystem.system.service;

import com.jalinyiel.coursystem.system.domain.Teacher;
import com.jalinyiel.coursystem.system.domain.TeacherDTO;
import com.jalinyiel.coursystem.system.repository.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    public List<Teacher> getAll() {
        return teacherMapper.getAll();
    }

    public List<TeacherDTO> getAllDto() {
        return teacherMapper.getAllTeacherDTO();
    }

    public Teacher findById(Long id) {
        return teacherMapper.findById(id);
    }

    public void deleteById(Long id) {
        teacherMapper.deleteById(id);
    }

    public void update(Teacher teacher) {
        teacherMapper.update(teacher);
    }

    public void insert(Teacher teacher) {
        teacherMapper.insert(teacher);
    }
}
