package service;

import java.time.LocalDate;

import dao.JdbcOrderDao;
import dao.OrderDao;

public class OrderServiceImpl implements OrderService {
	
	private OrderDao orderDao;
	
	public OrderServiceImpl() {
		orderDao = new JdbcOrderDao();
	}

	@Override
	public void update(LocalDate deliveryDate, double deliveryFee) {
		orderDao.update(deliveryDate, deliveryFee);
	}

}
