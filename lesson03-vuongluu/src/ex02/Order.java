package ex02;

import java.util.Arrays;

public class Order {
	private Person person;
	private CarDetail[] carDetails;
	public Order() {
	}
	public Order(Person person, CarDetail[] carDetails) {
		super();
		this.person = person;
		this.carDetails = carDetails;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public CarDetail[] getCarDetails() {
		return carDetails;
	}
	public void setCarDetails(CarDetail[] carDetails) {
		this.carDetails = carDetails;
	}
	@Override
	public String toString() {
		return "Order [person=" + person + ", carDetails=" + Arrays.toString(carDetails) + "]";
	}
	
	
}
