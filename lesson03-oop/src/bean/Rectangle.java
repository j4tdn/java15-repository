package bean;

public class Rectangle {
	/* Attribute */
	private int width;
	private int height;
	
	/* Default constructor */
	public Rectangle() {
		
	}
	/* Full parameter constructor */
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.width + ", " + this.height;
	}
	
	/* Getter, Setter */
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
}
