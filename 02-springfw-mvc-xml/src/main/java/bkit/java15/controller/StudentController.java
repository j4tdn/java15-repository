package bkit.java15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@GetMapping("register")
	public String showRegisterForm() {
		return "student/register-form";
	}
	
	@PostMapping("send-reg-req")
	public String requestNewClass(
			Model model,
			@RequestParam("student-id") String studentId,
			@RequestParam("student-name") String studentName,
			@RequestParam("student-age") Integer studentAge) {
		
		// validate data
		// save into database
		// send success/fail back to student
		
		String message = "Thanks for register, Your request is ok, You will join class 257";
		
		model.addAttribute("fbMessage", message);
		
		return "student/success";
		
	}
	
}
