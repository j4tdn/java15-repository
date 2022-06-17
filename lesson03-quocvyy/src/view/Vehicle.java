package view;

public class Vehicle {
	private String name ;
	private String car;
	private int capacity;//dung tích
	private int price;//giá
	
	
	public Vehicle() {
	}


	public Vehicle(String name, String car, int capacity, double price) {
		super();
		this.name = name;
		this.car = car;
		this.capacity = capacity;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCar() {
		return car;
	}


	public void setCar(String car) {
		this.car = car;
	}

	
	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", car=" + car + ", capacity=" + capacity + ", price=" + price + "]";
	}
	
	

}
