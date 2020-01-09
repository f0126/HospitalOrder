package com.woniu.service;

import java.util.List;

import com.woniu.domain.Nurse;

public interface NurseService {
	void save(Nurse n);
	void delete(Integer nid);
	void update(Nurse n);
	List<Nurse> findAll();
	Nurse findOne(Integer nid);
}
