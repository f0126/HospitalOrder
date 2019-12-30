package com.woniu.dao;

import com.woniu.domain.Nurse;
import com.woniu.domain.NurseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurseMapper {
    long countByExample(NurseExample example);

    int deleteByExample(NurseExample example);

    int deleteByPrimaryKey(Integer nurseid);

    int insert(Nurse record);

    int insertSelective(Nurse record);

    List<Nurse> selectByExample(NurseExample example);

    Nurse selectByPrimaryKey(Integer nurseid);

    int updateByExampleSelective(@Param("record") Nurse record, @Param("example") NurseExample example);

    int updateByExample(@Param("record") Nurse record, @Param("example") NurseExample example);

    int updateByPrimaryKeySelective(Nurse record);

    int updateByPrimaryKey(Nurse record);
}