package com.yorijory.webprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home/index")
	private String bb() {
		return "home/index";
	}
	
	@RequestMapping("")
	private String aa() {
		return "home/index";
	}
}