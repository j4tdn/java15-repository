package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	    public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			int a =0;
			int b = 0;
			try {
				System.out.print("Nhập a: ");
				 a = Integer.parseInt(ip.nextLine());
				System.out.print("Nhập b: ");
				 b = Integer.parseInt(ip.nextLine());
				if(a==0 && b == 0) {
					System.out.println("Phương trình vô số nghiệm");
				}
				System.out.println("Nghiệm của phương trình là : " + (-b/a));
				
			} catch (ArithmeticException e) {
				if(a == 0 && b!= 0) {
					System.out.println("Phương trình vô nghiệm: " + e);
				}
			}
			catch (NumberFormatException e1) {
				System.out.println("Nhập vào phải là số nguyên :" + e1.getMessage());
			}
		}
	}
