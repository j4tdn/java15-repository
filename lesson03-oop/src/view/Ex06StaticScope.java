package view;

public class Ex06StaticScope {
	public static void main(String[] args) {
		add();
		//sub();
		mul();
		//div();
	}
	private static void add() {
		mul();
		//sub();
	}
	private void sub() {
		mul();
		div();
	}
	private static void mul() {
		
	}
	private void div() {
		
	}
}
