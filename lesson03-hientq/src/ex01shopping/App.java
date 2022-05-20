package ex01shopping;

import java.time.LocalDateTime;
import java.time.Month;

import bean.Customer;
import bean.Item;
import bean.ItemDetail;
import bean.Order;

public class App {
	public static void main(String[] args) {
		// Customers data
		Customer c1 = new Customer("KH01", "Tran Quang Hien", "0909123134", "Da Nang");
		Customer c2 = new Customer("KH02", "Nguyen Van A", "0909567544", "Quang Nam");

		// Items data
		Item i1 = new Item("IP4", "IOS", "Black", 1000);
		Item i2 = new Item("IP5", "IOS", "White", 1200);
		Item i3 = new Item("IP12", "IOS", "Red", 1300);
		Item i4 = new Item("SSA31", "Android", "Blue", 400);
		Item i5 = new Item("VVO", "Android", "Violet", 240);

		// Orders

		Order o1 = new Order(c1, new ItemDetail[] { 
				new ItemDetail(i1, 2), 
				new ItemDetail(i2, 1) 
				}, LocalDateTime.of(2022, Month.MAY, 5, 10, 10, 10)) {
		};
		
		Order o2 = new Order(c2, new ItemDetail[] { 
				new ItemDetail(i4, 1), 
				new ItemDetail(i5, 5),
				new ItemDetail(i3, 6)
		}, LocalDateTime.of(2022, 4, 8, 9, 10, 10)) {
		};
		
		Order o3 = new Order(c2, new ItemDetail[] { 
				new ItemDetail(i1, 1)
		}, LocalDateTime.of(2022, 4, 8, 19, 2, 8)) {
		};
		
		OrderUtils.export(o1);
	}
}
