package view;

public class Ex06StaticScope {
	public static void main(String[] args) {
		Ex06StaticScope o6 = new Ex06StaticScope();
		o6.subtract();

		Ex06StaticScope.add();
	}

	// timing : static >> non-static
	// static >> static
	private static void add() {
		multiply();
		// divide()
	}

	// non static >>> static, non-static
	private void subtract() {
		multiply();
		divide();
		add();
	}

	private static void multiply() {
	}

	private void divide() {

	}
}
