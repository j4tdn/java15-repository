package bkit.java156.service;

import java.util.List;

import bkit.java156.persistence.Customer;

public interface CustomerService {
	
	List<Customer> getAll();
	
	Customer get(int id);
	
	void saveOrUpdate(Customer customer);
	
	void delete(int id);
	
	int countTotalAmountOfCustomers();
	
	int countTotalAmountOfCustomers(String text);
	
}
