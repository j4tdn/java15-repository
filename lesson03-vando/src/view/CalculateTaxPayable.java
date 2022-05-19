package view;

import java.util.Scanner;

public class CalculateTaxPayable {
	static Scanner sc = new Scanner(System.in);

	static void input(Vehicle car) {
		sc.nextLine();
		System.out.print("Nhập tên chủ xe: ");
		car.setNameCarOwner(sc.nextLine());
		
		
		System.out.print("Nhập tên loại xe: ");
		car.setRangeofVehicle(sc.nextLine());
		
		System.out.print("Nhập dung tích xe: ");
		car.setCapacity(sc.nextInt());
		
		System.out.print("Nhập giá trị xe: ");
		car.setValue(sc.nextDouble());
	}

	public static void main(String[] args) {
		Vehicle XE[] = null;
		int choose, n = 0;
		boolean flag = true;

		do {
			System.out.println("1.	Tạo các đối tượng xe và nhập thông tin \n"
					+ "2.	Xuất bảng kê khai tiền thuế của các xe.\n" 
					+ "3.	Thoát chương trình");
			System.out.println("===================================================");
			System.out.print("Mời bạn nhập yêu cầu: ");
			
			choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
				n = sc.nextInt();

				XE = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Xe thứ " + (i + 1) + ":");
					XE[i] = new Vehicle();
					input(XE[i]);
				}
				break;
			case 2:
				System.out.printf("|%-20s | %-15s | %-15s | %-20s | %-20s %n","Tên chủ xe", "Loại xe", "Dung tích","Trị giá", "Thuế phải nộp");
				System.out.println("=====================================================================================");

				for (int i = 0; i < n; i++) {
					XE[i].inDeclarationTable();
				}
				break;
			case 3:
				flag = false;
				break;
			}
		}while (flag);
	}

}
