package view;

public class Ex06StaticScope {

	public static void main(String[] args) {
		add();

	}

	private static void add() {
		multiply();
//		divide();
	}

	private void subtract() {
		multiply();
		this.divide();
	}

	private void divide() {

	}

	private static void multiply() {

	}
}