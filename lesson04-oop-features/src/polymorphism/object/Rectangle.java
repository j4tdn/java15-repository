package polymorphism.object;

public class Rectangle extends Shape{
	public Rectangle() {
	}
	
	@Override
	void calS() {
		System.out.println("Rectangle ==> calS");
	}
	
	@Override
	void draw() {
		System.out.println("Reactangle ==> draw ...");
	}
}

