package bean;

public class Car {
	//thuộc tính phụ thuộc vào đối tượng gọi thì là non-static
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
		return "Car [color=" + color + ", model=" + model + "]";
	}
	
	
}
