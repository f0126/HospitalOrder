package com.woniu.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.service.PermissionsService;
import com.woniu.service.RolesService;

@Controller
@RequestMapping("roles")
public class RolesController {
	
	@Autowired
	RolesService service;
	@Autowired
	PermissionsService pservice;
	
	@RequiresPermissions("role:save")
	@RequestMapping("save")
	public String save(Roles r) {
		service.save(r);
		return "redirect:/roles/findAll";
	}
	
	@RequiresPermissions("role:find")
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<Roles> rolesList = service.findAll();
		model.addAttribute("rolesList",rolesList);
		return "admin/roles/findUI";
	}
	
	@RequiresPermissions("role:delete")
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/roles/findAll";
	}
	
	@RequiresPermissions("role:find")
	@RequestMapping("findOne/{id}")
	public String findOne(@PathVariable Integer id,Model model) {
		Roles role = service.findOne(id);
		model.addAttribute("role",role);
		return "admin/roles/updateUI";
	}
	
	@RequiresPermissions("role:update")
	@RequestMapping("update")
	public String update(Roles r) {
		service.update(r);
		return "redirect:/roles/findAll";
	}
	
	@RequiresPermissions("role:authorization")
	@RequestMapping("dispensePermissionsUI/{id}")
	public String dispensePermissionsUI(@PathVariable Integer id,Model model) throws JsonProcessingException {
		Roles role = service.findOne(id);
		model.addAttribute("role",role);
		List<Permissions> plist = pservice.findAll();
		ObjectMapper om=new ObjectMapper();
		String treejson = om.writeValueAsString(plist);
		model.addAttribute("treejson", treejson);
		
		List<Permissions> hasedPermissions = service.getPermissionsByRid(id);
		String hasedPermissionsJson = om.writeValueAsString(hasedPermissions);
		model.addAttribute("hasedPermissionsJson", hasedPermissionsJson);
		return "admin/roles/dispensePermissionsUI";
	}
	
	@RequiresPermissions("role:authorization")
	@RequestMapping("dispensePermissions")
	public String dispensePermissions(Integer rid,Integer[] pids,Model model) {
		service.cancelPermissionsByRid(rid);
		service.insertBatch(rid, pids);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "redirect:/roles/dispensePermissionsUI/"+rid;
	}
}
