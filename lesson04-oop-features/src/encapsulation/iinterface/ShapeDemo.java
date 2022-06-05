package encapsulation.iinterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Rectangle shapeRect = new Rectangle();
		
		Shape shapeTriangle = new Shape() {
			@Override
			void draw() {
				System.out.println("Drawing a Triangle");
				
				
			}
			@Override
			void calS() {
				System.out.println("1/2 * Heigh * bottom side");
			}
		
	
};
		shapeTriangle.draw();
		shapeTriangle.calS();
		
		System.out.println("==============================");
		Shape triangle = new Triangle();
		coppy hết mấy cái của a nam cho pi
		 
		
		}
}
