package bkit.java156.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bkit.java156.dao.CustomerDao;
import bkit.java156.persistence.Customer;
import bkit.java156.repository.CustomerRepository;

@Service
public class CustomerSerivceImpl implements CustomerService{
	
	@Autowired
	@Qualifier("jpaCustomerDao")
	private CustomerDao customerDao;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAll() {
		// return customerDao.getAll();
		// return customerRepository.findAll();
		return customerRepository.getAll();
	}
	
	@Override
	public Customer get(int id) {
		// return customerDao.get(id);
		return customerRepository.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Customer customer) {
		customerDao.saveOrUpdate(customer);
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		customerDao.delete(id);
	}
	
	@Override
	@Transactional
	public int countTotalAmountOfCustomers() {
		return customerDao.countTotalAmountOfCustomers();
	}
	
	@Override
	@Transactional
	public int countTotalAmountOfCustomers(String text) {
		return customerDao.countTotalAmountOfCustomers(text);
	}
	
}
