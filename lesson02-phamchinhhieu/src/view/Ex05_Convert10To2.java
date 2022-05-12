package view;

import java.util.Scanner;

public class Ex05_Convert10To2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("=======CHUYEN HE SO 10 SANG HE SO 2");
		System.out.println();
		System.out.print("Nhap so tu nhien: ");
		int number = ip.nextInt();
		int arr[] = new int[16];
		System.out.println("===============");
		System.out.println("So " + number + " chuyen sang co so 2 la: "
								+ Convert10To2(number, arr) );
	}
	private static int Convert10To2(int number, int arr[]) {
		int count = 0;
		while(number > 0) {
			arr[count] = number % 2;
			number = number / 2;
			count++;
		}
		int value = 0;
		for(int i = count; i >= 0; i--) {
			value = value * 10 + arr[i];
		}
	//	System.out.println(value);
		return value;		
	}
}
