package bkit.java15.dao;

import java.util.List;

import bkit.java15.common.Pageable;
import bkit.java15.common.Sortable;
import bkit.java15.persistence.Customer;

public interface CustomerDao {
	
	List<Customer> getAll();
	
	List<Customer> getAll(Pageable pageable);
	
	List<Customer> getAll(Pageable pageable, Sortable sortable);
	
	List<Customer> getAll(Pageable pageable, Sortable sortable, String text);
	
	int countTotalItems();
	
	int countTotalItems(String text);

	void saveOrUpdate(Customer customer);

	Customer get(Integer id);
	
	void delete(int id);
}
