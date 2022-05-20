package ex02;

import java.util.Scanner;

public class VehicleView {
	public static void main(String[] args) {
		VehicleList list = new VehicleList();

		do {
			System.out.println("1. Enter information of Vehicle");
			System.out.println("2. Print information of Vehicle");
			System.out.println("3. Thoát.");
			int choose = new Scanner(System.in).nextInt();
			switch (choose) {
			case 1:
				do {
					list.add();
					System.out.println("Do you want to continue? (Y/N)");
					String choose2 = new Scanner(System.in).nextLine();
					if (choose2.equalsIgnoreCase("N")) {
						break;
					}
				} while (true);
				break;
			case 2:
				list.display();
				break;
			case 3:
				System.out.println("Bye!");
				return;
			}
		} while (true);
	}
}
