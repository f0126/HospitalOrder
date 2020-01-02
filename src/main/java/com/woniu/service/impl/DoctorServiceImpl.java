package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DoctorMapper;
import com.woniu.domain.Doctor;
import com.woniu.service.DoctorService;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorMapper mapper;

	@Override
	public void save(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer doctorid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Doctor> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor selectById(Integer doctorid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
