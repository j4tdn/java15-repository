package bean;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int heigh) {
		this.width = width;
		this.height = heigh;
		
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
	public String toString() {
		return this.width + " , " + this.height;
	}
	public static void main(String[] args) {
		
	}

}
