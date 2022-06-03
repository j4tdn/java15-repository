package polymorphism.object;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ShapeApp {
	/**
	 *  1. Tại sao không khai báo trực tiếp KDL lúc compile và runtime giống nhau
	 *  + Áp dụng factory pattern
	 *  + Dễ dàng chuyển đổi kiểu dữ liệu qua về
	 *  + Tạo tập hợp các phần tử KDL cha, con đưa vào 1 mảng chung duy nhất
	 *  + Convention
	 *  
	 *  2. Nếu lấy KDL của lớp con new(gán =) KDL của lớp cha được không
	 *  + Cha = Con --> OK
	 *  + Else      --> NO
	 *  
	 *  3. Lấy KDL lúc compile và runtime không có quan hệ được không
	 *  + Không
	 */
	public static void main(String[] args) {
		Shape shapeRect = ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("============");
		
		Shape shapeSquare = ShapeFactory.createShape(ShapeType.SQUARE);
		shapeSquare.draw();
		shapeSquare.calS();
		
		shapeRect = shapeSquare;
		
		Rectangle rect = new Rectangle();
		
		shapeRect = rect;
		
		Shape[] shapes = {shapeRect, shapeSquare, rect};
		System.out.println(shapes.length);
		
		System.out.println("===========");
		Shape s1 = new Rectangle();
		s1.draw(); // Shape#draw Rectangle#draw
		// s1.setBackground();
		
		// Rectangle r1 = (Rectangle)new Shape();
		// r1.setBackground();
		
		Shape r2 = new Square();
		if (r2 instanceof Square) {
			Square sq1 = (Square)r2;
			sq1.setBackground();
		} else if (r2 instanceof Rectangle) {
			Rectangle rect1 = (Rectangle)r2;
			rect1.setBackground();
		}
	}
}
