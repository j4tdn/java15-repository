package logic;

import java.util.Random;
import java.util.Scanner;

public class Numberss {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int[] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(100);
		}
				
		try {
			System.out.println("Nhập GIÁ TRỊ");
			int n = Integer.parseInt(ip.nextLine());

			System.out.println(numbers[n]);
		}
		catch(NumberFormatException e) {
			System.out.println(" NHẬP SỐ ĐI GIÙM Ạ");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("VƯỢT QUÁ SÔ PHẦN TỬ CỦA MẢNG");
		} 
	}
}

