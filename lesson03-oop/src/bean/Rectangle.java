package bean;

public class Rectangle {
	private int width;
	private int height;
	
	
	//default contructor
	public Rectangle() {
		
	}
	
	//full parameter contructor
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
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

	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
}
