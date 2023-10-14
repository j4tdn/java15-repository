package bkit.java15.dao;

import java.util.List;

import org.hibernate.type.IntegerType;
import org.springframework.stereotype.Repository;

import bkit.java15.common.Pageable;
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
	public List<Customer> getAll(Pageable pageable) {
		return getCurrentSession().createQuery(
				  "SELECT c FROM Customer c", Customer.class)
				.setFirstResult(pageable.getOffset())
				.setMaxResults(pageable.getRowCount())
				.getResultList();
	}
	
	@Override
	public List<Customer> getAll(Pageable pageable, String sortField, String sortDir) {
		return getCurrentSession().createQuery(
				  "SELECT c FROM Customer c \n"
				+ "ORDER BY c." + sortField + " " + sortDir , Customer.class)
				.setFirstResult(pageable.getOffset())
				.setMaxResults(pageable.getRowCount())
				.getResultList();
	}
	
	@Override
	public int countTotalItems() {
		final String sql = "SELECT COUNT(*) AS totalRecords FROM customer";
		return (int) getCurrentSession().createNativeQuery(sql)
					  .addScalar("totalRecords", IntegerType.INSTANCE)
					  .getSingleResult();
	}
	
	@Override
	public void saveOrUpdate(Customer customer) {
		// saveOrUpdate
		// TODO: openSession --> support add, not work with update
		//     : getCurrentSession --> support add, update
		getCurrentSession().saveOrUpdate(customer);
	}

	@Override
	public Customer get(Integer id) {
		return openSession().get(Customer.class, id);
	}
	
	@Override
	public void delete(int id) {
		getCurrentSession().createQuery("DELETE FROM Customer WHERE id = :id")
			.setParameter("id", id)
			.executeUpdate();
			
	}
	
}
