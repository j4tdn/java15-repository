package bkit.java15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

	@GetMapping(value = {"", "index"})
	public String test() {
		return "index";
	}

}
