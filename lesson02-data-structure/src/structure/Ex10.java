package structure;

import bean.CustomInteger;

public class Ex10 {
		public static void main(String[] args) {
			CustomInteger a = new CustomInteger(12);
			CustomInteger b = new CustomInteger(17);  
			   
			   System.out.println("a = " + a);
			   System.out.println("b = " + b);
			   
			   swap(a,b);
			   
			   System.out.println("a = " + a);
			   System.out.println("b = " + b);
	}
		
	   public static void swap(CustomInteger a, CustomInteger b) {
	   	         int t		=	a.value;
	   	         a.value	=	b.value;
	   	         b.value	=	t;
	   	}
	   }

