package view;

import java.util.Scanner;

public class Ex01_FirstDegreeEquation {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float a = 0;
		float b = 0;
		do
		{
			try {
				System.out.println("Nhap a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Nhap b: ");
				b = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("Incorrect, try again!");
			}
		}
		while(true);
		try {
			System.out.println("x= " + 	abc(a,b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static float abc(float a, float b)  {
		if(a == 0) {
			if(b == 0) {
				throw new ArithmeticException("Phuong trinh vo so nghiem");
			}
			else {
				throw new ArithmeticException("Phuong trinh vo nghiem");
			}
		}
		return -b /a;
		
	}
}

