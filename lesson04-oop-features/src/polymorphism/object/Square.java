package polymorphism.object;

public class Square extends Shape{
	public Square() {
	}
	
	@Override
	void calS() {
		System.out.println("Square ==> calS ...");
	}
	
	@Override
	void draw() {
		System.out.println("Square ==> draw ...");
	}
	
	void doSomeThing() {
		System.out.println("Do something!");
	}
}
