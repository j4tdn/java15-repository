package ex02;

import java.text.DecimalFormat;

public class Car {
	private String rangeOfVehicle;
	private int cylinderCapacity;
	private double cost;

	public Car() {
	}

	public Car(String rangeOfVehicle, int cylinderCapacity, double cost) {
		super();
		this.rangeOfVehicle = rangeOfVehicle;
		this.cylinderCapacity = cylinderCapacity;
		this.cost = cost;
	}

	public String getRangeOfVehicle() {
		return rangeOfVehicle;
	}

	public void setRangeOfVehicle(String rangeOfVehicle) {
		this.rangeOfVehicle = rangeOfVehicle;
	}

	public int getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(int cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		
		return rangeOfVehicle + "\t\t" + cylinderCapacity + "\t\t" + df.format(cost)+"\t\t"
				;
	}

}
