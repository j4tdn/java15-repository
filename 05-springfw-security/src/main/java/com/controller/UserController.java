package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.RequestContextHolder;

import com.entity.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/login")
	public String viewLoginPage() {
		String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
		System.out.println("SignInController: " + sessionId);
		
		return "login";
	}
	
	@GetMapping("/user/register")
	public String showRegisterUserForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@PostMapping("/user/register")
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		User existedUser = service.findUserByUserName(user.getUsername());
		if (existedUser != null) {
			// model.addAttribute("user", user);
			model.addAttribute("existedUser", "Username " + user.getUsername() + " already existed");
			return "register";
		}
		
		// save to database
		try {
			service.save(user);
			model.addAttribute("regSuccess", "Account " + user.getFullName() + " has registered successful");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("systemError", "System error");
			return "register";
		}
		return "login";
	}
}
