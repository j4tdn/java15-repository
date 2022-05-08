package control;

import java.util.Random;

/**
 * 
 * Nhap vao 1 thang
 * In ra so ngay trong thang
 *
 */
public class Ex03_SwitchCase {
	public static void main(String[] args) {
		Random rd = new Random();
		int m = rd.nextInt(1,13);
		System.out.println("Thang " + m + " co " + Day(m) + " ngay");
	}
	
	private static int Day(int month) {
		int a= month;
		switch (a)
		{
		case 1,3,5,7,8,10,12:
			return 31;
		
		case 4,6,9,11:
			return 30;
		case 2:
			return 29;
		default:
			System.out.println("Invalid month");
			return 0 ;
		}
		
		
	}
}
