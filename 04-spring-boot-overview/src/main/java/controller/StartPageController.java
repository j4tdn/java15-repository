package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StartPageController {
	
	@ResponseBody
	@GetMapping("/")
	public String index() {
		return "Hello Start Page - 22.12.2023";
	}
	
}
