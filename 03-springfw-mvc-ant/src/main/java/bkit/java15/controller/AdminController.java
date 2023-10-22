package bkit.java15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bkit.java15.common.Application;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping
	public String index() {
		return Application.ADMIN_PAGE_INDEX;
	}
	
}
