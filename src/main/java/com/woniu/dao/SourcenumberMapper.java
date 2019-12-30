package com.woniu.dao;

import com.woniu.domain.Sourcenumber;
import com.woniu.domain.SourcenumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SourcenumberMapper {
    long countByExample(SourcenumberExample example);

    int deleteByExample(SourcenumberExample example);

    int deleteByPrimaryKey(Integer sourceid);

    int insert(Sourcenumber record);

    int insertSelective(Sourcenumber record);

    List<Sourcenumber> selectByExample(SourcenumberExample example);

    Sourcenumber selectByPrimaryKey(Integer sourceid);

    int updateByExampleSelective(@Param("record") Sourcenumber record, @Param("example") SourcenumberExample example);

    int updateByExample(@Param("record") Sourcenumber record, @Param("example") SourcenumberExample example);

    int updateByPrimaryKeySelective(Sourcenumber record);

    int updateByPrimaryKey(Sourcenumber record);
}