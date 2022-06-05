package polymorphism.object;

public class ShapeApp {
	/**
	 * Tại sao không khai báo trực tiếp kiểu dữ liêu lúc compile và runtime
	 * Nếu lấy kiểu dữ liệu của lớp con new kdl của lớp cha có đc k.
	 * Lấy KDL lúc compile và runtime không có quan hệ được không
	 * **/
	
	 
	
	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();
		
		
		
		System.out.println("=======================");
		Shape shapeSquare = new Square();
		shapeSquare.draw();
		shapeSquare.calS();
	}
}
