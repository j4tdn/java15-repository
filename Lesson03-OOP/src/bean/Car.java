package bean;

public class Car {
	private String color;
	public static String model;

	// constructor
	public Car() {

	}

	public Car(String color) {

		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [color=" + this.color + ", model=" + model + "]";
	}

}
