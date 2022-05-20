package bean;

public class Vehicle {
	private String name;
	private double price;
	private int engineDisplacement;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, double price, int engineDisplacement) {
		super();
		this.name = name;
		this.price = price;
		this.engineDisplacement = engineDisplacement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(int engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", price=" + price + ", engineDisplacement=" + engineDisplacement + "]";
	}
	
	
}
