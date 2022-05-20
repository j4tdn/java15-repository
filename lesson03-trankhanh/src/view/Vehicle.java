package view;

import java.text.DecimalFormat;

public class Vehicle {
	private String NameCar;
	private String TypeCar;
	private int capacity;
	private int value;
	
public  Vehicle(){
	
}
	
	public Vehicle(String nameCar, String typeCar, int capacity, int value) {
	super();
	this.NameCar = nameCar;
	this.TypeCar = typeCar;
	this.capacity = capacity;
	this.value = value;
}
	

	public String getNameCar() {
		return NameCar;
	}

	public void setNameCar(String nameCar) {
		NameCar = nameCar;
	}

	public String getTypeCar() {
		return TypeCar;
	}

	public void setTypeCar(String typeCar) {
		TypeCar = typeCar;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	

	public String toString() {
		return "Vehicle [NameCar=" + NameCar + ", TypeCar=" + TypeCar + ", capacity=" + capacity + ", value=" + value
				+ "]";
	}
	public double Tax() {
		double thue = 0;
		if(capacity<100) {
			thue = value * 0.01;
		}
		else if(capacity >= 100 && capacity <= 200) {
			thue = value * 0.03;
		}
		else if(capacity > 200) {
			thue = value * 0.05;
		}
		return thue;
			
	}
	public  void   Show() {
		DecimalFormat ip = new DecimalFormat("####.00");
		
		System.out.printf("|%-20s | %-15s | %-15s | %-20s | %-20s %n",NameCar,TypeCar, capacity, ip.format(value), ip.format(Tax()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	}

}
