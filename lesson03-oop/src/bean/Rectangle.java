package bean;

public class Rectangle {

	public int width;
	public int height;
	
	public Rectangle() {
		
	}
	// hàm khởi tạo 
	public Rectangle(int width , int height ) {
		this.width = width;
		this.height = height;
	}
	
	// getter , setter
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
		//return this.width + ", " + this.height;
		// bỏ this vì đã có this. trong hàm khơi tạo
		return width + ", " + height;
	}
}
