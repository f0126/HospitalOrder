package com.woniu.dao;

import com.woniu.domain.Illnesscase;
import com.woniu.domain.IllnesscaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IllnesscaseMapper {
    long countByExample(IllnesscaseExample example);

    int deleteByExample(IllnesscaseExample example);

    int deleteByPrimaryKey(Integer caseid);

    int insert(Illnesscase record);

    int insertSelective(Illnesscase record);

    List<Illnesscase> selectByExampleWithBLOBs(IllnesscaseExample example);

    List<Illnesscase> selectByExample(IllnesscaseExample example);

    Illnesscase selectByPrimaryKey(Integer caseid);

    int updateByExampleSelective(@Param("record") Illnesscase record, @Param("example") IllnesscaseExample example);

    int updateByExampleWithBLOBs(@Param("record") Illnesscase record, @Param("example") IllnesscaseExample example);

    int updateByExample(@Param("record") Illnesscase record, @Param("example") IllnesscaseExample example);

    int updateByPrimaryKeySelective(Illnesscase record);

    int updateByPrimaryKeyWithBLOBs(Illnesscase record);

    int updateByPrimaryKey(Illnesscase record);
}