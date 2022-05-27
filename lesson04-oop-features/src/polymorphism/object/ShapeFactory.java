package polymorphism.object;

public class ShapeFactory {
	public static Shape creatShape(ShapeType shapeType) {
		switch (shapeType) {
		case RECTANGLE: {
			return new Rectangle();
		}
		case SQUARE:
			return new Square();
		default:
			return new Shape();
		}
	}
}
