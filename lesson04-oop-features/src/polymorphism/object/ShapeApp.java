package polymorphism.object;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
	/**
	 * 1. Tại sao không khai báo trực tiếp KDL lúc compile và runtime giống nhau
	 * 		- Áp dụng factory pattern
	 *	    -Dễ dàng chuyển đổi KDL qua về
	 *      -Tạo tập hợp các phần tử KDL cha, con đưa về 1 mảng chung duy nhất
	 * + Convention
	 * 2. Nếu lấy KDL của lớp con new KDL của lớp cha được không?
	 * 		-Cha=con-> OK
	 * 		-else -> No
	 * 3. Lấy KDL lúc compile và runtime không có quan hệ được không?
	 * 		+ Không
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		
		Shape shapeRect= ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeRect.draw();
		shapeRect.calS();
		System.out.println("====================");
		Shape shapeSquare= ShapeFactory.createShape(ShapeType.SQUARE);
		shapeSquare.draw();
		shapeSquare.calS();
		
		//Rectangle a = new Rectangle();
		//Square b= new Square();
		Rectamgle rect= new Rectamgle();
		Shape[] shapes= {shapeRect, shapeSquare,rect};
		System.out.println(shapes.length);
		
		
		
		
	}

}
