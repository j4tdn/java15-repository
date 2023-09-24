package bkit.java15.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bkit.java15.dao.CustomerDao;
import bkit.java15.persistence.Customer;

@Service
public class CustomerSerivceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Customer customer) {
		customerDao.saveOrUpdate(customer);
	}
	
	@Override
	public Customer get(Integer id) {
		return customerDao.get(id);
	}
	
}
