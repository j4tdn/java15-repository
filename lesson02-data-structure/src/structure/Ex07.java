package structure;

public class Ex07 {
	   public static void main(String[] args) {
		   int a=5,b=7;  
		   
		   //Case 1: code luôn trong hàm main
		   int temp = a;
		   a = b;
		   b = temp;
		   
		   System.out.println("a =" + a);
		   System.out.println("b =" + b);
		   
		   
	}
}
