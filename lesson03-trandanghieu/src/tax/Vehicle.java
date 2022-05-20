package tax;

public class Vehicle {
	private String name;
	private String type;
	private int capacity;
	private double price;

	public Vehicle() {

	}

	public Vehicle(String name, String type, int capacity, double price) {

		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return name + "-" + type +"-" + capacity +"-" + price ;
	}

	public double taxPayment() {
		double tax = 0;
		if (capacity < 100) {
			tax = price * 0.1;
		}
		else if(capacity>=100 && capacity <=200) {
			tax=price*0.3;
		}
		else if(capacity>200) {
			tax=price*0.5;
		}
		return tax;
	}
	void printTax() {
		System.out.printf("%s %30s %30s %30f %30f \n",name,type,capacity,price,taxPayment());
	}

}
