package bkit.java15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bkit.java15.common.Application;

@Controller
@RequestMapping("/staff")
public class StaffController {
	
	@GetMapping
	public String index() {
		return Application.STAFF_PAGE_INDEX;
	}
	
}
