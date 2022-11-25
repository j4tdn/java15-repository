package view;

import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args) {
           Scanner ip = new Scanner(System.in);
           int a = Integer.parseInt(ip.nextLine());
           int b = Integer.parseInt(ip.nextLine());
//		   int a = 1024, b = 2;
           if(checkSolution(a, b) == 1 && a > b) {
        	   System.out.println("true");
           } else if(checkSolution(b, a) == 1 && b > a) {
        	   System.out.println("true");
           } else {
        	   System.out.println("false");
           }
    }
	public static int checkSolution(int a, int b) {
		   if(a > b) {
			   for(int i = 2; i <= a; i++) {
				   if(Math.pow(b, i) == a) {
					   return 1;
				   }
//				   if(Math.pow(b, i) > a) return 0;
			   }
		   }
		   return 0;
	}
}
