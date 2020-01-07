package com.woniu.service;

import java.util.List;

import com.woniu.domain.Patient;

public interface PatientService {
	void save(Patient patient);
	void delete(Integer patientid);
	void update(Patient patient);
	Patient findOne(Integer patientid);
	List<Patient> findAll();
}
