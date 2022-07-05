package math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01Equation {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int b = 0;int a = 1;
		DecimalFormat decimalFormat = new DecimalFormat("#.##"); 
		do {
			System.out.println("Nhap a: ");
			try {
				a = Integer.parseInt(sc.nextLine());
				if (a == 0) {
					do {
						System.out.println("Nhap a: ");
						a = Integer.parseInt(sc.nextLine());
					}while(a != 0);
				}else {break;}
			} catch (NumberFormatException e) {
				System.out.println(">>>Invalid Number a !!!\n");
			}
		} while (true);
		do {
			System.out.println("Nhap b: ");
			try {
				b = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(">>>Invalid Number b !!!\n");
			}
		} while (true);

		double x =(double) -b/a;
		System.out.println("X = " + decimalFormat.format(x));
		System.out.println("Finished !!!");
	}
}
