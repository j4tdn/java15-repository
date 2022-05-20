package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	
	private OrderUtils() {
	}
	public static double export(Order order) {
		double totolOfMoney = 0;
		ItemDetail[] ids = order.getItemDetail();
		for (ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				totolOfMoney += item.getCost() * idCost * 0.9;
			} else {
				totolOfMoney += idCost;
			}
			
			totolOfMoney += item.getCost() * quantity;
		}
		return totolOfMoney;

}
}
