package bean;

public class Rectangle {
	
	private int width;
	private int height;
	
	//default constructor
	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
	//full parameter constructor
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
	}
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
	
}
