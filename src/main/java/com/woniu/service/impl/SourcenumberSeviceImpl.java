package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.SourcenumberMapper;
import com.woniu.domain.Sourcenumber;
import com.woniu.service.SourcenumberService;

@Service
@Transactional
public class SourcenumberSeviceImpl implements SourcenumberService{

	@Autowired
	SourcenumberMapper mapper;
	@Override
	public void save(Sourcenumber s) {
		mapper.insertSelective(s);
	}

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Sourcenumber s) {
		mapper.updateByPrimaryKeySelective(s);
	}

	@Override
	public Sourcenumber findOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Sourcenumber> find() {
		return mapper.selectByExample(null);
	}

	@Override
	public Sourcenumber selectConnectProject(Integer id) {
		return mapper.selectConnectProject(id);
	}

	@Override
	public List<Sourcenumber> selectAll() {
		return mapper.selectAll();
	}

}
