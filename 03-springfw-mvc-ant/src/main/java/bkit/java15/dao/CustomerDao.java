package bkit.java15.dao;

import java.util.List;

import bkit.java15.persistence.Customer;

public interface CustomerDao {
	
	List<Customer> getAll();

	void saveOrUpdate(Customer customer);

	Customer get(Integer id);
}
