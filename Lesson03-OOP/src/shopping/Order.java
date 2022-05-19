package shopping;

import java.security.Identity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;

public class Order {
	private Customer customer;
	private ItemDetail[] itemsDetails;
	// worst case : private String datetime
	private LocalDateTime orderTime;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customer customer, ItemDetail[] itemsDetails, LocalDateTime orderTime) {
		super();
		this.customer = customer;
		this.itemsDetails = itemsDetails;
		this.orderTime = orderTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemsDetails() {
		return itemsDetails;
	}

	public void setItemsDetails(ItemDetail[] itemsDetails) {
		this.itemsDetails = itemsDetails;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemsDetails=" + Arrays.toString(itemsDetails) + ", orderTime="
				+ orderTime + "]";
	}
  // o1 , o2 , o3
	public double export() {
		System.out.println(customer);
		double totalOfMoney = 0;
		ItemDetail[] ids = getItemsDetails();
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

			if (LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderTime().toLocalDate()) && item.getPrice() > 590) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;

	}
}
