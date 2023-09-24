package bkit.java15.service;

import java.util.List;

import bkit.java15.persistence.Customer;

public interface CustomerService {
	
	List<Customer> getAll();

	void saveOrUpdate(Customer customer);
	
	Customer get(Integer id);
	
}
