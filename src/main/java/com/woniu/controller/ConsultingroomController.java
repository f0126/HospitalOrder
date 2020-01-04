package com.woniu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.service.ConsultingroomService;

@Controller
@RequestMapping("consultingrooms")
public class ConsultingroomController {
	
	@Autowired
	private ConsultingroomService consultService;
	
	

}
