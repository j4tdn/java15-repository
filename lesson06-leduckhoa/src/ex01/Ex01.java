package ex01;

import java.util.Scanner;


public class Ex01 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	
		float a, b;		
		String sa , sb;
		double result = 0;
		
		do {
			System.out.println("Nhập a:");
			sa = input.nextLine();
			System.out.println("Nhập b:");
			sb = input.nextLine();
			
		try {
			a = Float.parseFloat(sa);
			b = Float.parseFloat(sb);
			result = solveEquation(a, b);
			break;
			
		
		}catch (Exception e) {	
				System.out.println(e.getMessage());
				System.out.println("Nhập lại");
		
		}
		}while(true);
		
		System.out.println("Kết quả: "+result);
		
		
	}
	public static double solveEquation(float a, float b)
	{
		String sa = String.valueOf(a);
		String sb =  String.valueOf(b);
	
		
		
		if(a == 0) {
			
			throw new ArithmeticException("Không thể chia cho 0");
			
		}
		
		if(!sa.matches(".*[0-9].*") || !sb.matches(".*[0-9].*"))
		{
			throw new NumberFormatException("số sai ");
		}
		
		return (float)-b/a;
	}
	
	
}
