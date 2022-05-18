package bean;

public class Rectangle {
	private int width;
	private int height;

	// default constructor
	public Rectangle() {
	}

	// full parametera constructor
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// getter, setter
	public int getWidth() {
		return this.width;

	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
}
