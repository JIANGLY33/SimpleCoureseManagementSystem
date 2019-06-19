package com.jalinyiel.coursystem.system.service;

import com.jalinyiel.coursystem.system.domain.Teach;
import com.jalinyiel.coursystem.system.repository.TeachMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachService {
    @Autowired
    TeachMapper teachMapper;

    public List<Teach> getAll() {
        return teachMapper.getAll();
    }

    public List<Teach> findById(Long id) {
        return teachMapper.findById(id);
    }

    public void updateTeache(Teach teach) {
        teachMapper.updateTeache(teach);
    }

    public  void deleteTeach(Teach teach) {
        teachMapper.deleteTeach(teach);
    }

    public void add(Teach teach) {
        teachMapper.add(teach);
    }
}
