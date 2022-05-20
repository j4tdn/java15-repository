package vehicle;

public class Vehicle {
	private String vehicleOwner;
	private String vehicleType;
	private int capacity;
	private double price;
	
	public Vehicle() {
	}

	public Vehicle(String vehicleOwner, String vehicleType, int capacity, double price) {
		this.vehicleOwner = vehicleOwner;
		this.vehicleType = vehicleType;
		this.capacity = capacity;
		this.price = price;
	}

	public String getVehicleOwner() {
		return vehicleOwner;
	}

	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
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
		return "Vehicle [vehicleOwner=" + vehicleOwner + ", vehicleType=" + vehicleType + ", capacity=" + capacity
				+ ", price=" + price + "]";
	}

}
