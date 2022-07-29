package bean;

public class Rectangle {
	private int width;
	private int height;
	
	// default constructor
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	// cho private chỉ đươch truy câpj trong phạm vi class bên ngoài k truy cập được
	// vì vậy phải dùng gettter, setter
	public int getWidth() {
		return width;
		
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String toString() {
		return this.width + ", " + this.height;
	}

}
