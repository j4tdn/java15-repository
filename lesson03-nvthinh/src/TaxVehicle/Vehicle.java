package TaxVehicle;


public class Vehicle {
	private String ownerName;
	private String rangeOfVehicle;
	private int capacity;
	private int cost;
	
	public Vehicle() {
		
	}

	public Vehicle(String ownerName, String rangeOfVehicle, int capacity, int cost) {
		
		this.ownerName = ownerName;
		this.rangeOfVehicle = rangeOfVehicle;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getRangeOfVehicle() {
		return rangeOfVehicle;
	}

	public void setRangeOfVehicle(String rangeOfVehicle) {
		this.rangeOfVehicle = rangeOfVehicle;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", rangeOfVehicle=" + rangeOfVehicle + ", capacity=" + capacity
				+ ", cost=" + cost + "]";
	}
	
	
}


