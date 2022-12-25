package service;

import java.time.LocalDate;

import dao.JdbcOrderDao;
import dao.OrderDao;

public class OrderServiceImp implements OrderService {
    public OrderDao orderDao;
	 
    public OrderServiceImp() {
		orderDao = new JdbcOrderDao();
	}
	@Override
	public void update(LocalDate deliveryDate, double deliveryFee) {
		orderDao.update(deliveryDate, deliveryFee);
		
	}

}
