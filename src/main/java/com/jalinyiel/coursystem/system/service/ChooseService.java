package com.jalinyiel.coursystem.system.service;

import com.jalinyiel.coursystem.system.domain.Choose;
import com.jalinyiel.coursystem.system.domain.ChooseDTO;
import com.jalinyiel.coursystem.system.repository.ChooseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ChooseService {
    @Autowired
    ChooseMapper chooseMapper;

    public List<Choose> getAll() {
        return chooseMapper.getAll();
    }

    public  List<Choose> findById(Long id){
        return chooseMapper.findById(id);
    }

    public void updateGrades(Choose choose) {
        chooseMapper.changeGrades(choose);
    }

    public void deleteChoose(Choose choose) {
        chooseMapper.deleteChoose(choose);
    }

    public void addChoose(Choose choose) {
        chooseMapper.add(choose);
    }

    public List<ChooseDTO> findByTeaIdAndCourNo(Long teaId, Long courNo) {
        System.out.println("teaId: " +teaId + "courNo: " + courNo);
        return chooseMapper.findByTeaIdAndCourNo(teaId,courNo);
    }
}
