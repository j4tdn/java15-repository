package view;

import java.util.Scanner;

import exception.InvalidException;

public class CheckEmail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập vào email:");
		String email = scanner.nextLine();
		do {
			try {
				
			
			if(checkMail(email)) {
				System.out.println("bạn nhập thông tin email thành công");
				break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.print("nhập vào email:");
		   email = scanner.nextLine();
		}
			
		}while(true);

	}

	public static boolean checkMail(String string) {
		if (!string.matches("^[a-z0-9]+[_.-]?[a-z0-9]+@mail.com$")) {
			throw new InvalidException("bạn nhập sai email xin mời nhập lại");
		
		}
		return true;

	}

}
