package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDate;

	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDate="
				+ orderDate + "]";
	}

	public double export() {
		System.out.println(customer);
		double totalOfmoney = 0;
		ItemDetail[] ids = getItemDetails();

		// for index
//		for (int i = 0; i < ids.length; i++) {
//			ItemDetail id = ids[i];
//		}

		// for each
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if(LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderDate().toLocalDate())&& item.getCost()>590) {
				idCost *= 0.9;
			}
			totalOfmoney += idCost;
		}
		return totalOfmoney;

	}
}
