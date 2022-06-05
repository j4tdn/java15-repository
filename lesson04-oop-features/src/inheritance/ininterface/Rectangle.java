package inheritance.ininterface;

public class Rectangle implements Shape {

	@Override
	public void drow() {
		System.out.println("Drawing a Rectangle");
		
	}

	@Override
	public void calS() {
		System.out.println("Width * Height");
	}
	
}
