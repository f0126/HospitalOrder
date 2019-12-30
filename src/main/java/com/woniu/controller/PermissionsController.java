package com.woniu.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.stat.TableStat.Mode;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.domain.Permissions;
import com.woniu.service.PermissionsService;

@Controller
@RequestMapping("permissions")
public class PermissionsController {
	@Autowired
	PermissionsService service;
	
	@RequiresPermissions("permission:find")
	@RequestMapping("findAll")
	public String findAll(Model model) throws JsonProcessingException {
		List<Permissions> alllist = service.findAll();
		ObjectMapper om=new ObjectMapper();
		String treejson = om.writeValueAsString(alllist);
		model.addAttribute("treejson", treejson);
		return "admin/permissions/findUI";
	}
	
	@RequiresPermissions("permission:save")
	@RequestMapping("saveUI")
	public String saveUI(Model model) {
		List<Permissions> treeList = service.findPermissionByTree();
		List<Permissions> transformTree2Oneview = service.transformTree2Oneview(treeList);
		model.addAttribute("alllist", transformTree2Oneview);
		return "admin/permissions/saveUI";
	}
	
	@RequiresPermissions("permission:save")
	@RequestMapping("save")
	public String save(Permissions p) {
		service.save(p);
		return "redirect:/permissions/findAll";
	}
	
	@RequiresPermissions("permission:delete")
	@RequestMapping("delete/{pid}")
	public String delete(@PathVariable Integer pid) {
		service.delete(pid);
		return "redirect:/permissions/findAll";
	}
	
	@RequiresPermissions("permission:find")
	@RequestMapping("findOne/{pid}")
	public String findOne(@PathVariable Integer pid,Model model) {
		Permissions permissions = service.findOne(pid);
		model.addAttribute("p",permissions);
		List<Permissions> alllist = service.findAll();
		model.addAttribute("alllist", alllist);
		return "admin/permissions/updateUI";
	}
	
	@RequiresPermissions("permission:update")
	@RequestMapping("update")
	public String update(Permissions p) {
		service.update(p);
		return "redirect:/permissions/findAll";
	}
}
