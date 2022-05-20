package bean;

public class Rectangle {
	
	private int width;
	private int height;
	
	//default constructor
	public Rectangle() {
		
	}
	
	//full parameter constructor
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	//getter, setter
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
	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
}
