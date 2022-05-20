package bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDate;
	private static int numberOfOrder;
	public Order() {
		// TODO Auto-generated constructor stub
		Order.numberOfOrder++;
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		super();
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDate = orderDate;
		Order.numberOfOrder++;
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

//	public double export() {
//		// TODO Auto-generated method stub
//		double totalPrice = 0;
//		for(ItemDetail item : this.getItemDetails()) {
//			double priceEachItemInOrder = item.getItem().getCost() * item.getQuantity();
//			if(item.getItem().getCost() > 590 && LocalDate.of(2022,Month.MAY,5).isEqual(this.getOrderDate().toLocalDate())) {
//				System.out.println("Sale of!!");
//				priceEachItemInOrder *= 0.9;
//			}
//			totalPrice += priceEachItemInOrder;
//		}
//		return totalPrice;
//	}
//	
	
}
