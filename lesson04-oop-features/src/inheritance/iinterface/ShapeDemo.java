package inheritance.iinterface;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draẉ̣̣̣();
		shapeRect.calS();
		System.out.println("===========");
		Shape shapeTriangle = new Shape() {
			
			@Override
			public void draẉ̣̣̣() {
				System.out.println("Draw a Triangle ");
			}
			
			@Override
			public void calS() {
				System.out.println("1/2 * Heigh * bottom side");
			}
		};
		shapeTriangle.draẉ̣̣̣();
		shapeTriangle.calS();
	}

}
