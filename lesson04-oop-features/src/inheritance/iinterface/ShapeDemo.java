package inheritance.iinterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("===============");
		
		Shape triangle = new Triangle();
		
		triangle.draw();
		triangle.calS();
	}
}
