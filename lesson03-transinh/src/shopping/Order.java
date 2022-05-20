package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDatails;
	private LocalDateTime orderDate;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDatails, LocalDateTime orderdate) {
		this.customer = customer;
		this.itemDatails = itemDatails;
		this.orderDate = orderdate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDatails() {
		return itemDatails;
	}

	public void setItemDatails(ItemDetail[] itemDatails) {
		this.itemDatails = itemDatails;
	}

	public LocalDateTime getOrderdate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDatails=" + Arrays.toString(itemDatails) + ", orderdate="
				+ orderDate + "]";
	}

	public double export() {
		double totolOfMoney = 0;
		
		ItemDetail[] ids = getItemDatails();
		for (ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of (2021, Month.MAY, 8).isEqual(getOrderdate().toLocalDate())) {
				idCost *= 0.9;
			}
			totolOfMoney += idCost;
		}
		
		return totolOfMoney;
	}
	
}