package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("KH1","Mac","124","London");
		Customer c2 = new Customer("KH2","Yuu","343","Chinna");
		
		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 840);
		Item i3 = new Item("IP7", "IOS", "Pink", 280);
		Item i4 = new Item("IP12", "IOS", "Gold", 880);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);
			
		
		Order o1 = new Order(c1,new ItemDetail[] {
			new ItemDetail(i1, 3),
			new ItemDetail(i4, 5),
			new ItemDetail(i2, 1)
			
		}, LocalDateTime.of(2022, 5, 19, 10, 10, 10));
		
		Order o2 = new Order(c2,new ItemDetail[] {
				new ItemDetail(i3, 2),
				new ItemDetail(i5, 1)
				
			}, LocalDateTime.of(2022, 5, 8, 20, 20, 12));
		Order o3 = new Order(c2,new ItemDetail[] {
				new ItemDetail(i4, 1)
				
			}, LocalDateTime.of(2022, 5, 9, 9, 28, 32));
		System.out.println("Customer 1: " + c1);
		System.out.println("   Product Information: " + OrderUtils.export(o1));
		System.out.println("Customer 2: " + c2);
		System.out.println("   Product Information: " + OrderUtils.export(o2));
		System.out.println("Customer 2: " + c2);
		System.out.println("   Product Information: " + OrderUtils.export(o3));
		
	}
}
