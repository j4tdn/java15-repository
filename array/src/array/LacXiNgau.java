package array;

import java.util.Random;
import java.util.Scanner;

public class LacXiNgau {
	public static void main(String[] args) {

		double taiKhoan = 100000;
		Scanner sc = new Scanner(System.in);
		int choice ;
		do {
			System.out.println("=====MỜI BẠN CHỌN=====");
			System.out.println("nhấn 1 để chơi-nhấn 2 để thoát");
			choice = sc.nextInt();
			if (choice==1) {
				System.out.println("===BÁT ĐẦU NÀO===");
				System.out.println("TÀI KHOẢN "+ taiKhoan);
				
				double datCuoc;
				do {
					System.out.println("ĐẶT MẤY ");
					datCuoc = sc.nextDouble();
				}while (datCuoc>taiKhoan || datCuoc<=0);
				
				int luaChon;
				do {
					System.out.println("===LỰA CHỌN 1 LÀ TÀI 2 LÀ XỈU===");
					luaChon = sc.nextInt();
				}while (luaChon != 1 && luaChon != 2);
				Random xx1 = new Random();
				Random xx2 = new Random();
				Random xx3 = new Random();
				
				int gt1 = xx1.nextInt(5)+1;
				int gt2 = xx2.nextInt(5)+1;
				int gt3 = xx3.nextInt(5)+1;
				
				int sum = gt1 + gt2 +gt3;
				System.out.println(gt1+ "  " +gt2+ "  " +gt3);
				if (sum == 3 || sum == 18) {
					System.out.println("CÁI BÃO");
					taiKhoan-=datCuoc;
					System.out.println("TÀI KHOẢN");
					
					
					
					
				}else 
					if (sum >= 4 && sum <= 10) {
						
						System.out.println("===XỈU RỒI BẠN ÊIIII");
						if (luaChon == 1) {
							System.out.println("BẠN ĐOÁN TRẬT LẤT");
							taiKhoan -=datCuoc;
							System.out.println("TÀI KHOẢN "+taiKhoan);
						}else {
							System.out.println("ĐOÁN TRÚNG RỒI BẠN ÊIII");
							taiKhoan+=datCuoc;
							System.out.println("TÀI KHOẢN "+taiKhoan);
						}
							
						
						
					}else {
						
					
						System.out.println("TÀI RỒI BẠN Ê");
						if (luaChon == 2) {
							System.out.println("BẠN ĐOÁN TRẬT LẤT");
							taiKhoan -=datCuoc;
							System.out.println("TÀI KHOẢN "+taiKhoan);
						}else {
							System.out.println("ĐOÁN TRÚNG RỒI BẠN ÊIII");
							taiKhoan+=datCuoc;
							System.out.println("TÀI KHOẢN "+taiKhoan);
						}
					
					}
				
				
			}
			
		}while (choice==1);
		
	}
}
