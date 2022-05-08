package structure;

import bean.CustomInteger;
public class Ex08 {
	public static void main(String[] args) {
		   CustomInteger a = new CustomInteger(12);
		   CustomInteger b = new CustomInteger(17);  
		   
		  // Case 1: code luôn trong hàm main
//		   int temp = a;
//		   a = b;
//		   b = temp;
		   
		   System.out.println("a = " + a);
		   System.out.println("b = " + b);
		   
		   swap(a,b);
		   
		   System.out.println("-----------");
		   System.out.println("a = " + a);
		   System.out.println("b = " + b);
		   
		 }
	   // case 2: viết hàm
       private static void swap(CustomInteger f, CustomInteger s) {
    	   int temp = f.value; 
    	   f.value = s.value;
    	   s.value = temp;
       }
       
       
}
