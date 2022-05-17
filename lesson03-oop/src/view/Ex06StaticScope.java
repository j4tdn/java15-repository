package view;

public class Ex06StaticScope {
	public static void main(String[] args) {
    add();
    //subtract();
    multiply();
    //divide();
	}
  //timing: static >> non-static
	private static void add() {
       multiply();
       // divide();
	}

	private  void subtract() {
    multiply();
    divide();
	}
	
	private static void multiply() {
		
	}
    private void divide() {
		
	}
}
