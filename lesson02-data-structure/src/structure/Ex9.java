package structure;

// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex9 {
   // Hoán vị 2 phần tử số nguyên(int, Integer)
	public class Ex9 {
	   public static void main(String[] args) {
		   Integer a = 12;
		   Integer b = 36;
		   //12, 36 đang ở head
		   
		   System.out.println("a: " + a);
		   System.out.println("b: " + b);
		   
		   swap(a, b);
		   System.out.println("===AFTER SWAP===");
		   
		   System.out.println("a: " + a);//12
		   System.out.println("b: " + b);//36
	}
	    
	   // CASE 2 ==> Create a METHOD for reusable
	   // Integer f = a 12
	   // toán tử bằng nằm ở stack
	   // Integer s = b 36  ==> PASS BY VALUE
	   private static void swap(Integer f, Integer s) {
		     Integer tmp = f;
		     f = s;
		     s = tmp;
		     // f = 36
		     // s = 12
		     //biến int a dưới là 1 tham số của hàm swap 
		     // được sử dụng trong hàm swap, không được sử dụng trong hàm khác
		     // nếu cập nhật ở stack thì 2 toán tử main ko bao giwof thay đổi
	   }
	}

public static void main(String[] args) {
	   Integer a = 12;
	   Integer b = 36;
	   //12, 36 đang ở head
	   
	   System.out.println("a: " + a);
	   System.out.println("b: " + b);
	   
	   swap(a, b);
	   System.out.println("===AFTER SWAP===");
	   
	   System.out.println("a: " + a);//12
	   System.out.println("b: " + b);//36
}
    
   // CASE 2 ==> Create a METHOD for reusable
   // Integer f = a 12
   // toán tử bằng nằm ở stack
   // Integer s = b 36  ==> PASS BY VALUE
   private static void swap(Integer f, Integer s) {
	     Integer tmp = f;
	     f = s;
	     s = tmp;
	     // f = 36
	     // s = 12
	     //biến int a dưới là 1 tham số của hàm swap 
	     // được sử dụng trong hàm swap, không được sử dụng trong hàm khác
	     // nếu cập nhật ở stack thì 2 toán tử main ko bao giwof thay đổi
   }
}
  // dù kiểu dữ liệu nguyên thủy hay kiểu dữ liệu đối tượng thì khi gọi hàm swap dùng toán tử bằng thì không bao giờ thay đổi

