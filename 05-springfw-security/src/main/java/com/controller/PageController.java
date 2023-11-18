package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/leaders") 
	public String viewLeadersPage() {
		return "leaders";
	}

	@GetMapping("/system") 
	public String viewSystemPage() {
		return "system";
	}
	
	@GetMapping("/403") 
	public String viewAdPage() {
		return "403";
	}
}
