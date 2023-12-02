package bkit.java156.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bkit.java156.persistence.Customer;
import jakarta.persistence.EntityManager;

@Repository
public class JpaCustomerDao implements CustomerDao {

	private static final String GET_ALL_CUSTOMERS = "SELECT * FROM customer";
	
	private static final String DELETE_CUSTOMER_BY_ID = "DELETE FROM customer WHERE ID = :pid";
	
	private static final String COUNT_AMOUNT_OF_CUSTOMERS = "SELECT COUNT(*) TOTAL_RECORDS FROM customer";

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Customer> getAll() {
		return entityManager
				.createNativeQuery(GET_ALL_CUSTOMERS, Customer.class)
				.getResultList();
	}
	
	@Override
	public Customer get(int id) {
		return entityManager.find(Customer.class, id);
	}
	
	@Override
	public void saveOrUpdate(Customer customer) {
		entityManager.merge(customer);
	}
	
	@Override
	public void delete(int id) {
		entityManager.createNativeQuery(DELETE_CUSTOMER_BY_ID)
			.setParameter("pid", id)
			.executeUpdate();
	}
	
	@Override
	public int countTotalAmountOfCustomers() {
		// jpa entityManager does not support add scalar
		return 0;
	}
	
	@Override
	public int countTotalAmountOfCustomers(String text) {
		return 0;
	}
	
}
