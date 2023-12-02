package bkit.java156.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import bkit.java156.dao.CustomerDao;
import bkit.java156.persistence.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>, CustomerDao{
	
	@Query(value = "SELECT c FROM Customer c WHERE c.email = :email", nativeQuery = false)
	List<Customer> getCustomersByEmail(@Param("email") String email);
}
