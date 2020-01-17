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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.domain.Nurse;
import com.woniu.service.NurseService;
import com.woniu.service.RolesService;

@Controller
@RequestMapping("nurses")
public class NurseController {
	@Autowired
	NurseService service;
	@RequestMapping("findAll")
	public String findAll(Model model) throws JsonProcessingException {
		List<Nurse> nurseList = service.findAll();
		model.addAttribute("NurseList", nurseList);
		return "admin/nurse/findUI";
	}
	
	@RequestMapping("save")
	public String save(MultipartFile file,Nurse n) {
	
		try {
			//创建唯一的名字
			
			int lastDotIndex = file.getOriginalFilename().lastIndexOf('.');
			
			String ext = file.getOriginalFilename().substring(lastDotIndex);
			
			String newFileName = UUID.randomUUID().toString()+ext;
			
			String upLoadPath = new File("").getAbsolutePath()+"\\src\\main\\webapp\\admin\\images\\nursesPhoto";
			n.setNursephoto(newFileName);
			service.save(n);
			File upLoadDir = new File(upLoadPath);
			if(!upLoadDir.exists()) {
				upLoadDir.mkdirs();
			}
			file.transferTo(new File(upLoadPath,newFileName));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return "redirect:/nurses/findAll";
	}
	@RequestMapping("saveUI")
	public String saveUI(Model model) {
		return "admin/nurse/saveUI";
	}
	@RequestMapping("delete/{nurseid}")
	public String delete(@PathVariable Integer nurseid) {
		service.delete(nurseid);
		return "redirect:/nurses/findAll";
	}
	@RequestMapping("findOne/{nurseid}")
	public String findOne(@PathVariable Integer nurseid,Model model) {
		Nurse n = service.findOne(nurseid);
		model.addAttribute("Nurse",n);
		return "admin/nurse/updateUI";
	}
	@RequestMapping("update")
	public String update(Nurse n) {
		service.update(n);
		return "redirect:/nurses/findAll";
	}
	
	
}
