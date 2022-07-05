package view;

import java.util.Scanner;


public class Ex01FirstDegreeEquation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a,b;
		
		while(true) {
			try {
				System.out.print("Enter a = ");
				a = ip.nextInt();
				System.out.print("Enter b = ");
				b = ip.nextInt();
				System.out.println(a + "x +" + b + "= 0");
				System.out.println("X: " + divide(a,b));
				break;
			}catch(NumberFormatException e)
			{
				System.out.println("Error: Please input number");
				
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	}
		private static float divide(float a, float b) {
			if(a == 0) {
				throw new ArithmeticException("Error: divide by 0");
			}
			return -b/a;
		}
	}
	
