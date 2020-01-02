package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.BookingformMapper;
import com.woniu.domain.Bookingform;
import com.woniu.service.BookingFormService;
@Service
@Transactional
public class BookingformImpl implements BookingFormService{
    @Autowired
	private BookingformMapper  mapper;
	@Override
	public void save(Bookingform bookingform) {
		// TODO Auto-generated method stub
		mapper.insertSelective(bookingform);
	}

	@Override
	public void update(Bookingform bookingform) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(bookingform);
	}

	@Override
	public void delete(Integer bookingid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(bookingid);
	}

	@Override
	public Bookingform find(Integer bookingid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(bookingid);
	}
	@Override
	public List<Bookingform> find() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}
}
