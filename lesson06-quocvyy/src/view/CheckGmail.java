package view;

import java.util.Scanner;

public class CheckGmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gmail = sc.nextLine();
		do {
			try { 
		
			if(checkgamil(gmail)) {
				System.out.println("nhap dung");
				break;
			}
			
			
		} catch (Exception e) {
			System.out.println("nhap lai gmail");
			String gmail1 = sc.nextLine();
			
		}
		
		} while (true);
	}

	private static boolean checkgamil(String gmail) {
		// TODO Auto-generated method stub
		return false;
	}

}
