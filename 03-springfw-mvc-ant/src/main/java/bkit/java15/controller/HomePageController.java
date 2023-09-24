package bkit.java15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bkit.java15.common.Application;

@Controller
public class HomePageController {
	
	@GetMapping("/")
	public String index() {
		return Application.HOME_PAGE;
	}
}
