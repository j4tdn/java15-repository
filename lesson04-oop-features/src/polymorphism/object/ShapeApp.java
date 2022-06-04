package polymorphism.object;

public class ShapeApp {
	public static void main(String[] args) {
		Shape shapeRectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeRectangle.calS();
		shapeRectangle.draw();
		
		System.out.println("======================");
		Shape shapeSquare = ShapeFactory.createShape(ShapeType.SQUARE);
		shapeSquare.calS();
		shapeSquare.draw();
		
		shapeRectangle = shapeSquare;
		
		Rectangle rect = new Rectangle();
		
		Shape[] shapes = {shapeRectangle, shapeSquare, rect};
		System.out.println(shapes.length);
		
		Shape s1 = new Rectangle();
		
	}
}
