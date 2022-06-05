package TaxVehicle;

import java.util.Scanner;

public class VehicleUtils {
	public static void main(String[] args) {
		System.out.println("======Menu lựa chọn=======");
		System.out.println("1.Nhập một thông tin khách hàng");
		System.out.println("2.Xuất bản kê khai tiền thuế");
		System.out.println("3.Thoát chương trình");
		VehicleUtils.add();

	}
	private VehicleUtils() {

	}

	public static double calculateTax(Vehicle vehicle) {
		double taxMoney = 1.0;
		if (vehicle.getCapacity() < 100) {
			taxMoney = vehicle.getPrice() * 0.01;
		} else if (vehicle.getCapacity() >= 100 && vehicle.getCapacity() <= 250) {
			taxMoney = vehicle.getPrice() * 0.02;
		} else {
			taxMoney = vehicle.getPrice() * 0.03;
		}
		return taxMoney;
	}

	

	public static void add() {
		int luachon;
		
		boolean check = true;
		Vehicle[] result = new Vehicle[100];
		int i = 0;
	    
		while(true){
			System.out.print("nhập lựa chọn của bạn:");
			//luachon = new Scanner(System.in).nextInt();
			Scanner sc = new Scanner(System.in);
			luachon = sc.nextInt();
		if (luachon == 1) {
			check = true;
		while (check ) {
			
			
			Scanner ip = new Scanner(System.in);
			System.out.println("==============================================");
			System.out.println("Enter customer information");
			System.out.print("Enter the owner's name : ");
			String owner = ip.nextLine();
			System.out.print("Enter vehicle type : ");
			String type = ip.nextLine();
			System.out.print("Enter vehicle capacity : ");
			int capacity = ip.nextInt();
			System.out.print("Enter the price of the car : ");
			int price = ip.nextInt();
			result[i] = new Vehicle(owner, type,capacity, price);
			i++;
			
			while (true) {
				System.out.print("Do you want to add more customers?(yes/no): ");
				String test = new Scanner(System.in).nextLine();
				
				if (test.equals("yes")) {
					check = true;
					break;
				}

				else if (test.equals("no")) {
					check = false;
					break;
				} 
				else {
					System.out.println("---If you entered it wrong, please re-enter it---");
				}
				
				
			}
			
			
		}
		}
		if(luachon ==2) {
		System.out.printf("%-12s %-12s %-12s %-12s %-12s", "tên chủ xe","loại xe", "dung tích","trị giá", "thuế phải nộp" );
		System.out.println();
		System.out.println("============================================================");

		for(int j = 0; j<=i-1;j++) {
			
		System.out.printf( "%-12s %-12s %-12d %-12d %-12f",result[j].getNameOwner() , result[j].getNameCar() ,result[j].getCapacity() ,result[j].getPrice(), VehicleUtils.calculateTax(result[j]));
		System.out.println();
		}
		}
		if(luachon == 0 ) {
			System.exit(0);
		}
		}
	}

}
