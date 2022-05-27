package polymorphism.object;

public class ShapeApp {
	public static void main(String[] args) {
		/*
		 * 1. Tại sao không khai báo trực tiếp KDL lúc compile và runtime giống nhau
		 * - Áp dụng factory pattern
		 * - Dễ dàng chuyển đổi kiểu dữ liệu qua về
		 * - Tạo tập hợp các phần tử KDL cha, con đưa vào 1 mảng chung duy nhất
		 * - Convention
		 * 
		 * 2. Nếu lấy KDL của lớp con new KDL của lớp cha được không
		 * - Cha = con -> OK
		 * - Con = cha -> NO
		 * 
		 * 3. Lấy KDL lúc compile và runtime không có quan hệ được không
		 * - Không
		 * Design pattern: factory pattern
		 * 
		 * */
		
		// Factory design pattern
		Shape shapeRect = ShapeFactory.creatShape(ShapeType.RECTANGLE);
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("================");
		
		Shape shapeSquare = ShapeFactory.creatShape(ShapeType.SQUARE);
		shapeSquare.draw();
		shapeSquare.calS();
		//==========================================================================
		
		
		Shape shape = new Shape();
		shape.draw();
		shape.calS();
		
		shapeRect = shapeSquare;
		
		Rectangle rect = new Rectangle();		
		
		Shape[] shapes = {shapeRect, shapeSquare, rect};
		System.out.println(shapes.length);
		
		//============================================================================
		
		Shape s1 = new Rectangle();
		s1.draw(); // Shape and Rectangle have
		
		// Rectangle r1 = new Shape()  -->> Rectangle has, Shape hasn't
		
		
		
		
		
	}
}
