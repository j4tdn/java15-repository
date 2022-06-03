package polymorphism.object;

public class Rectamgle extends Shape {
	@Override
	void draw() {
		System.out.println("Ractangle => draw");
	}

	@Override
	void calS() {
		System.out.println("Rectangle => cals");
	}
}
