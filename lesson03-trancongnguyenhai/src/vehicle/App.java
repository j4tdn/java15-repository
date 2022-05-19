package vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Diluc", "Mercedes G65", 5980, 600000);
		Vehicle v2 = new Vehicle("Kazuha", "BMW i9", 1499, 163000);
		Vehicle v3 = new Vehicle("Zhongli", "Dream", 100, 900);
		Vehicle v4 = new Vehicle("Shogun", "Cub 50", 50, 700);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
		while (true) {
			System.out.println("===================================================");
			System.out.println("1. Nhập thông tin xe");
			System.out.println("2. Xuất bảng thông tin tiền thuế trước bạ của xe");
			System.out.println("3. Thoát chương trình");
			System.out.println("===================================================");
			Scanner ip = new Scanner(System.in);
			System.out.print("Nhập lựa chọn của bạn: ");
			int k = ip.nextInt();
			switch (k) {
			case 1: {
				Vehicle v = new Vehicle();
				VehicleUtils.writeRecord(v);
				vehicles.add(v);
				break;
			}
			case 2: {
				System.out.println();
				String header = String.format("%-25s%-25s%-25s%-25s%-25s", "Tên chủ xe", "Loại xe", "Dung tích",
						"Trị giá", "Thuế phải trả");
				System.out.println(header);
				System.out.println(
						"=================================================================================================================");
				Vehicle[] arr = new Vehicle[vehicles.size()];
		        arr = vehicles.toArray(arr);
				VehicleUtils.showRecord(arr);
				System.out.println();
				break;
			}
			case 3:
				System.out.println("~~Good Bye~~");
				System.exit(-1);
			}
		}
	}
}
