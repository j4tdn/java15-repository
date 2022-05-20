package view;

public class Vehicle {
	private String name;
	private String model;
	private int capacity;
	private double price;
	private double tax;
	
	public Vehicle(String name, String model, int capacity, double price, double tax) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTax(double price) {
		double tax;
		if(capacity<100) {
			return price * 0.01;
	}else if (capacity < 200) {
		return price *0.03;
	}else
		return price * 0.05;
		
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", capacity=" + capacity + ", price=" + price + ", tax="
				+ tax + "]";
	}
	
}
