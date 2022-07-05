package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email;
		boolean flag = true;
		do {
			try {
				System.out.print("Enter Email Address :");
				email = ip.nextLine();
				if (checkValidEmail(email) == false) {
					System.out.println("Sign in Mail Successfully !");
					flag = false;
				} 
			} catch (Exception e) {
				// 
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} while (flag == true);
	}

	private static boolean checkValidEmail(String a) throws Exception {
		if (!a.matches("^[A-Za-z0-9._-]+@[a-z](.[a-z]+)+")) {
			throw new Exception("Please Check the format of prefix before @ && the format of domain after @");
		}
	//	if (a.matches(a)) {
			
	//	}
		return false;
	}
}
