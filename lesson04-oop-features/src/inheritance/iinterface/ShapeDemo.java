package inheritance.iinterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();

		// Anonymous Inner Type
		Shape shapeTriangle = new Shape() {

			@Override
			public void draw() {
				// TODO Auto-generated method stub
            System.out.println("Drawing a Triangle");
			}

			@Override
			public void calS() {
				// TODO Auto-generated method stub
            System.out.println("1/2*Height*bottom side");
			}
		};
		shapeTriangle.calS();
		shapeTriangle.draw();
		Shape triangle = new Triangle();
		triangle.calS();
		triangle.draw();
	}
}
