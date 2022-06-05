package vehicles;

public class Vehicles {
	private String owner;
	private String model;
	private int capacity;
	private double cost;

	public Vehicles() {

	}

	public Vehicles(String owner, String model, int capacity, double cost) {
		super();
		this.owner = owner;
		this.model = model;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double tax() {
		if(capacity < 100) {
			return cost * 0.01;
		}else if(capacity >= 100 && capacity <=200) {
			return cost * 0.03;
		}else {
			return cost * 0.05;
		}
	}

	@Override
	public String toString() {
		return "Vehicles [owner=" + owner + ", model=" + model + ", capacity=" + capacity + ", cost=" + cost
				+ ", getOwner()=" + getOwner() + ", getModel()=" + getModel() + ", getCapacity()=" + getCapacity()
				+ ", getCost()=" + getCost() + ", tax()=" + tax() + "]";
	}

	

}
