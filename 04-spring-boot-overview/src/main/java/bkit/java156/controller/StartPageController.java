package bkit.java156.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StartPageController {
	
	@Value("${customer.data.test.value}")
	private String customValue;
	
	@ResponseBody
	@GetMapping("/")
	public String index() {
		System.out.println(">>> " + customValue);
		return "Hello Start Page - 18.11.2023";
	}
	
}
