package main;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {

		float money = 10000000f;
		System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI TÀI XỈU ONLINE");
		System.out.println("CHỌN SỐ BẤT KỲ ĐỂ CHƠI-CHỌN 0 ĐỂ THOÁT");
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		System.out.println("BẠN CÓ " + money + "TRONG TÀI KHOẢN");

		do {
			System.out.println("===============================");
			
			System.out.println("BẤM 1 ĐỂ CHỌN TÀI - BẤM 2 ĐỂ CHỌN XỈU");
			int dice = sc.nextInt();

			if (dice == 1) {
				System.out.println("BẠN ĐÃ CHỌN TÀI");
				System.out.println("====================");
			} else if (dice == 2) {
				System.out.println("BẠN ĐÃ CHỌN XỈU");
				System.out.println("====================");

			}
			float anteUp;
			do {
				System.out.println("MỜI BẠN ĐẶT CƯỢC");
				anteUp = sc.nextFloat();
			} while (anteUp >= 0 && anteUp > money);
			Random rd = new Random();
			int xx1 = rd.nextInt(5) + 1;
			int xx2 = rd.nextInt(5) + 1;
			int xx3 = rd.nextInt(5) + 1;

			int sum = xx1 + xx2 + xx3;
			System.out.println(xx1 + " " + xx2 + " " + xx3);
			System.out.println("Tổng là " + sum);
			if (sum == 3 || sum == 18) {
				System.out.println("CÁI BÃO");
			} else if (sum > 3 && sum <= 10) {
				System.out.println("XỈU XỈU BẠN ÊI");
				if (dice == 1) {
					System.out.println("CHỌN SAI RỒI BẠN ÊI");
					System.out.println("SỐ TIỀN CỦA BẠN LÀ " + (money - anteUp));

				} else if (dice == 2) {
					System.out.println("CHỌN TRÚNG PHÓC RỒI BẠN ÊI");
					System.out.println("SỐ TIỀN CỦA BẠN LÀ " + (money + anteUp));
				}
			} else if (sum > 10 && sum <= 17) {
				System.out.println("TÀI TÀI RỒI BẠN ÊI");
				if (dice == 1) {
					System.out.println("ĐOÁN TRÚNG PHÓC RỒI BẠN ÊI");
					System.out.println("TÀI KHOẢN CỦA BẠN LÀ " + (money + anteUp));
				} else if (dice == 2) {
					System.out.println("ĐOÁN SAI RỒI BẠN ÊI");
					System.out.println("SỐ TIỀN CỦA BẠN LÀ " + (money - anteUp));
				}
			}

		} while (choice != 0);
	}
}
