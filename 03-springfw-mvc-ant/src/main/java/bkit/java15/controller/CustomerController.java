package bkit.java15.controller;

import static bkit.java15.common.Application.CUSTOMER_FORM;
import static bkit.java15.common.Application.CUSTOMER_INDEX;
import static bkit.java15.common.Application.REDIRECT_CUSTOMER_INDEX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bkit.java15.persistence.Customer;
import bkit.java15.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public String index(Model model) {
		model.addAttribute("customers", customerService.getAll());
		return CUSTOMER_INDEX;
	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("customer", new Customer());
		
		return CUSTOMER_FORM;
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("id") Integer id, Model model) {
		var customer = customerService.get(id);
		model.addAttribute("customer", customer);
		return CUSTOMER_FORM;
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("customer") Customer customer) {
		customerService.saveOrUpdate(customer);
		return REDIRECT_CUSTOMER_INDEX;
	}
}
