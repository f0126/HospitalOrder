package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.NurseMapper;
import com.woniu.domain.Nurse;
import com.woniu.service.NurseService;

@Service
@Transactional
public class NurseServiceImpl implements NurseService{
	@Autowired
	NurseMapper mapper;
	@Override
	public void save(Nurse n) {
		mapper.insertSelective(n);
		
	}

	@Override
	public void delete(Integer nid) {
		mapper.deleteByPrimaryKey(nid);
		
	}

	@Override
	public void update(Nurse n) {
		mapper.updateByPrimaryKeySelective(n);
		
	}

	@Override
	public List<Nurse> findAll() {
		
		return mapper.selectByExample(null);
	}

	@Override
	public Nurse findOne(Integer nid) {
		
		return mapper.selectByPrimaryKey(nid);
	}
	
}
