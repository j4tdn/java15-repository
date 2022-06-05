package bean;

public class Car {
	// Attribute
	private String color;
	public static String model;

	// Constructor
	public Car() {

	}

	public Car(String color) {
		this.color = color;
//		this.model = model;
	}

	// getter, setter
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	public String getModel() {
//		return this.model;
//	}
//	
//	public void setModel(String model) {
//		this.model = model;
//	}

	@Override
	public String toString() {
		return "[color=" + color + ", model=" + model + "]";
	}

}