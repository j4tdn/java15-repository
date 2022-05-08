package operator;

public class Ex01 {
  public static void main(String[] args) {
	  // = == ++ -- && || !
	  int a = 5;
	  int b = 2;
	  int c = 4;	
	  // VD1
	  System.out.println("Line 10: " + a++);
	  // a++ : thực hiện xong cộng
	  // Line 10: 5
	  System.out.println("Line 11: " + ++a);
	  // Line 11:7
	  // ++a: cộng mới thực hiện
	  
	  b += b++ - --b - ++b + c++ + c;
	  // += ==> b = b + b++ - --b - ++b + c++ + c;
	  System.out.println("b: " + b);
	  System.out.println("c: " + c);  
}
}
