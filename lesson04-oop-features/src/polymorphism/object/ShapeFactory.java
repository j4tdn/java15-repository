package polymorphism.object;

public class ShapeFactory {
	
	public static Shape createShape(String shapeType) {
		switch (shapeType) {
		case "rectangle": return new Rectangle(); 
		case "square" : return new Square();	  
		}
		return new Shape();
	}
}
