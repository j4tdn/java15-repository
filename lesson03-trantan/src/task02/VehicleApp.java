package task02;

import java.util.Arrays;
import java.util.Scanner;

public class VehicleApp {
	public static void main(String[] args) {
		
		Vehicle vhc1 = new Vehicle(null, null, 0, 0);
		Vehicle vhc2 = new Vehicle(null, null, 0, 0);
		Vehicle vhc3 = new Vehicle(null, null, 0, 0);
		Vehicle[] vehicles = {vhc1, vhc2, vhc3};
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		do {
			System.out.println("MỜI LỰA CHỌN \n============================");
			System.out.println("1. Nhập thông tin của xe\n"
					+ "2. Xuất bảng kê khai tiền thuế trước bạ của các xe\n"
					+ "3. Thoát chương trình.");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				
//				System.out.println("số lượng xe muốn nhập");
//				int n = Integer.parseInt(sc.nextLine());
			
				
				for (Vehicle vehicle : vehicles) {
					
				
					System.out.println("Nhập chủ sở hữu");
					vehicle.setVehicleOwner(sc.nextLine());
					System.out.println("Nhập loại xe");
					vehicle.setVehicleName(sc.nextLine());
					System.out.println("Nhập dung tích xe");
					vehicle.setCapacity(Integer.parseInt(sc.nextLine()));
					System.out.println("Nhập gía xe");
					vehicle.setPrice(Double.parseDouble(sc.nextLine()));
				}
				
			}if(choice == 2) {
				System.out.println(Arrays.deepToString(vehicles));
			}
			
								
		}while(choice != 3);
		}
}
