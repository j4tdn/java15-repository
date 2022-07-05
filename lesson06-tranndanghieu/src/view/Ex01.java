package view;

import java.util.Scanner;

/**
 * Giải PT bậc nhất
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		int a,b;
		do {
			try {
				System.out.println("Nhập a:");
				a=Integer.parseInt(ip.nextLine());
				System.out.println("Nhập b:");
				b=Integer.parseInt(ip.nextLine());
				if(a==0&& b!=0) {
					System.out.println("Phương trình vô nghiệm");
				}
				if(a==0&& b==0) {
					System.out.println("Phương trình vô số nghiệm");
				}
				System.out.println("Kết quả: "+ -b/a);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai định dạng");
				
			}catch (ArithmeticException e) {
				System.out.println("b phải khác 0");
			}
		} while (true);
	}

}
