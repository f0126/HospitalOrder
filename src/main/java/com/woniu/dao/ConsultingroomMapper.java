package com.woniu.dao;

import com.woniu.domain.Consultingroom;
import com.woniu.domain.ConsultingroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultingroomMapper {
    long countByExample(ConsultingroomExample example);

    int deleteByExample(ConsultingroomExample example);

    int deleteByPrimaryKey(Integer consroomid);

    int insert(Consultingroom record);

    int insertSelective(Consultingroom record);

    List<Consultingroom> selectByExample(ConsultingroomExample example);

    Consultingroom selectByPrimaryKey(Integer consroomid);

    int updateByExampleSelective(@Param("record") Consultingroom record, @Param("example") ConsultingroomExample example);

    int updateByExample(@Param("record") Consultingroom record, @Param("example") ConsultingroomExample example);

    int updateByPrimaryKeySelective(Consultingroom record);

    int updateByPrimaryKey(Consultingroom record);
}