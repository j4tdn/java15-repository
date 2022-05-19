package bean;

public class Rectangle {

	private int witdh;
	private int height;
	
    // full parameter constructor;
	public Rectangle(int witdh, int height) {
		this.witdh = witdh;
		this.height = height;

	}

	// default constructor
	public Rectangle() {
		
	}
	@Override
	public String toString() {
		return this.witdh + " ," + this.height;
	}
	// getter , setter
	public int getWidth() {
		return this.witdh;
	}
	public void setWidth(int width) {
		this.witdh = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
