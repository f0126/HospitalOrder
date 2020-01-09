package com.woniu.controller;

import java.util.List;
import java.util.UUID;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.annotation.Function;
import com.woniu.domain.Roles;
import com.woniu.domain.Users;
import com.woniu.service.RolesService;
import com.woniu.service.UsersService;

@Controller
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UsersService service;
	@Autowired
	RolesService rservice;
	@RequestMapping("login")
	@Function("用户登录")
	public String login(String username,String password,Model model) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(username,password);
		try {
			subject.login(token);
		} catch (Exception e) {
			System.out.println("用户名或密码错误");
		}
		if(subject.isAuthenticated()) {
			return "redirect:/admin/main.jsp";
		}else {
			return "redirect:/admin/login.jsp";
		}
	}
	
	@RequiresPermissions("user:find")
	@RequestMapping("findAll")
	@Function("查看所有用户")
	public String findAll(Model model) {
		List<Users> userList=service.findAll();
		model.addAttribute("userList", userList);
		return "admin/users/findUI";
	}
	
	@RequiresPermissions("user:save")
	@RequestMapping("saveUI")
	public String saveUI(Model model) {
		
		return "admin/users/saveUI";
	}
	
	@RequiresPermissions("user:save")
	@RequestMapping("save")
	public String save(Users u) {
		String password=u.getPassword();
		String salt=UUID.randomUUID()+"";
		SimpleHash hash=new SimpleHash("md5",password,salt,10);
		String hex = hash.toHex();
		u.setPassword(hex);
		u.setSalt(salt);
		service.save(u);
		return "redirect:/users/findAll";
	}
	
	@RequiresPermissions("user:delete")
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/users/findAll";
	}
	
	@RequestMapping("findOne/{id}")
	public String findOne(@PathVariable Integer id,Model model) {
		Users user = service.findOne(id);
		model.addAttribute("user", user);
		return "admin/users/updateUI";
	}
	
	@RequiresPermissions("user:update")
	@RequestMapping("update")
	public String update(Users u) {
		service.update(u);
		return "redirect:/users/findAll";
	}
	
	@RequiresPermissions("user:authorization")
	@RequestMapping("dispenseRoleUI/{id}")
	public String dispenseRoleUI(@PathVariable Integer id,Model model) {
		Users user=service.findOne(id);
		model.addAttribute("user", user);
		List<Roles> allRoles = rservice.findAll();
		model.addAttribute("allRoles", allRoles);
		model.addAttribute("size",allRoles.size());
		List<Roles> hasedRoles = service.getRolesByUid(id);
		model.addAttribute("hasedRoles", hasedRoles);
		return "admin/users/dispenseRoleUI";
	}
	@RequiresPermissions("user:authorization")
	@RequestMapping("dispenseRole")
	public String dispenseRole(Integer uid,Integer[] rids,Model model) throws InterruptedException {
		service.cancelHasedRoles(uid);
		service.insertBatch(uid, rids);
		Thread.sleep(1500);
		return "redirect:/users/dispenseRoleUI/"+uid;
	}
}
