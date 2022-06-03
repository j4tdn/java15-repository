package polymorphism.object;

public class Square extends Shape {
	@Override
	void calS() {
		System.out.println("Square => calS");
	}

	@Override
	void draw() {
		System.out.println("Square => draw");
	}
	void setBackground() {
		System.out.println("Square ==> setBackground");
	}

}
