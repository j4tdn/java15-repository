package inheritance.iinterface;

public class ShapeDemo  {
	public static void main(String[] args) {
		Shape shapeRect = new Rectange();
		shapeRect.draw();
		shapeRect.calS();
		
		Shape shapeTriangle = new Shape() {
			
			@Override
			public void draw() {
				System.out.println("Triangle");
			}
			
			@Override
			public void calS() {
				System.out.println("1/2 a* h");
			}
		};
		shapeTriangle.draw();
		shapeTriangle.calS();
		
		
		Shape triangle = new Triangle();
		triangle.draw();
		triangle.calS();
		
	}

	
}
