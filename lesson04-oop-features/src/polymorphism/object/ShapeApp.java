package polymorphism.object;
// không thể lấy con new cha, hoặc gắn bằng cha
public class ShapeApp {
	public static void main(String[] args) {
		Shape shapeRect = ShapeFactory.creShape(ShapeType.RECTANGLE);
		shapeRect.draw();
		shapeRect.calS();
		System.out.println("==================");
		
		Shape shapeSquare = new Square();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		shapeSquare.draw();
		shapeSquare.calS();
		
		shapeRect = shapeSquare;
		
		Rectangle rect = ShapeFactory.creShape(ShapeType.SQUARE);
		
		Shape[] shapes = {shapeRect; shapeSquare ; rect};
		
		System.out.println(shapes.length);
		
		System.out.println("===========================");
		Shape s1 = new Rectangle();
		s1.draw();
		
		
	
	}
}
