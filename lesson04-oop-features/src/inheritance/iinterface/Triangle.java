package inheritance.iinterface;

public class Triangle implements Shape	 {

	public void draw() {
		System.out.println("Triangle");
	}
	
	@Override
	public void calS() {
		System.out.println("1/2 a* h");
	}

}
