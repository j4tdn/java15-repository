package inheritance.iinterface;

public class Rectange implements Shape {

	@Override
	public void draw() {
			System.out.println("Rectagle");
	}

	@Override
	public void calS() {
			System.out.println("w * h");
	}
	
}
