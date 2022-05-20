package view;

public class Ex06StaticScope {
	public static void main(String[] args) {
		add();
		//subtract();
		multiply();
		//divide();
		
		Ex06StaticScope o6 = new Ex06StaticScope();
		o6.subtract();
		
		Ex06StaticScope.add();
	}
	//timing: static -> non-static
	
	//static gọi static, k gọi đc non-static
	private static void add() {
		multiply();
		//divide();
	}
	//static gọi static, non-static
	private  void subtract() {
		multiply();
		divide();
	}
	
	private static void multiply() {
		
	}
	
	private  void divide() {
		
	}
	
}
