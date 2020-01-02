package com.woniu.service;

import java.util.List;

import com.woniu.domain.Doctor;

public interface DoctorService {

	List<Doctor> selectAll();
	Doctor selectById(Integer doctorid);
	
}
