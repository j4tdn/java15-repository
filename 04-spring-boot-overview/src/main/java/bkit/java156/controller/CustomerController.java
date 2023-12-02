package bkit.java156.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bkit.java156.persistence.Customer;
import bkit.java156.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@ResponseBody
	@GetMapping("/all-data")
	public List<Customer> getAll() {
		return customerService.getAll().subList(0, 8);
	}
	
	@ResponseBody
	@GetMapping("/{id}")
	public Customer get(@PathVariable int id) {
		return customerService.get(id);
	}
}
