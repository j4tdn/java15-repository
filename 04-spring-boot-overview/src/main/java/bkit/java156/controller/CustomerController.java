package bkit.java156.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bkit.java156.persistence.Customer;
import bkit.java156.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/all-data")
	public List<Customer> getAll() {
		return customerService.getAll();
	}
	
	@GetMapping("/{id}")
	public Customer getById(@PathVariable int id) {
		return customerService.get(id);
	}

}
