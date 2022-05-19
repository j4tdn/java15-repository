package view;

import java.text.DecimalFormat;

public class Vehicle {
	private String nameCarOwner, RangeofVehicle;
	private int Capacity;
	private double Value;

	public Vehicle() {

	}

	public String getNameCarOwner() {
		return nameCarOwner;
	}

	public void setNameCarOwner(String nameCarOwner) {
		this.nameCarOwner = nameCarOwner;
	}

	public String getRangeofVehicle() {
		return RangeofVehicle;
	}

	public void setRangeofVehicle(String rangeofVehicle) {
		RangeofVehicle = rangeofVehicle;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public double getValue() {
		return Value;
	}

	public void setValue(double value) {
		Value = value;
	}

	public Vehicle(String nameCarOwner, String rangeofVehicle, int capacity, double value) {
		this.nameCarOwner = nameCarOwner;
		RangeofVehicle = rangeofVehicle;
		Capacity = capacity;
		Value = value;
	}

	@Override
	public String toString() {
		return "Vehicle [nameCarOwner=" + nameCarOwner + ", RangeofVehicle=" + RangeofVehicle + ", Capacity=" + Capacity
				+ ", Value=" + Value +"]";
	}

	public double CalculateTax() {
		double tax;
		if (Capacity < 100)
			tax = Value * 0.01;
		else if (Capacity >= 100 && Capacity <= 200)
			tax = Value * 0.03;
		else
			tax = Value * 0.05;
		return tax;
	}
	void inDeclarationTable() {
		DecimalFormat df = new DecimalFormat("####.00");
		
		System.out.printf("|%-20s | %-15s | %-15s | %-20s | %-20s %n",nameCarOwner,RangeofVehicle, Capacity, df.format(Value), df.format(CalculateTax()));
	}
}
