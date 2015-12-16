package com.yorijory.webprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@RequestMapping("admin")
	private String admin() {
		return "admin/admin";
	}
	
	@RequestMapping("adminBoard")
	private String adminBoard() {
		return "admin/adminBoard";
	}
}
