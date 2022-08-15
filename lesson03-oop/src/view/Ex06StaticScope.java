package view;

// Internal

public class Ex06StaticScope {
	
	public static void main(String[] args) {
		add();
		// subtract();
		multiply();
		// divide();
		
		Ex06StaticScope o6 = new Ex06StaticScope();
		o6.subtract();
		
		Ex06StaticScope.add();
	}
	
	// timing: static >> non-static

	// static --> static
	private static void add() {
		multiply();
		// divide();
	}

	// non --> static, non
	private void subtract() {
		multiply();
		this.divide();
	}

	private static void multiply() {
	}

	private void divide() {
	}
}
