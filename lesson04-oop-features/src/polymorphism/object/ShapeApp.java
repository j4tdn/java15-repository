package polymorphism.object;

import java.util.Calendar;

public class ShapeApp {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("day of month: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("day of year: " + c.get(Calendar.DAY_OF_YEAR));
		
		Shape shapeRect = ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("===================");
		
		Shape shapeSquare = ShapeFactory.createShape(ShapeType.SQUARE);
		shapeSquare.draw();
		shapeSquare.calS();
		
		shapeRect = shapeSquare;
		
		Rectangle rect = new Rectangle();
		
		Shape[] shapes = {shapeRect, shapeSquare, rect};
		System.out.println(shapes.length);
		
		System.out.println("=====================");
		Shape s1 = new Rectangle();
		s1.draw(); // Shape#draw Rectangle#draw
		
		//Rectangle r1 = (Rectangle) new Shape();
		//r1.setBackground();
		
		Shape r2 = new Rectangle();
		if(r2 instanceof Square) {
			Square sq1 = (Square)r2;
			sq1.setBackground();
		} else if(r2 instanceof Rectangle) {
			Rectangle rect1 = (Rectangle)r2;
			rect1.setBackground();
		}
	}

}
