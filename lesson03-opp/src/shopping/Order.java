package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
    private Customer customer;
    private ItemDetail[] itemDetails;
    private LocalDateTime orderDate; // worst case 10:10:10 08.05.2021 05.08.2021
    
    public Order() {
    }
     // Source + Generate Constructor using fields
	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		super();
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDate = orderDate;
	}
	// Source + Generate Getters and setters
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
	// Source + Generate toString
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDate="
				+ orderDate + "]";
	}
	//o1, o2, o3
	public double export() {
		double totolOfMoney = 0;
		ItemDetail[] ids = getItemDetails();
		for (ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderDate().toLocalDate())) {
			idCost *= 0.9;
		}
					totolOfMoney += idCost;
		}
		return totolOfMoney;
	}
}
