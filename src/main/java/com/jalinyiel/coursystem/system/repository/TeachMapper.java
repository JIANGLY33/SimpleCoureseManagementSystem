package com.jalinyiel.coursystem.system.repository;

import com.jalinyiel.coursystem.system.domain.Teach;
import com.jalinyiel.coursystem.system.domain.TeachExample;
import com.jalinyiel.coursystem.system.domain.TeachKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachMapper {
    long countByExample(TeachExample example);

    int deleteByExample(TeachExample example);

    int deleteByPrimaryKey(TeachKey key);

    int insert(Teach record);

    int insertSelective(Teach record);

    List<Teach> selectByExample(TeachExample example);

    Teach selectByPrimaryKey(TeachKey key);

    int updateByExampleSelective(@Param("record") Teach record, @Param("example") TeachExample example);

    int updateByExample(@Param("record") Teach record, @Param("example") TeachExample example);

    int updateByPrimaryKeySelective(Teach record);

    int updateByPrimaryKey(Teach record);
}