package bkit.java15.dao;

import java.util.List;

import bkit.java15.common.Pageable;
import bkit.java15.common.Sortable;
import bkit.java15.persistence.Customer;

public interface CustomerDao {

	List<Customer> getAll();

	List<Customer> getAll(Pageable pageable);

	List<Customer> getAll(Pageable pageable, Sortable sortable);

	/**
	 * Get all customers by the given conditions
	 * 
	 * @param pageable page able
	 * @param sortable sort able
	 * @param text     text
	 * @return list of {@link Customer}s
	 */
	List<Customer> getAll(Pageable pageable, Sortable sortable, String text);

	Customer get(int id);

	void saveOrUpdate(Customer customer);

	void delete(int id);

	int countTotalAmountOfCustomers();

	int countTotalAmountOfCustomers(String text);

}
