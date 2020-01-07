package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web	.bind.annotation.RequestMapping;

import com.woniu.domain.Project;
import com.woniu.service.ProjectService;

@Controller
@RequestMapping("projects")
public class ProjectController {

	@Autowired
	ProjectService service;
	
	@RequestMapping("save")
	public String save(Project p) {
		service.save(p);
		return "redirect:/projects/findAll";
	}
	
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<Project> plist = service.find();
		model.addAttribute("plist", plist);
		return "admin/projects/findUI";
	}
	
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/projects/findAll";
	}
	
	@RequestMapping("findOne/{id}")
	public String findOne(@PathVariable Integer id,Model model) {
		Project project = service.findOne(id);
		model.addAttribute("project", project);
		return "admin/projects/updateUI";
	}
	
	@RequestMapping("update")
	public String update(Project p) {
		service.update(p);
		return "redirect:/projects/findAll";
	}
}
