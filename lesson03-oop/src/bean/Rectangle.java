package bean;

public class Rectangle {
	private int width;
	private int height;

	// default constructure:
	public Rectangle() {

	}

	// full parameter constructor
	public Rectangle(int w, int h) {
		this.height = w;
		this.width = h;
	}

	// getter and setter
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
		return this.width + "," + this.height;
	}

}
