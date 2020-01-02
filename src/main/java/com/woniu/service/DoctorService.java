package com.woniu.service;

import java.util.List;

import com.woniu.domain.Doctor;

public interface DoctorService {

	void save(Doctor doctor);
	void update(Doctor doctor);
	void delete(Integer doctorid);
	List<Doctor> selectAll();
	Doctor selectById(Integer doctorid);
	
}
