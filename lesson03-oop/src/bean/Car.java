package bean;

public class Car {
	private String color;
	public static String model;
	public Car() {
			
	}
	public Car(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	
	
	public String toString() {
		return "Car [color=" + color + ", model=" + model + "]";
	}
	public static void main(String[] args) {
		
	}

}
