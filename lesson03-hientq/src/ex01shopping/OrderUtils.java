package ex01shopping;

import java.time.LocalDate;
import java.time.Month;

import bean.ItemDetail;
import bean.Order;

public class OrderUtils {
	// Khong cho new object tu class
	private OrderUtils() {
		
	}
	public static void export(Order order) {
		double totalPrice = 0;
		ItemDetail[] ids = order.getItemDetails();
		for(ItemDetail item : ids) {
			double priceEachItem = item.getItem().getCost() * item.getQuantity();
			if(item.getItem().getCost() > 590 && LocalDate.of(2022, Month.MAY, 5).isEqual(order.getOrderDate().toLocalDate())) {
				priceEachItem *= 0.9;
			}
			totalPrice += priceEachItem;
		}
		System.out.println("================Order of customer "+order.getCustomer().getId()+"==========================");
		System.out.println("Name : "+order.getCustomer().getName());
		System.out.println("Phone : "+order.getCustomer().getPhone());
		System.out.println("Address : "+order.getCustomer().getAddress());
		System.out.println("----List of item");
		for(ItemDetail item : ids) {
			System.out.println("--->");
			System.out.println("ID: "+item.getItem().getId());
			System.out.println("OS: "+item.getItem().getOs());
			System.out.println("Color: "+item.getItem().getColor());
			System.out.println("Cost: "+item.getItem().getCost());
			System.out.println("Quantity: "+item.getQuantity());
		}
		System.out.println("----Total price");
		System.out.println("====> $"+totalPrice);
	}
}
