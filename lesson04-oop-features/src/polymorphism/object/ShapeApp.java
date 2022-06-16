package polymorphism.object;

public class ShapeApp {
	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("=========");
		
		Shape shapeSquare = new Square();
		shapeSquare.draw();
		shapeSquare.calS();
	}
	
}
