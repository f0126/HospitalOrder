package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Doctor;
import com.woniu.service.DoctorService;

@Controller
@RequestMapping("doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService service;
	
	@RequestMapping("selectAll")
	public String selectAll(Model model) {
		List<Doctor> list = service.selectAll();
		model.addAttribute("list",list);
		return null;
	}
	
	@RequestMapping("selectById/{doctorid}")
	public String selectById(@PathVariable Integer doctorid,Model model) {
		Doctor d = service.selectById(doctorid);
		model.addAttribute("d",d);
		return null;
	}

}
