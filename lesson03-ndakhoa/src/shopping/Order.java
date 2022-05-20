package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDateTime orderDate;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetail, LocalDateTime orderDate) {
		super();
		this.customer = customer;
		this.itemDetail = itemDetail;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail[] itemDetail) {
		this.itemDetail = itemDetail;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + ", orderDate="
				+ orderDate + "]";
	}

	public double export() {
		double totolOfMoney = 0;
		ItemDetail[] ids = getItemDetail();
		for (ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderDate().toLocalDate())) {
				totolOfMoney += item.getCost() * idCost * 0.9;
			} else {
				totolOfMoney += idCost;
			}
			
			totolOfMoney += item.getCost() * quantity;
		}
		return totolOfMoney;
	}
}
