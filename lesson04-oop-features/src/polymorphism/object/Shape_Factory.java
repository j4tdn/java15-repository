package polymorphism.object;

public class Shape_Factory {
	private Shape_Factory() {
		
	}
	public static Shape createShape(ShapeType shapeType) {
		switch (shapeType) {
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		}
		return new Shape();
		
	}
}
