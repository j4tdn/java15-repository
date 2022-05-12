package array;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {

		float taiKhoan = 1000000;
		Scanner sc = new Scanner(System.in);
		Locale lc = new Locale("en", "UK");
		NumberFormat nb = NumberFormat.getCurrencyInstance(lc);
		System.out.println("====CHÀO MỪNG BẠN ĐẾN VỚI TÀI XIU ONLINE====");
		int press;

		do {
			System.out.println("NHÂN 1 ĐỂ CHƠI");
			System.out.println("NHẤM PHÍM BẤT KÌ ĐỂ THOÁT");
			press = sc.nextInt();
			int choice;
			do {
				System.out.println("BẤM 1 CHỌN TÀI BẤM 2 CHỌN XỈU");
				choice = sc.nextInt();
			} while (choice != 1 && choice != 2);

			float cuoc;
			do {
				System.out.println("SỐ TIỀN CÒN LẠI: " + nb.format(taiKhoan));
				System.out.println("CƯỢC ĐÊ CƯỢC ĐÊ");
				
				cuoc = sc.nextFloat();
			} while (cuoc > taiKhoan || taiKhoan <= 0 || cuoc <= 0);
			
			Random xx1 = new Random();
			Random xx2 = new Random();
			Random xx3 = new Random();

			int gt1 = xx1.nextInt(5) + 1;
			int gt2 = xx2.nextInt(5) + 1;
			int gt3 = xx3.nextInt(5) + 1;
			int sum = gt1 + gt2 + gt3;
			if (sum == 3 || sum == 18) {
				System.out.println(gt1 + " " + gt2 + " " + gt3);
				System.out.println("TỔNG ĐIỂM : " + sum);
				System.out.println("CÁI BÃO");
				taiKhoan -= cuoc;
				System.out.println("SỐ TIỀN CÒN LẠI: " + nb.format(taiKhoan));
			} else if (sum >= 4 && sum <= 10) {
				System.out.println(gt1 + " " + gt2 + " " + gt3);
				System.out.println("TỔNG ĐIỂM : " + sum);
				System.out.println("XỈU XỈU CÁC CẬU ƠI");
				if (choice == 1) {
					System.out.println("BẠN ĐÃ CHỌN TÀI");
					System.out.println("ĐOÁN SAI BÉTTTT");
					taiKhoan -= cuoc;
					System.out.println("SỐ TIỀN HIỆN TẠI: " + nb.format(taiKhoan));
				} else {
					System.out.println("BẠN ĐÃ CHỌN XỈU");
					System.out.println("TRÚNG PHÓC LUÔNNN");
					taiKhoan += cuoc;
					System.out.println("SỐ TIỀN HIỆN TẠI: " + nb.format(taiKhoan));
				}
			} else {
				System.out.println(gt1 + " " + gt2 + " " + gt3);
				System.out.println("TỔNG ĐIỂM : " + sum);
				System.out.println("TÀI TÀI CÁC BẠN ƠI");
				if (choice == 1) {
					System.out.println("BẠN ĐÃ CHỌN TÀI");
					System.out.println("TRÚNG PHÓC LUÔNNN");
					taiKhoan += cuoc;
					System.out.println("SỐ TIỀN HIỆN TẠI: " +  nb.format(taiKhoan));
				} else {
					System.out.println("BẠN ĐÃ CHỌN XỈU");
					System.out.println("ĐOÁN SAI BÉTTTT");
					taiKhoan -= cuoc;
					System.out.println("SỐ TIỀN HIỆN TẠI: " +  nb.format(taiKhoan));
				}
			}

		} while (press == 1)  ;
	}
}
