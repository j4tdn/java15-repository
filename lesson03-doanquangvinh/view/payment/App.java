package payment;

import java.util.Scanner;

public class App {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String numberAsText = "";
		System.out.print("Xin chao !!!! Vui long bam 'co' de tiep tuc :");
		numberAsText = ip.nextLine();
		if (numberAsText.equals("co") || numberAsText.equals("Co") || numberAsText.equals("CO")) {
			System.out.println("Chao mung den voi tong cuc thue Da Nang \n Vui long lam theo huong dan sau ");
			System.out.print("Nhap so luong xe can khai bao thue :");
			Vehicle[] vehicles = new Vehicle[ip.nextInt()];
			for (int i = 0; i < vehicles.length; i++) {
				vehicles[i] = new Vehicle();

				FillInformation.importVehicle(vehicles[i]);

			}
			System.out.print("Ten chu xe\t" + " Loai xe\t" + "Dung tich\t" + "Tri gia \t" + "Thue phai nop\n");
			System.out.println("===============================================================================");
			for (int i = 0; i < vehicles.length; i++) {
				
				FillInformation.export(vehicles[i]);
			}

		} else {
			System.out.println("Xin vui long nhap lai ");
			System.exit(0);
		}
	}

}
