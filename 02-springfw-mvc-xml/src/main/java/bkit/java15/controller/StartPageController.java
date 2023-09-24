package bkit.java15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bkit.java15.common.Application;

@Controller
public class StartPageController {

	@GetMapping(value = {"", "dashboard"})
	public String test() {
		return Application.START_PAGE_INDEX;
	}

}
