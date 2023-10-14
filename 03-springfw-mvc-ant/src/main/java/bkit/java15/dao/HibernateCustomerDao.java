package bkit.java15.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import bkit.java15.persistence.Customer;

@Repository
public class HibernateCustomerDao extends AbstractHibernateDao implements CustomerDao {

	private static final String GET_ALL_CUSTOMERS = "SELECT * FROM customer";

	@Override
	public List<Customer> getAll() {
		return openSession()
				.createNativeQuery(GET_ALL_CUSTOMERS, Customer.class)
				.getResultList();
	}
	
	@Override
	public void saveOrUpdate(Customer customer) {
		// TODO: openSession --> add ?
		//     : getCurrentSession --> update, addOrUpdate ?
		getCurrentSession().saveOrUpdate(customer);
	}

	@Override
	public Customer get(Integer id) {
		return openSession().get(Customer.class, id);
	}
	
}
