package bkit.java15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Hello World 123";
	}
	
	@RequestMapping("/test")
	public String test() {
		// return view-name
		return "test";
	}
		
}
