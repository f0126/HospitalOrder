package com.woniu.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Bookingform;
import com.woniu.service.BookingFormService;

@Controller
@RequestMapping("bookingform")
public class BookingFormController {
	@Autowired 
	private BookingFormService bookingserver;
    @RequiresPermissions("bookingform:find")
    @RequestMapping("find")
    public String find(Model model) {
		List<Bookingform> list = bookingserver.find();
		model.addAttribute("list", list);
		return "/admin/bookingform/findUI";
    }
    
	
}
