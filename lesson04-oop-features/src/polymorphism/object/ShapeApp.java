package polymorphism.object;

public class ShapeApp {
	
		public static void main(String[] args) {
			Shape shapeRect = ShapeFactory.createShape(ShapeType.RECTANGLE);

			shapeRect.draw();
			shapeRect.calS();

			System.out.println("========");

			Shape shapeSquare = ShapeFactory.createShape(ShapeType.SQUARE);
			shapeSquare.draw();
			shapeSquare.calS();

			shapeRect = shapeSquare;

			Rectangle rect = new Rectangle();
			
			shapeRect = rect;
			Shape[] shapes = { shapeRect, shapeSquare, rect };
			System.out.println(shapes.length);

			
			System.out.println("========");
			Shape s1 = new Rectangle();
			s1.draw();
			
			//Rectangle r1 = new Shape();
			//r1.setBackground();
			Shape r2 = new Rectangle();
			((Rectangle)(r2)).setBackground();
		}

	}
