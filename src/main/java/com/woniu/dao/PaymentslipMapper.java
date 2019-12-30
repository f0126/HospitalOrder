package com.woniu.dao;

import com.woniu.domain.Paymentslip;
import com.woniu.domain.PaymentslipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentslipMapper {
    long countByExample(PaymentslipExample example);

    int deleteByExample(PaymentslipExample example);

    int deleteByPrimaryKey(Integer paymentslipid);

    int insert(Paymentslip record);

    int insertSelective(Paymentslip record);

    List<Paymentslip> selectByExample(PaymentslipExample example);

    Paymentslip selectByPrimaryKey(Integer paymentslipid);

    int updateByExampleSelective(@Param("record") Paymentslip record, @Param("example") PaymentslipExample example);

    int updateByExample(@Param("record") Paymentslip record, @Param("example") PaymentslipExample example);

    int updateByPrimaryKeySelective(Paymentslip record);

    int updateByPrimaryKey(Paymentslip record);
}