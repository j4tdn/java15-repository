package task02;

public class Vehicle {
	private String vehicleOwner;
	private String vehicleName;
	private int capacity;
	private double price;
	
	public Vehicle() {
	}

	public Vehicle(String vehicleOwner, String vehicleName, int capacity, double price) {		
		this.vehicleOwner = vehicleOwner;
		this.vehicleName = vehicleName;
		this.capacity = capacity;
		this.price = price;
	}

	public String getVehicleOwner() {
		return vehicleOwner;
	}

	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public double getCapacity() {
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
	public double getTax(int capacity) {
		double tax;
		if(this.capacity < 100) {
			tax = this.price * 0.01;
		}if(this.capacity <= 100 && this.capacity >= 200) {
			tax = this.price * 0.03;
		}
		tax = this.price * 0.05;
		return tax;
	}

	@Override
	public String toString() {
		return "Tên chủ xe: "  + vehicleOwner + " Loại xe: " + vehicleName + " Dung tích: " + capacity
				+ " Gía: " + price + " thuế phải nộp: " + this.getTax(capacity) + "";
	}
	
	
}
