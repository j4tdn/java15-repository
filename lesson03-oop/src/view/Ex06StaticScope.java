package view;

// Internal: trong c¨´ng class
public class Ex06StaticScope {
	public static void main(String[] args) {
		add();
		// subtract();
	}
	
	//static --> static
	private static void add() {
		multiply();
		//divide();
	}
	
	//non --> static, non
	private void subtract() {
		multiply();
		divide();
	}
	
	private static void multiply() {
		
	}
	
	private  void divide() {
		
	}
}


