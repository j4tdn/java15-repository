package view;

import java.util.Scanner;

public class Ex03_ValidEmail {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String email;
		do { 
			System.out.println("===============");
			System.out.println("Nhap email: ");
			email = sc.nextLine();
			try {
				if (CheckEmail(email)) {
					System.out.println("OK");
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	private static boolean CheckEmail(String email) throws Exception {
		int piv = 0;
		int count = 0;
		char[] Arr1 = { '-', '_', '.' };
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				piv = i;
				count++;
				// System.out.println("piv= " + piv);
			}
			
		}
		if(count == 0) {
			throw new Exception("Gmail khong co ki tu @");
		}
		String eml = "";
		String eml1 = "mail.com";
		for (int i = piv +1; i < email.length(); i++) {
			eml += email.charAt(i); 
		}
		if(!eml.equals(eml1)) {
			throw new Exception("Email Domain khong hop le");
		}
		for (int i = 0; i < piv; i++) {
			for (int j = 0; j < Arr1.length; j++) {
				if (email.charAt(i) == Arr1[j]) {
					for (int k = 0; k < Arr1.length; k++) {
						if (email.charAt(i + 1) == Arr1[k]) {
							throw new Exception("Email Prefix có chứa 2 kí tự đặt biệt liên tiếp");
						}
						if (email.charAt(i + 1) == '@') {
							throw new Exception("Email Prefix có chứa 2 kí tự đặt biệt liên tiếp ");
						}
						if (email.charAt(0) == Arr1[k]) {
							System.out.println("ahii");
							throw new Exception("Chữ đứng đầu Email Prefix không thể là kí tự");
						}
					}
				}
				if (email.charAt(i) != Arr1[j]) {
					if ((email.charAt(i) < 'a' || email.charAt(i) > 'z')
							&& (email.charAt(i) < '0' || email.charAt(i) > '9')) {
						throw new Exception("Kí tự " + email.charAt(i) + " không hợp lệ");
					}
				}
			}
		}
		if (email.charAt(0) == '@' || email.charAt(email.length() - 1) == '@') {
			throw new RuntimeException("Ki tu @ khong the o vi tri dau tien hoac cuoi cung!");
		}
		return true;
	}
}
