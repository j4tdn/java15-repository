package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsVadidation {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("Nhap nam sinh: ");
//		int year = Integer.parseInt(ip.nextLine());
//		int age = Year.now().getValue() - year;
//		System.out.println("Tuoi cua ban la: " + age);
// Như trên sẽ bị lỗi khi nhập năm sinh là một chuỗi String nên ta phải tiền xử lí
		
		System.out.println("Nhap nam sinh: ");
		String bYearAsString = null;
		// vadidate: Tiền xử lí đảm bảo dữ liệu đầu vào không bị lỗi. exception 
		do {
			bYearAsString = ip.nextLine();
			if (bYearAsString.matches("\\d+")){
				break;
			}
			System.out.println("Ban da nhap sai, vui long nhap lai");
			
		}while(true); 
		
		int bYear = Integer.parseInt(bYearAsString);
		int age = Year.now().getValue() - bYear;
		System.out.println("Tuoi cua ban la: " + age);
		

	}

}
