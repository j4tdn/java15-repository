package bkit.java156.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bkit.java156.common.Application;

@Controller
public class HomePageController {
	
	@GetMapping("/")
	public String index() {
		return Application.INDEX;
	}
	
}
