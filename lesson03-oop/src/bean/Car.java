package bean;

public class Car {
	private String color;
	public static String model;
	
	public Car() {
		
	}

	public Car(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [color= " + color + ", model= " + model + "]";
	}
	
}
