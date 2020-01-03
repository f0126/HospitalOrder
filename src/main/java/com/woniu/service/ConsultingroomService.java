package com.woniu.service;

import java.util.List;

import com.woniu.domain.Consultingroom;


public interface ConsultingroomService {

	void save(Consultingroom consulroom);
	void delete(Integer consulroomId);
	void update(Consultingroom consulroom);
	List<Consultingroom> findAll();
	Consultingroom findOne(Integer consulroomId);
}
