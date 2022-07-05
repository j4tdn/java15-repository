package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01FirstEquation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b;
		boolean flag = false;
		do {
			try {
				System.out.println("Nhap a:");
				a = ip.nextInt();
				System.out.println("Nhap b:");
				b = ip.nextInt();

				System.out.println("Phuong trinh co nghiem: " + (-b) / a);
				flag =  true;
			} catch (ArithmeticException x) {
				System.out.println("Error :" + x);
				System.out.println("Vui long nhap lai");
			} catch (InputMismatchException x1) {
				System.out.println("Loi nhap sai ki tu :" + x1);
				System.out.println("Vui long nhap lai");
			}
			
		} while(!flag);
	}
}
