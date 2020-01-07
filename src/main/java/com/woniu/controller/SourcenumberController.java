package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Project;
import com.woniu.domain.Sourcenumber;
import com.woniu.service.ProjectService;
import com.woniu.service.SourcenumberService;

@Controller
@RequestMapping("sourcenumbers")
public class SourcenumberController {
	
	@Autowired
	SourcenumberService service;
	@Autowired
	ProjectService pservice;
	
	@RequestMapping("save")
	public String save(Sourcenumber s) {
		s.setSurplusnum(s.getSourcenumup());
		service.save(s);
		return "redirect:/sourcenumbers/findAll";
	}
	@RequestMapping("saveUI")
	public String saveUI(Model model) {
		List<Project> plist = pservice.find();
		model.addAttribute("plist",plist);
		return "admin/sourcenumbers/saveUI";
	}
	@RequestMapping("findAll")
	public String find(Model model) {
		List<Sourcenumber> sourceNumberList = service.selectAll();
		model.addAttribute("slist", sourceNumberList);
		return "admin/sourcenumbers/findUI";
	}
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "admin/sourcenumbers/findUI";
	}
	
	@RequestMapping("findOne/{id}")
	public String findOne(@PathVariable Integer id,Model model) {
		Sourcenumber sourcenumber = service.selectConnectProject(id);
		model.addAttribute("sourcenumber", sourcenumber);
		List<Project> plist = pservice.find();
		model.addAttribute("plist",plist);
		return "admin/sourcenumbers/updateUI";
	}
	@RequestMapping("update")
	public String update(Sourcenumber s) {
		Sourcenumber sourcenumber = service.findOne(s.getSourceid());
		s.setSurplusnum(sourcenumber.getSurplusnum()+s.getSourcenumup()-sourcenumber.getSourcenumup());
		service.update(s);
		return "redirect:/sourcenumbers/findAll";
	}
}
