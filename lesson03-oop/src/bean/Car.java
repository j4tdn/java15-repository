package bean;

public class Car {
	private String color;
	private String model;
	
	//constructor
	public Car() {
		
	}

	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + "]";
	}
	
	
}
