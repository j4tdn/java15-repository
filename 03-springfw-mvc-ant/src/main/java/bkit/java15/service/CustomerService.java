package bkit.java15.service;

import java.util.List;

import bkit.java15.common.Pageable;
import bkit.java15.persistence.Customer;

public interface CustomerService {
	
	List<Customer> getAll();
	
	List<Customer> getAll(Pageable pageable);
	
	List<Customer> getAll(Pageable pageable, String sortField, String sortDir);
	
	int countTotalItems();

	void saveOrUpdate(Customer customer);
	
	Customer get(Integer id);
	
	void delete(int id);
}
