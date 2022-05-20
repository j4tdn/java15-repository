package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * =
 * 
 * @author ADMIN
 *
 */

public class OrderUtils {
	public static double export(Order order) {
		// TODO Auto-generated method stub
		double totalOfMoney = 0;

		ItemDetail[] ids = order.getItemDetails();
//		//for index
//		for(int i = 0; i < ids.length; i++) {
//			ItemDetail id = ids[i];
//		}
		// for each
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;

		}

		return totalOfMoney;

	}

}
