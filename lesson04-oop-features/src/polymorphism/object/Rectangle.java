package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Rectangle ==> draw...");
	}

	@Override
	void calS() {
		System.out.println("Rectangle ==> calS");
	}

	void setBackground() {
		System.out.println("Rectangle ==> setBackground");
	}

}
