package bkit.java15.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bkit.java15.bean.Country;
import bkit.java15.bean.Student;
import bkit.java15.common.Application;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@InitBinder
	public void preProcess(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmer);
	}
	
	@GetMapping({"", "index"})
	public String index() {
		return Application.STUDENT_PAGE_INDEX;
	}
	
	@GetMapping("register")
	public String showRegisterForm(Model model) {
		addAttributesForStudentFormPage(model, new Student(3));
		return Application.STUDENT_PAGE_REG_FORM;
	}
	
	@PostMapping("send-reg-req")
	public String requestNewClass(Model model, @Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			addAttributesForStudentFormPage(model, student);
			return Application.STUDENT_PAGE_REG_FORM;
		}
		model.addAttribute("fbMessage", student.toString());
		return Application.STUDENT_PAGE_SUCCESS;
	}
	
	private void addAttributesForStudentFormPage(Model model, Student student) {
		var mockCountries =  List.of(
				new Country(1, "VietNam"),
				new Country(2, "Lao"),
				new Country(3, "Campuchia"),
				new Country(4, "Thailand")
		);
		var mockOses = List.of("Linux", "Windows", "MacOs");
		
		model.addAttribute("student", student);
		model.addAttribute("mockCountries", mockCountries);
		model.addAttribute("mockOses", mockOses);
	}
	
}
