package inheritance.iinterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("================");
		
		// Anonymous class
		Shape shapeTriangle = new Shape() {
			
			@Override
			public void draw() {
				System.out.println("Drawing a Triangle");
			}
			
			@Override
			public void calS() {
				System.out.println("1/2 * Heigh * bottom side");
			}
		};
		shapeTriangle.draw();
		shapeTriangle.calS();
		
		System.out.println("===================");
		Shape triangle = new Triangle();
		triangle.draw();
		triangle.calS();
	}
}