package ex02;

import java.util.Scanner;

public class Vehicle {
	private String owner;
	private String type;
	private int capacity;
	private double price;

	private static Scanner sc = new Scanner(System.in);

	public Vehicle() {
		owner = "";
		type = "";
		capacity = 0;
		price = 0;
	}

	public Vehicle(String owner, String type, int capacity, double price) {
		this.owner = owner;
		this.type = type;
		if (capacity <= 0 || price <= 0) {
			throw new RuntimeException("Invalid!");
		}
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if (capacity <= 0) {
			throw new RuntimeException("Invalid!");
		}
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			throw new RuntimeException("Invalid!");
		}
		this.price = price;
	}

	public double getTax() {
		if (capacity < 100) {
			return 0.01 * getPrice();
		} else if (capacity < 200) {
			return 0.03 * getPrice();
		}
		return 0.05 * getPrice();
	}

	public void input() {
		System.out.print("Enter owner: ");
		owner = sc.nextLine();
		System.out.print("Enter type: ");
		type = sc.nextLine();
		System.out.print("Enter capacity: ");
		capacity = Integer.parseInt(sc.nextLine());
		System.out.print("Enter price: ");
		price = Double.parseDouble(sc.nextLine());
	}

	@Override
	public String toString() {
		return owner + "\t\t" + type + "\t" + capacity + "\t\t" + price + "\t\t" + getTax();
	}
}