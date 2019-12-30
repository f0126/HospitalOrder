package com.woniu.dao;

import com.woniu.domain.Bookingform;
import com.woniu.domain.BookingformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookingformMapper {
    long countByExample(BookingformExample example);

    int deleteByExample(BookingformExample example);

    int deleteByPrimaryKey(Integer bookingid);

    int insert(Bookingform record);

    int insertSelective(Bookingform record);

    List<Bookingform> selectByExample(BookingformExample example);

    Bookingform selectByPrimaryKey(Integer bookingid);

    int updateByExampleSelective(@Param("record") Bookingform record, @Param("example") BookingformExample example);

    int updateByExample(@Param("record") Bookingform record, @Param("example") BookingformExample example);

    int updateByPrimaryKeySelective(Bookingform record);

    int updateByPrimaryKey(Bookingform record);
}