package inheritance.iinterface;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Ractangle");
	}

	@Override
	public void calS() {
		System.out.println("Width*Height");
	}
	
}
