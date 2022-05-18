package view;

// Internal

public class Ex06StaticScope {
	
	  public static void main(String[] args) {
		add();
		// subtract();
		multiply();
		// divide();
		
	}
	  // timing: static >> non - static
	  
	  // static --> static

	  private static void add() {
		  // static: void có chấm được hay k
		  multiply();
		  // divide();
	  }

	  // non --> static, non
	  private  void subtract() {
	       multiply();
	       this.divide();
	  }
	  
	  private static void multiple() {
	  }
	  
	  private void divide() {
		  
	  }
1. Phân biệt class và object> cho ví dụ đã từng sử dụng
2.  this là gì
3. Tại sao khai báo private cho các thuộc tính trong class
và sử dụng getter, setter để truy cập
==> sao không dùng public 