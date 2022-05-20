package bean;
// Thuộc tính nào phụ thuộc vào đối tượng đang gọi thì non-static
public class Car {
	private String color;
	public static String model;
	
	// Khi tạo class nên tạo hàm khởi tạo, cả 2 loại, có và không có tham số
	public Car() {
		}
	
	public Car ( String color) {
		this.color = color;
		//this.model = model;
	}
	
	// getter, set
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// Hàm non-static phải dùng đối tượng mới . được
	// Xoá getter setter của Model
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + "]";
	}
	
	
	
}
