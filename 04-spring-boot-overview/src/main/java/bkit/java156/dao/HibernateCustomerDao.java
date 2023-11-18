package bkit.java156.dao;

import java.util.List;

import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import bkit.java156.persistence.Customer;

@Repository
public class HibernateCustomerDao extends AbstractHibernateDao implements CustomerDao {

	private static final String GET_ALL_CUSTOMERS = "SELECT * FROM customer";
	
	private static final String DELETE_CUSTOMER_BY_ID = "DELETE FROM customer WHERE ID = :pid";
	
	private static final String COUNT_AMOUNT_OF_CUSTOMERS = "SELECT COUNT(*) TOTAL_RECORDS FROM customer";

	@Override
	public List<Customer> getAll() {
		return openSession()
				.createNativeQuery(GET_ALL_CUSTOMERS, Customer.class)
				.getResultList();
	}
	
	@Override
	public Customer get(int id) {
		return openSession().get(Customer.class, id);
	}
	
	@Override
	public void saveOrUpdate(Customer customer) {
		// TODO: openSession --> add ?
		//     : getCurrentSession --> add, update ?
		getCurrentSession().saveOrUpdate(customer);
	}
	
	@Override
	public void delete(int id) {
		getCurrentSession().createNativeQuery(DELETE_CUSTOMER_BY_ID)
			.setParameter("pid", id, StandardBasicTypes.INTEGER)
			.executeUpdate();
	}
	
	@Override
	public int countTotalAmountOfCustomers() {
		return (int)getCurrentSession().createNativeQuery(COUNT_AMOUNT_OF_CUSTOMERS)
				.addScalar("TOTAL_RECORDS", StandardBasicTypes.INTEGER)
				.getSingleResult();
	}
	
	@Override
	public int countTotalAmountOfCustomers(String text) {
		var sql = COUNT_AMOUNT_OF_CUSTOMERS;
		
		if (text != null && !text.isEmpty()) {
			String condition = "\n"
					+ "WHERE FIRST_NAME LIKE :ptext OR LAST_NAME LIKE :ptext OR EMAIL LIKE :ptext";
			sql = sql.concat(condition);
		}
		
		var query = getCurrentSession().createNativeQuery(sql);
		
		if (text != null && !text.isEmpty()) {
			query.setParameter("ptext", "%" + text + "%", StandardBasicTypes.STRING);
		}
		
		return (int)query.addScalar("TOTAL_RECORDS", StandardBasicTypes.INTEGER).getSingleResult();
	}
	
}
