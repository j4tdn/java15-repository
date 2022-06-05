package inheritance.ininterface;

public class Triangle implements Shape {

	@Override
	public void drow() {
		System.out.println("Drawing a Triangle");
	}

	@Override
	public void calS() {
		System.out.println("1/2 * heigh * bottom side");
	}

}
