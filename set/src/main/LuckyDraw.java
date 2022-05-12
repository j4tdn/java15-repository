package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LuckyDraw {
	Set<String> luckyBox = new HashSet<String>();

	public LuckyDraw() {

	}

	public boolean addCard(String card) {
		return this.luckyBox.add(card);
	}

	public boolean removeCard(String card) {
		return this.luckyBox.remove(card);
	}

	public boolean containCard(String card) {
		return this.luckyBox.contains(card);
	}

	public void clearCard() {
		this.luckyBox.clear();
	}

	public int sizeCard() {
		return this.luckyBox.size();
	}

	public String drawCard() {
		String result = "";
		Random rd = new Random();
		int gps = rd.nextInt(this.luckyBox.size());
		result = (String) this.luckyBox.toArray()[gps];
		return result;
	}
	public void allCard() {
		System.out.println(Arrays.toString(this.luckyBox.toArray()));
	}

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		LuckyDraw ld = new LuckyDraw();
		do {
			System.out.println("--------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("0. Thoát khỏi chương trình");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("Thêm thẻ dự thưởng");
				String cd = sc.nextLine();
				ld.addCard(cd);
			} else if (choice == 2) {
				System.out.println("Nhập mã muốn xóa");
				String cd = sc.nextLine();
				ld.removeCard(cd);
			} else if (choice == 3) {
				System.out.println("Nhập mã muốn kiểm tra");
				String cd = sc.nextLine();
				System.out.println("Mã" + cd + "có trong thùng may mắn" + ld.containCard(cd));
			} else if (choice == 4) {
				ld.clearCard();
				System.out.println("Đã xóa tất cã các thẻ may mắn");
			} else if (choice == 5) {
				System.out.println("Số lượng phiếu thưởng: " + ld.sizeCard());
			}else if (choice ==6) {
				System.out.println("Phiếu may măn của bạn là: "+ld.drawCard());
			}else if(choice == 7) {
				System.out.println("Đây là tất cã các phiếu may mắn");
				ld.allCard();
			}
			

		} while (choice != 0);

	}

}
