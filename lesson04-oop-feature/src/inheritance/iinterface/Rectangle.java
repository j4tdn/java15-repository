package inheritance.iinterface;

public class Rectangle implements Shape  {
	
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
	
	@Override
	public void calS() {
		System.err.println("Width * Height");
	}
}
