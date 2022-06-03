package polymorphism.object;

public class Rectangle extends Shape{
	@Override
	void calS() {
		System.out.println("Rectangle ==> calS ...");
	}
	
	@Override
	void draw() {
		System.out.println("Rectangle ==> draw ...");
	}
	
}
