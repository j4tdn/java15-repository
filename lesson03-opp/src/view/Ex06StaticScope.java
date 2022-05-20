package view;
// Internal

public class Ex06StaticScope {
	public static void main(String[] args) {
		add();
		//subtract();
		// ko gọi được phải tạo một dối tượng rồi chấm mới gọi đươc hàm
		multiple();
	}
	private static void  add() {
		multiple();
		//divide();
		// ko gọi được hàm divide vì static ko thể gọi hàm non static 
		// vì 
		
	}
	private  void subtract() {
		multiple();
		divide();
		// có thể gọi static và non static
	}
	private static void multiple() {
		
	}
	private  void divide() {
		
	}
}
