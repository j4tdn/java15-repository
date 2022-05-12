package main;

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		String s;
		char l;
		boolean tontai = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi");
		s = sc.nextLine();
		System.out.println("Nhap ky tu");
		l = sc.nextLine().charAt(0);

		char mang[] = s.toCharArray();
		for (int i = 0; i < mang.length; i++) {
			if (l == mang[i]) {
				System.out.println("Vị Trí Thứ " + i + " Có 1 Ký tự " + l);
				tontai = true;
			}

		}if(tontai == false) {
			System.out.println("Không tồn tại kí tự " +l+ " nào trong chuỗi");
		}
	}
}
