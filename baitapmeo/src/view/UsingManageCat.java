package view;

import java.util.Scanner;

import utils.ManageCat;

public class UsingManageCat {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		ManageCat cat = new ManageCat();
		int choose;
		do {
			showMenu();
			choose = Integer.parseInt(ip.nextLine());

			switch (choose) {
			case 1:
				cat.input();
				break;
			case 2:
				cat.display();
				break;
			case 3:
				cat.sort();
				break;
			case 4:
				cat.find();
				break;
			case 5:
				System.out.println("see you again");
				break;
			default:
				System.out.println("input the wrong data, please try again");
			}
		} while (choose != 5);

	}

	private static void showMenu() {
		System.out.println("1.enter inforn n cat");
		System.out.println("2.show inforn");
		System.out.println("3.sort cat list");
		System.out.println("4.find cat");
		System.out.println("5.quit");
		System.out.println("choose : ");
	}
}
