package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DepartmentMapper;
import com.woniu.domain.Department;
import com.woniu.service.DepartmentService;
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentMapper departMapper;
	
	@Override
	public void save(Department department) {
		departMapper.insertSelective(department);
	}

	@Override
	public void delete(Integer departmentId) {
		departMapper.deleteByPrimaryKey(departmentId);
	}

	@Override
	public void update(Department department) {
		departMapper.updateByPrimaryKeySelective(department);
	}

	@Override
	public List<Department> findAll() {
		return departMapper.selectByExample(null);
	}

	@Override
	public Department findOne(Integer departmentId) {
		return departMapper.selectByPrimaryKey(departmentId);
	}

}
