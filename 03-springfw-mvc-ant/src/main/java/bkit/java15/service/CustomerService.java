package bkit.java15.service;

import java.util.List;

import bkit.java15.common.Pageable;
import bkit.java15.common.Sortable;
import bkit.java15.persistence.Customer;

public interface CustomerService {
	
	List<Customer> getAll();
	
	List<Customer> getAll(Pageable pageable);
	
	List<Customer> getAll(Pageable pageable, Sortable sortable);
	
	List<Customer> getAll(Pageable pageable, Sortable sortable, String text);

	Customer get(int id);
	
	void saveOrUpdate(Customer customer);
	
	void delete(int id);
	
	int countTotalAmountOfCustomers();
	
	int countTotalAmountOfCustomers(String text);
	
}
