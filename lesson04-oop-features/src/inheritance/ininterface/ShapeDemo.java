package inheritance.ininterface;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.drow();
		shapeRect.calS();

		System.out.println("============================");

		Shape shapeTriangle = new Triangle();

		shapeTriangle.drow();
		shapeTriangle.calS();

	}
}