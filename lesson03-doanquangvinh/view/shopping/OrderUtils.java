package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils() {
		// TODO Auto-generated constructor stub
	}

	public static double export(Order order) {
		System.out.println();
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemsDetails();
		// for index
		// for (int i = 0; i < ids.length; i++) {
		// ItemDetail id = ids[i];

		// }
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			System.out.println("item : " + item);
			int quantity = id.getQuantity();
			System.out.println("quantity: " + quantity);
			double idCost = item.getPrice() * quantity;

			if (LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderTime().toLocalDate()) && item.getPrice() > 590) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;

	}
}
