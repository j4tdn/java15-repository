package bkit.java15.dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;

import bkit.java15.common.Pageable;
import bkit.java15.common.Sortable;
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
	public List<Customer> getAll(Pageable pageable, Sortable sortable) {
		return getCurrentSession().createQuery(
				  "SELECT c FROM Customer c \n"
				+ "ORDER BY c." + Sortable.CUSTOMER_PROPS.get(sortable.getSortField()) + " " + sortable.getSortDir() , Customer.class)
				.setFirstResult(pageable.getOffset())
				.setMaxResults(pageable.getRowCount())
				.getResultList();
	}
	
	@Override
	public List<Customer> getAll(Pageable pageable, Sortable sortable, String text) {
		String sortField = Sortable.CUSTOMER_PROPS.get(sortable.getSortField());
		
		String sql = "SELECT c FROM Customer c \n";
				
		
		if (text != null && !text.isEmpty()) {
			sql += " WHERE c.firstName LIKE :text OR c.lastName LIKE :text \n";
		}
		
		sql += "ORDER BY c." + sortField + " " + sortable.getSortDir();
		
		final Query<Customer> query = getCurrentSession().createQuery(sql, Customer.class);
		
		if (text != null && !text.isEmpty()) {
			query.setParameter("text", "%" + text + "%", StringType.INSTANCE);
		}
		
		return query
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
	public int countTotalItems(String text) {
		String sql = "SELECT COUNT(*) AS totalRecords FROM customer c";
		
		if (text != null && !text.isEmpty()) {
			sql += " WHERE c.first_name LIKE :text OR c.last_name LIKE :text";
		}
		
		final NativeQuery<?> query = getCurrentSession().createNativeQuery(sql);
		
		if (text != null && !text.isEmpty()) {
			query.setParameter("text", "%" + text + "%", StringType.INSTANCE);
		}
		
		return (int)query.addScalar("totalRecords", IntegerType.INSTANCE)
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
