package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "New York");
		Customer c2 = new Customer("KH2", "Kate", "234", "Phoenix");

		Item i1 = new Item("SS10+", "Android", "Black", 620.0);
		Item i2 = new Item("SS20+", "Android", "Green", 580.0);
		Item i3 = new Item("IP4", "IOS", "White", 280.0);
		Item i4 = new Item("IP12", "IOS", "Black", 880.0);
		Item i5 = new Item("WP8", "Android", "Blue", 560.0);

		ItemDetail id1 = new ItemDetail(i1, 3);
		Order o1 = new Order(c1, new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i4, 5), new ItemDetail(i2, 1) },
				LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		Order o2 = new Order(c2, new ItemDetail[] { new ItemDetail(i3, 2), new ItemDetail(i5, 1) },
				LocalDateTime.of(2021, 5, 7, 20, 10, 12));
		Order o3 = new Order(c2, new ItemDetail[] { new ItemDetail(i4, 1) }, LocalDateTime.of(2021, 5, 8, 9, 28, 32));

	    System.out.println("Order 1 " + o1.export());
	    System.out.println("Order 2 " + o2.export());
	    System.out.println("Order 3 " + o3.export());
	}
   // Write method export in Order class : no-parameter
   // Write method export in Order class : export(order)
}
