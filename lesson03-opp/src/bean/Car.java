package bean;

public class Car {
	private String color;// màu sắc
	public static String model;// loại nào
	// khai báo ko có static là thuộc phạm vi của đối tượng hay của lớp
	
	// nên tạo hàm khởi tạo constructor
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
