package com.jalinyiel.coursystem.system.repository;

import com.jalinyiel.coursystem.system.domain.Choose;
import com.jalinyiel.coursystem.system.domain.ChooseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChooseMapper {
    long countByExample(ChooseExample example);

    int deleteByExample(ChooseExample example);

    int insert(Choose record);

    int insertSelective(Choose record);

    List<Choose> selectByExample(ChooseExample example);

    int updateByExampleSelective(@Param("record") Choose record, @Param("example") ChooseExample example);

    int updateByExample(@Param("record") Choose record, @Param("example") ChooseExample example);
}