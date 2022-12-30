package view;

import java.time.LocalDate;

import service.OrderService;
import service.OrderServiceImpl;

public class OrderView {
	private static OrderService orderService;
	
	static {
		orderService = new OrderServiceImpl();
	}
	
	public static void main(String[] args) {
		LocalDate deliveryDate = LocalDate.of(2020, 12, 18);
		double deliveryFee = 99;
		orderService.update(deliveryDate, deliveryFee);
		
		System.out.println("........");
	}
}
