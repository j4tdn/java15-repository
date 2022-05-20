package bean;

public class Rectangle {
	private int width;
	private int height;
	//default constructor
	public Rectangle() {
		
	}
	
	// full pẩmeter cóntructor hàm khởi tạo 
	public Rectangle(int width, int height) {
		this.width = width;
		this.height= height;
	}
	
	public int geS() {
		return width*height;
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
		public void setHeigth(int height) {
			this.height= height;
		}
	
	@Override
	public String toString() {
		return width+","+height;
	}
}
