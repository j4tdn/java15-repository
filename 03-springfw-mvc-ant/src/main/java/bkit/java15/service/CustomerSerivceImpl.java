package bkit.java15.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bkit.java15.common.Pageable;
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
	public List<Customer> getAll(Pageable pageable) {
		return customerDao.getAll(pageable);
	}
	
	@Override
	@Transactional
	public List<Customer> getAll(Pageable pageable, String sortField, String sortDir) {
		return customerDao.getAll(pageable, sortField, sortDir);
	}
	
	@Override
	@Transactional
	public int countTotalItems() {
		return customerDao.countTotalItems();
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
	
	@Override
	@Transactional
	public void delete(int id) {
		customerDao.delete(id);
	}
	
}
