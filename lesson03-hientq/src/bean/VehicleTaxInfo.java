package bean;

import java.util.Arrays;

public class VehicleTaxInfo {
	private Owner owner;
	private Vehicle[] vehicles;
	
	public VehicleTaxInfo() {
		// TODO Auto-generated constructor stub
	}

	public VehicleTaxInfo(Owner owner, Vehicle[] vehicles) {
		super();
		this.owner = owner;
		this.vehicles = vehicles;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "VehicleTaxInfo [owner=" + owner + ", vehicles=" + Arrays.toString(vehicles) + "]";
	}
	
	
}
