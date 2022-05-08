package structure;

import javax.sql.rowset.serial.SQLOutputImpl;

// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex07 {
   public static void main(String[] args) {
	   int a = 12;
	   int b = 36;
	   
	   System.out.println("a: " + a);
	   System.out.println("b: " + b);
	   
	   System.out.println("===AFTER SWAP===");
	   
	   // Case 1 ==> Code in MAIN method ==> hard code
	   int tmp = a; //tmp = 5
	   a = b; // a = 7, b = 7
	   b = tmp; // a = 7, b = 5
	   
	   System.out.println("a: " + a);
	   System.out.println("b: " + b);
}
}


  // sao chép ex 7 qua ex 08 
  // ex ctrl + c
  // structure ctrl +V
