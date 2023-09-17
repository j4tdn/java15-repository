package bkit.java15.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bkit.java15.bean.Country;
import bkit.java15.bean.Student;
import bkit.java15.common.Application;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@GetMapping({"", "index"})
	public String index() {
		return Application.STUDENT_PAGE_INDEX;
	}
	
	@GetMapping("register")
	public String showRegisterForm(Model model) {
		var mockCountries =  List.of(
			new Country(1, "VietNam"),
			new Country(2, "Lao"),
			new Country(3, "Campuchia"),
			new Country(4, "Thailand")
		);
		var student = new Student();
		student.setCountry(mockCountries.get(2).getCode());
		var mockOses = List.of("Linux", "Windows", "MacOs");
		
		model.addAttribute("student", student);
		model.addAttribute("mockCountries", mockCountries);
		model.addAttribute("mockOses", mockOses);
		
		return Application.STUDENT_PAGE_REG_FORM;
	}
	
	@PostMapping("send-reg-req")
	public String requestNewClass(
			Model model, 
			@Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			System.out.println("--------> has errors");
			// return "redirect:/student/register";
			var mockCountries =  List.of(
					new Country(1, "VietNam"),
					new Country(2, "Lao"),
					new Country(3, "Campuchia"),
					new Country(4, "Thailand")
			);
			var theStudent = new Student();
			student.setCountry(mockCountries.get(2).getCode());
			var mockOses = List.of("Linux", "Windows", "MacOs");
			
			model.addAttribute("student", theStudent);
			model.addAttribute("mockCountries", mockCountries);
			model.addAttribute("mockOses", mockOses);
			
			return Application.STUDENT_PAGE_REG_FORM;
		}
		
		System.out.println("--------> has no errors");
		
		String message = student.toString();
		model.addAttribute("fbMessage", message);
		return Application.STUDENT_PAGE_SUCCESS;
	}
	
}
