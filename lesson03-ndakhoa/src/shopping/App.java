package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		/*
		 * c1: KH1, Adam, 123, NewYork c2: KH2, Kate, 243, California
		 * 
		 * i1: ss10+, Android, black, 620 i2: ss20u, Android, Green, 840 i3: Ip4, IOS,
		 * White, 280 i4: IP12, IOS, Black, 880 i5: WP8, WindowPhone, Blue, 560
		 */
		
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "243", "California");
		
		Item i1 = new Item("SS10+", "Androiod", "Black", 620);
		Item i2 = new Item("SS20U", "Androiod", "Green", 840);
		Item i3 = new Item("IP4", "IOS", "White", 280);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1, 3),
				new ItemDetail(i4, 5),
				new ItemDetail(i2, 1),
				}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3, 2),
				new ItemDetail(i5, 1),
				}, LocalDateTime.of(2021, 5, 7, 20, 10, 12));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4, 1),
				}, LocalDateTime.of(2021, 5, 8, 9, 28, 32));
		

		System.out.println("Order 1: " + OrderUtils.export(01));
		System.out.println("Order 2: " + OrderUtils.export(02));
		System.out.println("Order 3: " + OrderUtils.export(o3));
				
	}

}
