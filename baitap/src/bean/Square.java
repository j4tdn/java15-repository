package bean;

public class Square {
	private int height;
	private int width;
	
	public Square() {
	}
	
	public Square(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Square [height=" + height + ", width=" + width + "]";
	}
	public int getPri() {
		return (this.width + this.height) * 2;
	}
	
}
