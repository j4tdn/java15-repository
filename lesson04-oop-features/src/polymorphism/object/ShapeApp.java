package polymorphism.object;

public class ShapeApp {
	/*
	 * 1.Tai sao khong khai bao truc tiep kdl luc compile va runtime ? + Ap dung
	 * Factory Pattern ( che dau viec khoi tao , ...) + De dang chuyen doi kieu du
	 * lieu qua ve + Tap hop cac phan tu KDL cha , KDL con + convention (quy uoc )
	 * 2. Neu lay KDL cua lop con new KDL lop cha duoc khong 
	 * + Cha = con ---> OK
	 * + ELSE      ---> NO
	 * 3. Lay KDL luc compile va runtime khong co quan he duoc khong
	 *  + Khong
	 */
	public static void main(String[] args) {
		Shape shapeRect = ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeRect.calS();
		shapeRect.draw();
		System.out.println("=============================================");
		Shape shapeSquare = ShapeFactory.createShape(ShapeType.SQUARE);
		shapeSquare.calS();
		shapeSquare.draw();

		shapeRect = shapeSquare;
		Rectangle rect = new Rectangle();
		Shape[] shapes = { shapeRect, shapeSquare, rect };
		shapes[2] = rect;
		Shape s1 = new Rectangle();
	//	Rectangle r1 = new Shape();
		
	}
}
