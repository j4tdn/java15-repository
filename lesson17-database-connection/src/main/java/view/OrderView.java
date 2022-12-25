package view;

import java.time.LocalDate;

import service.OrderService;
import service.OrderServiceImp;

public class OrderView {
	public static OrderService orderService;
	static {
		orderService = new OrderServiceImp();
	}

	public static void main(String[] args) {
		LocalDate ldate = LocalDate.of(2020, 12, 18);
		double deliveryFee = 99;
		orderService.update(ldate, deliveryFee);
		System.out.println("............................");
	}
}
