package com.woniu.service;

import java.util.List;

import com.woniu.domain.Department;

public interface DepartmentService {
	void save(Department department);
	void delete(Integer departmentId);
	void update(Department department);
	List<Department> findAll();
	Department findOne(Integer departmentId);
	
}
