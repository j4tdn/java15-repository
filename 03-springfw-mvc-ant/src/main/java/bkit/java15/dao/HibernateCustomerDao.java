package bkit.java15.dao;

import java.util.List;

import org.hibernate.type.IntegerType;
import org.springframework.stereotype.Repository;

import bkit.java15.common.Pageable;
import bkit.java15.common.Sortable;
import bkit.java15.persistence.Customer;

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
	public List<Customer> getAll(Pageable pageable) {
		return openSession()
				.createNativeQuery(GET_ALL_CUSTOMERS, Customer.class)
				.setFirstResult(pageable.getOffset()) // offset
				.setMaxResults(pageable.getRowCount()) // row_count
				.getResultList();
	}
	
	// sortable(first-name, asc)
	
	@Override
	public List<Customer> getAll(Pageable pageable, Sortable sortable) {
		String sortField = sortable.getSortField();
		final var sql = GET_ALL_CUSTOMERS + "\n"
				+ "ORDER BY " + Sortable.CUSTOMER_PROPS.get(sortField)  + " " + sortable.getSortDir();
				
		return openSession()
				.createNativeQuery(sql, Customer.class)
				.setFirstResult(pageable.getOffset()) // offset
				.setMaxResults(pageable.getRowCount()) // row_count
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
			.setParameter("pid", id, IntegerType.INSTANCE)
			.executeUpdate();
	}
	
	@Override
	public int countTotalAmountOfCustomers() {
		return (int)getCurrentSession().createNativeQuery(COUNT_AMOUNT_OF_CUSTOMERS)
				.addScalar("TOTAL_RECORDS", IntegerType.INSTANCE)
				.getSingleResult();
	}
	
}
