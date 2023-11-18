package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
public class MainController {

	@GetMapping("/")
	public String viewHomePage() {
		String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
		System.out.println("MainController: " + sessionId);
		
		return "index";
	}
	
}
