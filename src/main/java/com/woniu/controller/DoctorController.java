package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Consultingroom;
import com.woniu.domain.Department;
import com.woniu.domain.Doctor;
import com.woniu.domain.Users;
import com.woniu.service.ConsultingroomService;
import com.woniu.service.DepartmentService;
import com.woniu.service.DoctorService;
import com.woniu.service.UsersService;

@Controller
@RequestMapping("doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService service;
	
	@Autowired
	private ConsultingroomService roomService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private UsersService userService;
	
	@RequestMapping("selectAll")
	public String selectAll(Model model) {
		List<Doctor> list = service.selectAll();
		model.addAttribute("list",list);
		return "admin/doctor/selectUI";
	}
	
	@RequestMapping("selectById/{doctorid}")
	public String selectById(@PathVariable Integer doctorid,Model model) {
		Doctor d = service.selectById(doctorid);
		model.addAttribute("d",d);
		List<Consultingroom> room = roomService.findAll();
		List<Department> department = departmentService.findAll();
		List<Users> user = userService.findAll();
		model.addAttribute("room",room);
		model.addAttribute("department",department);
		model.addAttribute("user",user);
		return "/admin/doctor/update";
	}
	
	@RequestMapping("saveUI")
	public String saveUI(Model model) {
		List<Consultingroom> room = roomService.findAll();
		List<Department> department = departmentService.findAll();
		List<Users> user = userService.findAll();
		model.addAttribute("room",room);
		model.addAttribute("department",department);
		model.addAttribute("user",user);
		return "/admin/doctor/saveUI";
	}
	
	@RequestMapping("save")
	public String save(Doctor doctor) {
		service.save(doctor);
		return "redirect:/doctor/selectAll";
	}
	
	@RequestMapping("delete/{doctorid}")
	public String delete(@PathVariable Integer doctorid) {
		service.delete(doctorid);
		return "redirect:/doctor/selectAll";
	}
	
	@RequestMapping("update")
	public String update(Doctor doctor) {
		service.update(doctor);
		return "redirect:/doctor/selectAll";
	}

}
