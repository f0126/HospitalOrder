package com.woniu.service;

import java.util.List;

import com.woniu.domain.Project;

public interface ProjectService {
	void save(Project p);
	void delete(Integer id);
	void update(Project p);
	Project findOne(Integer id);
	List<Project> find();
}
