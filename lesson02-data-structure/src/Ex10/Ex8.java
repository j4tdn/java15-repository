package Ex10;

// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex8 {
   public static void main(String[] args) {
	   int a = 12;
	   //biến a được khởi tạo từ hàm main
	   // sẽ có phạm vi sử dụng trong hàm main
	   // không được sử dụng ngoài hàm main
	   int b = 36;
	   
	   System.out.println("a: " + a);
	   System.out.println("b: " + b);
	   
	   swap(a, b);
	   System.out.println("===AFTER SWAP===");
	   
	   System.out.println("a: " + a);
	   System.out.println("b: " + b);
}
    
   // CASE 2 ==> Create a METHOD for reusable
   // int f = a 12
   // int s = b 36  ==> PASS BY VALUE
   private static void swap(int f, int s) {
	     int tmp = f;
	     f = s;
	     s = tmp;
	     // f = 36
	     // s = 12
	     //biến int a dưới là 1 tham số của hàm swap 
	     // được sử dụng trong hàm swap, không được sử dụng trong hàm khác
	     
   }
}
  
