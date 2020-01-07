package com.woniu.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

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
	public String save(MultipartFile doctorphoto2,Doctor doctor) {
		try {
			//获得后缀
			//获得原始名字点的位标
			int lastDotIndex=doctorphoto2.getOriginalFilename().lastIndexOf('.');
			//获得包含点在内的所有字母
			String lastDot=doctorphoto2.getOriginalFilename().substring(lastDotIndex);
			String newFileName=UUID.randomUUID().toString()+lastDot;
			String uploadPath=new File("").getAbsolutePath()+"/src/main/webapp/images";
			File uploadDir=new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdirs();
			}
			doctorphoto2.transferTo(new File(uploadDir,newFileName));
			doctor.setDoctorphoto(newFileName);
			service.save(doctor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/doctor/selectAll";
	}
	
	@RequestMapping("delete/{doctorid}")
	public String delete(@PathVariable Integer doctorid) {
		service.delete(doctorid);
		return "redirect:/doctor/selectAll";
	}
	
	@RequestMapping("update")
	public String update(MultipartFile doctorphoto2,Doctor doctor) {
		try {
			int lastDotIndex=doctorphoto2.getOriginalFilename().lastIndexOf('.');
			String lastDot=doctorphoto2.getOriginalFilename().substring(lastDotIndex);
			String newFileName=UUID.randomUUID().toString()+lastDot;
			String uploadPath=new File("").getAbsolutePath()+"/src/main/webapp/images";
			File uploadDir=new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdirs();
			}
			doctorphoto2.transferTo(new File(uploadPath,newFileName));
			doctor.setDoctorphoto(newFileName);
			service.update(doctor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/doctor/selectAll";
	}

}
