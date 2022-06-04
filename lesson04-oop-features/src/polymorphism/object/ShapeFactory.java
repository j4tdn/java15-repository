package polymorphism.object;

public class ShapeFactory {
	private ShapeFactory() {
		
	}
	public static Shape createShape(ShapeType shapeType) {
		switch(shapeType) {
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		}
		return new Shape();
	}
}
