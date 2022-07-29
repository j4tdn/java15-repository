package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsTryCatch {
	//Cách 1: Xử lí khi xảy ra lỗi để đảm bảo đoạn mã phía sau vẫn được thực thi
	private static Scanner ip = new Scanner(System.in);
	
	//function scope, block scope : khi khai báo biến ở function or block thì biến đó chỉ được dùng ở trong function hoặc 
	//block đó thôi
	
	public static void main(String[] args) {
		
		int currentYear = Year.now().getValue();
		int byear = 0;
		do {
		System.out.println("Enter birth year: ");
			try {
				byear = Integer.parseInt(ip.nextLine());
				boolean isValidExtendRequirement = (byear >=1850 && byear <= currentYear);
				if(isValidExtendRequirement) break;
				System.out.println("Require [1850, 2022]");
			} catch (NumberFormatException e) {
				System.out.println(">>>>>>");
				e.printStackTrace();
			}
		}while(true);
		
		int age = Year.now().getValue() - byear;
		System.out.println("Age: " + age);
	}
}
