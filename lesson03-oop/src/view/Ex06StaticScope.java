package view;

public class Ex06StaticScope {
	public static void main(String[] args) {
			add();
		multiply();
	}

	public static void add() {
		
		multiply();
		divide();
	}

	public  void subtract() {
		multiply();
		divide();
	}

	public static void multiply() {
	}

	public void  divide() {
	}
}
