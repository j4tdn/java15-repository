package bean;

public class Car {
	private String color;
	public static String model;
	//contructor
	public Car() {
		// TODO Auto-generated constructor stub
		
	}
	public Car(String color) {
		super();
		this.color = color;
	
	}
	
	//getter, setters
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + "]";
	}
	

}
