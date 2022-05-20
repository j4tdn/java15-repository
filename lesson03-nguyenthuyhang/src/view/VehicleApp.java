package view;

import java.util.Scanner;

public class VehicleApp {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number, n = 0;
		Vehicle v1 = new Vehicle(null, null, 0, 0, 0);
		Vehicle v2 = new Vehicle(null, null, 0, 0, 0);
		Vehicle v3 = new Vehicle(null, null, 0, 0, 0);
		
		Vehicle[]vehicles = {v1, v2, v3};
		
		do {
			System.out.println("1. Nhập thông tin và tạo đối tượng: ");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.: ");
			System.out.println("3. Thoát chương trình: ");
			number = Integer.parseInt(ip.nextLine());
			
			switch(number) {
			case 1:{
				System.out.println("Nhập số lượng xe: ");
				n = ip.nextInt();
				for (int i = 0; i < n; i++) {
                    System.out.println("Nhập thông tin xe " + (i+1) + ": ");
                    System.out.print("Tên chủ xe ");
                    vehicles[i].setName(ip.nextLine());
                    System.out.println("Loại xe ");
                    vehicles[i].setModel(ip.nextLine());
                    System.out.println("Dung tích ");
                    vehicles[i].setCapacity(Integer.parseInt(ip.nextLine()));
                    System.out.println("Trị giá ");
                    vehicles[i].setPrice(Double.parseDouble(ip.nextLine()));
				}
                 break;  
                   
			}
			case 2: {
				System.out.println("Tên chủ xe \t" + "Loại xe \t" + "Dung tích \t" + "Trị giá \t" + "Thuế phải nộp");
				for(int i = 0; i < n; i++) {
					System.out.println(vehicles[i].toString());
				}
				break;
			}
			case 3: {
				System.out.println("Thoát chương trình ");
				System.exit(0);
			}
			default:
				System.out.println();
			}
		}while(number !=3 );
	
			}

	}



