package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ProjectMapper;
import com.woniu.domain.Project;
import com.woniu.service.ProjectService;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectMapper mapper;
	@Override
	public void save(Project p) {
		mapper.insertSelective(p);
	}

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Project p) {
		mapper.updateByPrimaryKeySelective(p);
	}

	@Override
	public Project findOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Project> find() {
		return mapper.selectByExample(null);
	}

}
