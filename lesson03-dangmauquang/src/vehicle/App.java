package vehicle;

import java.util.Scanner;
/**
 *	Chưa làm giống như form bài tập đưa ra
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng xe cần khai báo thuế: ");
		Vehicle[] vehicles = new Vehicle[sc.nextInt()];
		sc.nextLine();
		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i] = new Vehicle();
			System.out.print("Nhập chủ xe:");
			vehicles[i].setVehicleOwner(sc.nextLine());
			System.out.print("Nhập loại xe :");
			vehicles[i].setVehicleType(sc.nextLine());
			System.out.print("Nhập dung tích xi lanh :");
			vehicles[i].setCapacity(sc.nextInt());
			System.out.print("Nhập giá trị xe  : ");
			vehicles[i].setPrice(sc.nextDouble());
			System.out.println("Giá trị thuế phải nộp là: " + Tax.calTax(vehicles[i]));
			System.out.println("========================");
			sc.nextLine();
		}
	}

}
