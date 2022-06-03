package polymorphism.object;


public class ShapeApp {
	/**
	 * Tại sao k khai báo trực tiếp KDL lúc compole và runtime giống nhau
	 * Nếu lấy KDL của lớp con new KDL của lớp cha đc k
	 * lấy KDl lúc compile và runtime k có quan hệ đc k
	 */
	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();
		System.out.println("==============");
		
		Shape shapeSquare = new Square();
		shapeSquare.draw();
		shapeSquare.calS();
		
		
	}
}
