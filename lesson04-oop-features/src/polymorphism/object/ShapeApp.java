package polymorphism.object;

public class ShapeApp {
	public static void main(String[] args) {
		
		Shape shapeRect = ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeRect.draw();
		shapeRect.calS();
		System.out.println("===============");
		Shape shapeSqua = ShapeFactory.createShape(ShapeType.SQUARE);
		
		shapeSqua.draw();
		shapeSqua.calS();
		
		Rectangle rect = new Rectangle();
		
		Shape[] shapes = {shapeRect, shapeSqua, rect};
		
		System.out.println(shapes.length);
		System.out.println("====================");
		
		
	}
}
