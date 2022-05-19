package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {		
		Customer c1 = new Customer("KH1", "Yasuo", "1234", "Lonia");
		Customer c2 = new Customer("KH2", "Jayce", "4567", "Pi;tover");
		
		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("IPX", "IOS", "Gray", 1500);
		Item i3 = new Item("IP7", "IOS", "White", 550);
		Item i4 = new Item("HuaweiX1", "Android", "Blue", 700);
		Item i5 = new Item("OppoF5", "Android", "Red", 600);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3),
				new ItemDetail(i3,1),
				new ItemDetail(i4,1)	
		}, LocalDateTime.of(2022, 5, 18, 10, 10, 10));
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i1,1),
				new ItemDetail(i3,1),
				new ItemDetail(i4,1)	
		}, LocalDateTime.of(2022, 5, 19, 11, 10, 10));
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i1,6)	
		}, LocalDateTime.of(2022, 5, 20, 15, 10, 10));
		
		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 2: " + OrderUtils.export(o2));
		System.out.println("Order 3: " + OrderUtils.export(o3));
	}
}
