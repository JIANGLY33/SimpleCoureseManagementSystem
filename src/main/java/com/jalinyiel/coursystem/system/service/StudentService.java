package com.jalinyiel.coursystem.system.service;

import com.jalinyiel.coursystem.system.domain.Student;
import com.jalinyiel.coursystem.system.domain.StudentDTO;
import com.jalinyiel.coursystem.system.repository.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    public Student findById(Long stuId) {
        return studentMapper.findById(stuId);
    }

    public void deleteById(Long stuId) {
        studentMapper.deleteById(stuId);
    }

    public void update(Student student) {
        studentMapper.update(student);
    }

    public List<StudentDTO> getAllStuDTO() {
        return studentMapper.getAllStuDTO();
    }

    public void insert(Student student) {
        studentMapper.insert(student);
    }
}
