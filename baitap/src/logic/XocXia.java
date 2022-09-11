package logic;

import java.util.Random;
import java.util.Scanner;

public class XocXia {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner ip = new Scanner(System.in);
		
		do {
			System.out.println("CHÀO MƯNG ĐẾN XÓC XỈA ONLINE");
			String chooseAsString =null;
			do {
				System.out.println("1 LÀ CHẴN 2 LÀ LẼ");
				chooseAsString = ip.nextLine();
				if(chooseAsString.matches("\\d+")) {
				break;
				}
				System.out.println("invalid number");
			}while(true);
			int choose = Integer.parseInt(chooseAsString);
			boolean xx = rd.nextBoolean();
			if (xx = true) {
				System.out.println(" CHẴN RỒI");
			} else {
				System.out.println("LẼ NHA");
			}
			switch (choose) {
			case 1: {
				if(xx == true) {
					System.out.println("chọn đúng rồi bạn");
					break;
				}else {
					System.out.println("chọn sai rồi bạn");
					break;
				}
				
			}case 2: {
				if(xx == false) {
					System.out.println("chọn đúng rồi bạn");
					break;
				}else {
					System.out.println("chọn sai rồi bạn");
					break;
				}
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		} while (true);
	}
}
