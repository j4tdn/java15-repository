package inheritance.iinterface;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();
		Shape shapeTriangle = new Shape() {
			@Override
			public void calS() {
				System.out.println("1/2*chieucao*canhday");
			}
			@Override
			public void draw() {
				System.out.println("ve triangel");
				
			}
		};
		
		shapeTriangle.calS();
		shapeTriangle.draw();
		
		System.out.println("=======================");
		Shape triangle = new Triangle();
		triangle.draw();
		triangle.calS();
}
}
