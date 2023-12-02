package bkit.java156.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StartPageController {

	@Value("${data.test.amount-of-stores}")
	private int amountOfStores;

	@ResponseBody
	@GetMapping("/")
	public String index() {
		return "<html><body>Hello Start Page - 30.11.2023 <br>" 
		     + "Amount of stores(" + amountOfStores + ")</body></html>";
	}

}
