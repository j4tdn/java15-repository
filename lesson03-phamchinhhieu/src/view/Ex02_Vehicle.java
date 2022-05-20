package view;

import java.text.DecimalFormat;
import java.util.Scanner;

import been.Vehicle;

public class Ex02_Vehicle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###");

		Vehicle vh[] = new Vehicle[5];
		int dem = 0;
		while(true) {
			System.out.println("1. Nhap thong tin");
			System.out.println("2. Xuat ban ke khai");
			System.out.println("3. Thoat");
			int choose = 0;
			System.out.print("Nhap lua chon: ");
			choose = ip.nextInt(); ip.nextLine();
			if(choose == 1) {
				vh[dem] = new Vehicle();
				nhapThongTin(vh[dem]);
				fax(vh[dem]);
				dem++;
			}
			if(choose == 2) {
				
				System.out.println("=======================================================================================================");

				System.out.println( "Ten chu xe			Loai xe			"
						+ "Dung Tich			Tri gia				Thue phai nop");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				for(int i = 0; i < dem; i++) {
					System.out.println(vh[i].getName()+"			"+ vh[i].getVehicletype()+"			"+
				vh[i].getCapacity() +"				"+ df.format(vh[i].getPrice()) + " 				" + df.format(vh[i].getFax()));
				}
				System.out.println("=======================================================================================================");
			}
			if(choose == 3)
				break;		
		}
	}
	public static void nhapThongTin(Vehicle vh) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap ho ten khach hang: ");
		vh.setName(ip.nextLine());
		System.out.print("Nhap loai xe: ");
		vh.setVehicletype(ip.nextLine());
		System.out.print("Nhap dung tich: ");
		vh.setCapacity(ip.nextInt());ip.nextLine();
		System.out.print("Nhap gia: ");
		vh.setPrice(ip.nextDouble());ip.nextLine();
	}
	public  void hienThi() {
		System.out.println();
	}
	public static void fax(Vehicle vh) {
		double fax;
		if(vh.getCapacity() < 100) {
			fax = (vh.getPrice() /100);
		}
		else if(vh.getCapacity() > 200) {
			fax = (vh.getPrice() *5 /100);
		}
		else {
			fax = (vh.getPrice() *3 / 100);
		}
		 
		vh.setfax(fax);
		
		
	}
}
