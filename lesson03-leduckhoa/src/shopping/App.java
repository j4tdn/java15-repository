package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "789", "California");

		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 840);
		Item i3 = new Item("IP4", "IOS", "White", 280);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP8", "Windowphone", "Blue", 560);

		Order o1 = new Order(c1,
				new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i3, 1), new ItemDetail(i4, 1) },
				LocalDateTime.of(2022, 5, 19, 10, 10, 10));
		Order o2 = new Order(c2,
				new ItemDetail[] { new ItemDetail(i1, 1), new ItemDetail(i3, 1), new ItemDetail(i4, 1) },
				LocalDateTime.of(2022, 5, 20, 11, 10, 10));
		Order o3 = new Order(c2, new ItemDetail[] { new ItemDetail(i1, 6) }, LocalDateTime.of(2022, 5, 21, 15, 10, 10));

		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 2: " + OrderUtils.export(o2));
		System.out.println("Order 3: " + OrderUtils.export(o3));
	}
}