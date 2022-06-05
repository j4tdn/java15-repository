package polymorphism.object;

public class ShapeApp {
	public static void main(String[] args) {
		Shape shapeRect =  ShapeFactory.createShape(ShapeType.RECTANGLE);
		
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("==================");
		
		Shape shapeSquare =  ShapeFactory.createShape(ShapeType.SQUARE);
		shapeSquare.draw();
		shapeSquare.calS();

		shapeRect = shapeSquare;
		
		Rectangle rect = new Rectangle();
		
		Shape[] shapes = {shapeRect, shapeSquare, rect};
		
		System.out.println(shapes.length);
		
		
		
	}
	
}
