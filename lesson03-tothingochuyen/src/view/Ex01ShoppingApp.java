package view;

import java.time.LocalDateTime;

import bean.Customer;
import bean.Item;
import bean.ItemDetail;
import bean.Order;
import bean.OrderUtils;

public class Ex01ShoppingApp {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH01", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH02", "Kate", "243", "California");
		
		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 580);
		Item i3 = new Item("IP4", "IOS", "White", 280);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1, 3),
				new ItemDetail(i4, 5),
				new ItemDetail(i2, 1)
		}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3, 2),
				new ItemDetail(i5, 1)
		}, LocalDateTime.of(2021, 5, 7, 20, 10, 12));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4, 1)
		}, LocalDateTime.of(2021, 5, 8, 9, 28, 32));
		
		System.out.println("Customer 1: " + c1);
		System.out.println("   Product Information: " + o1);
		System.out.println("   Total order amount : " + OrderUtils.export(o1));
		
		System.out.println("=============================");
		
		System.out.println("Customer 2: " + c2);
		System.out.println("   Product Information: " + o2);
		System.out.println("   Total order amount : " + OrderUtils.export(o2));
		
		System.out.println("=============================");
		
		System.out.println("Customer 2: " + c2);
		System.out.println("   Product Information: " + o3);
		System.out.println("   Total order amount : " + OrderUtils.export(o3));
	}
}
