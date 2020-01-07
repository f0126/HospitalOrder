package com.woniu.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Patient;
import com.woniu.domain.Roles;
import com.woniu.service.PatientService;

@Controller
@RequestMapping("patients")
public class PatientController {

	@Autowired
	PatientService service;
	
	@RequiresPermissions("patient:find")
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<Patient> patientList = service.findAll();
		model.addAttribute("patientList", patientList);
		return "admin/patients/findUI";
	}
	
	@RequiresPermissions("patient:save")
	@RequestMapping("save")
	public String save(Patient patient) {
		service.save(patient);
		return "redirect:/patients/findAll";
	}
	
	@RequiresPermissions("patient:delete")
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/patients/findAll";
	}
	
	@RequiresPermissions("patient:find")
	@RequestMapping("findOne/{id}")
	public String findOne(@PathVariable Integer id,Model model) {
		Patient patient = service.findOne(id);
		model.addAttribute("patient",patient);
		return "admin/patients/updateUI";
	}
	
	@RequiresPermissions("patient:update")
	@RequestMapping("update")
	public String update(Patient patient) {
		service.update(patient);
		return "redirect:/patients/findAll";
	}
}
