package service;

import java.time.LocalDate;

import dao.JdbcOrderDao;
import dao.OrderDao;

public class OrderServiceImpl implements OrderService{
	public static OrderDao orderDao;
	public OrderServiceImpl() {
		orderDao = new JdbcOrderDao();
	}
	@Override
	public void update(LocalDate lDate, double deliveryFee) {
		orderDao.update(lDate, deliveryFee);
	}
}
