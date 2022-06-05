package polymorphism.object;

public class Square extends Shape {

	@Override
	void draw() {
		System.out.println("Squara ==> draw...");
	}

	@Override
	void calS() {
		System.out.println("Square ==> calS ...");
	}
	void setBackground() {
		System.out.println("Square ==> setBackground");
	}
	
}
