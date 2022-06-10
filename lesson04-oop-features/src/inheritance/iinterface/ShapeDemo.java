package inheritance.iinterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();
		
		System.out.println("=========================");
		
		//CÁCH 1: Anonymous class
		Shape shapeTriangle = new Shape() {
			
			@Override
			public void draw() {
				System.out.println("Drawing a Triangle");
			}
			
			@Override
			public void calS() {
				System.out.println("1/2 * Height * bottom side");
			}
		};
		shapeTriangle.draw();
		shapeTriangle.calS();
		
		System.out.println("=========================");
		
		// CÁCH 2
		Shape shapeTriangle1 = new Triangle();
		shapeTriangle1.draw();
		shapeTriangle1.calS();
	}
}
