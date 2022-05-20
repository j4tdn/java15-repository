package payment;

public class Vehicle {
	private String vehicleOwner;
	private String model;
	private int cubicCapacity;
	private double value;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String vehicleOwner, String model, int cubicCapacity, double value) {
		super();
		this.vehicleOwner = vehicleOwner;
		this.model = model;
		this.cubicCapacity = cubicCapacity;
		this.value = value;
	}

	public String getVehicleOwner() {
		return vehicleOwner;
	}

	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleOwner=" + vehicleOwner + ", model=" + model + ", cubicCapacity=" + cubicCapacity
				+ ", value=" + value + "]";
	}
	
}
