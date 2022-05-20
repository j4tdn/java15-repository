package been;

public class Vehicle {
	private String name;
	private String vehicletype;
	private int capacity;
	private double price;
	private double fax;
	public Vehicle(String name, String vehicletype, int capacity, double price, double fax) {
		super();
		this.name = name;
		this.vehicletype = vehicletype;
		this.capacity = capacity;
		this.price = price;
		this.fax = fax;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", vehicletype=" + vehicletype + ", capacity=" + capacity + ", price=" + price
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
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
	public double getFax() {
		return fax;
	}
	public void setfax(double fax) {
		this.fax = fax;
	}
	
}
