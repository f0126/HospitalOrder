package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ConsultingroomMapper;
import com.woniu.domain.Consultingroom;
import com.woniu.service.ConsultingroomService;

@Service
@Transactional
public class ConsultingroomImpl implements ConsultingroomService{

	@Autowired
	private ConsultingroomMapper consMapper;
	
	@Override
	public void save(Consultingroom consulroom) {
		consMapper.insertSelective(consulroom);
	}

	@Override
	public void delete(Integer consulroomId) {
		consMapper.deleteByPrimaryKey(consulroomId);
	}

	@Override
	public void update(Consultingroom consulroom) {
		consMapper.updateByPrimaryKeySelective(consulroom);
	}

	@Override
	public List<Consultingroom> findAll() {
		return consMapper.selectByExample(null);
	}

	@Override
	public Consultingroom findOne(Integer consulroomId) {
		return consMapper.selectByPrimaryKey(consulroomId);
	}

}
