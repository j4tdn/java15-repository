package inheritance.iinterface;

public class Triangle implements Shape {
//45
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");
	}

	@Override
	public void calS() {
		System.out.println("1//2 * Heigh * Bottomside");
	}

}