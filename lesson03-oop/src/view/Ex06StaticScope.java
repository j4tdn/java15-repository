package view;

public class Ex06StaticScope {
	public static void main(String[] args) {
		add();
		
		multiple();
	}
	//timing: static >> non static
	
	//static --> static
	
	private static void add() {
		multiple();
//		divide();
	}
	
	// non static --> static, non static
	
	private void subtract() {
		multiple();
		divide();
	}
	
	private static void multiple() {
		
	}
	
	private  void divide() {
		
	}
}
