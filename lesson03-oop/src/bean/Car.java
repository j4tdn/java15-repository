package bean;

public class Car {
	private String color;
	public static String model;
	//static cho 1 biến khi mà các đối tượng có chung thuộc tính
	public Car(){
	}
	
	public Car(String color) {
		this.color = color;
	}

	//getter, setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car color=" + color+"model = " +model ;
	}

}
