package inheritance.iinterface;

public class Triangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Triangle");
	}

	@Override
	public void calS() {
		// TODO Auto-generated method stub
		System.out.println("1/2 * Height * bottom side");
	}

}
