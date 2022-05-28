package polymorphism.object;

public class ShapeApp {
	/**
	 * 1. Tại sao không khai báo trực tiếp KDL lúc compile và runtime
	 * + Áp dụng factory pattern
	 * + Dễ dàng áp chuyển đổi kiểu dữ liệu qua lại
	 * + Tạo tập hợp các phần tử KDL cha, con đưa vào 1 mảng chung duy nhất
	 * + Convention
	 * 
	 * 2. Nếu lấy KDL của lớp con new KDL của lớp cha được không:  Không
	 * + Cha = con, con != cha
	 * 3. Lấy KDL lúc compile và runtime không có quan hệ được không
	 */
	
	public static void main(String[] args) {
		Shape shapeRect = ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("=======================");
		
		Shape shapeSquare = ShapeFactory.createShape(ShapeType.SQUARE);
		shapeSquare.draw();
		shapeSquare.calS();
		
		System.out.println("=======================");

		shapeRect = shapeSquare;
				
		Rectangle rect = new Rectangle();
		
		Shape[] shapes = {shapeRect,shapeSquare,rect};
		System.out.println(shapes.length);
		
		System.out.println("=======================");
		Shape s1 = new Rectangle();
//		Rectangle r1 = new Shape();
	}
}
