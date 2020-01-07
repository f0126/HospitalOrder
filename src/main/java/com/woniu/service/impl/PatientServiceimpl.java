package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.PatientMapper;
import com.woniu.domain.Patient;
import com.woniu.service.PatientService;

@Service
@Transactional
public class PatientServiceimpl implements PatientService {

	@Autowired
	PatientMapper mapper;
	
	@Override
	public void save(Patient patient) {
		mapper.insertSelective(patient);
	}

	@Override
	public void delete(Integer patientid) {
		mapper.deleteByPrimaryKey(patientid);
	}

	@Override
	public void update(Patient patient) {
		mapper.updateByPrimaryKeySelective(patient);
	}

	@Override
	public Patient findOne(Integer patientid) {
		return mapper.selectByPrimaryKey(patientid);
	}

	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
