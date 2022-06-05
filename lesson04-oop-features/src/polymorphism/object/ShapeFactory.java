package polymorphism.object;

public class ShapeFactory {
	public static final String RECT_TYPE = "rect";
	public static final String SQUARE_TYPE = "square";
	
	private ShapeFactory() {
		
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
