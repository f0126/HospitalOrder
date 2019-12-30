package com.woniu.dao;

import com.woniu.domain.Queuing;
import com.woniu.domain.QueuingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueuingMapper {
    long countByExample(QueuingExample example);

    int deleteByExample(QueuingExample example);

    int deleteByPrimaryKey(Integer queuingid);

    int insert(Queuing record);

    int insertSelective(Queuing record);

    List<Queuing> selectByExample(QueuingExample example);

    Queuing selectByPrimaryKey(Integer queuingid);

    int updateByExampleSelective(@Param("record") Queuing record, @Param("example") QueuingExample example);

    int updateByExample(@Param("record") Queuing record, @Param("example") QueuingExample example);

    int updateByPrimaryKeySelective(Queuing record);

    int updateByPrimaryKey(Queuing record);
}