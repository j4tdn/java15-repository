package car;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);

	private static void inputCar(Vehicle Car) {
		System.out.print("Nhap ma xe : ");
		Car.setIdCar(sc.nextInt());
		sc.nextLine();
		System.out.print("Nhap ten chu xe: ");
		Car.setNameCar(sc.nextLine());
		System.out.print("Nhập dung tích xe: ");
		Car.setCapacity(sc.nextLine());
		System.out.print("Nhập trị giá xe: ");
		Car.setCost(sc.nextDouble());
		sc.nextLine();
		System.out.print("Mô tả: ");
		Car.setDescribe(sc.nextLine());
	}

	public static void main(String[] args) {
		Vehicle a[] = null;
		int b = 0;
		int n = 0;
		boolean flag = true;
		do {
			System.out.println("ban chon lam gi !!");
			System.out.println("1. tao cac doi tuong xe va nhap thong tin" + "\n2. Xuat ban ke khai tien thue cac xe."
					+ "\nNhap so khac de thoat");
			b = sc.nextInt();
			switch (b) {
			case 1:
				System.out.println("Nhap so luong xe ban muon khai bao thue: ");
				n = sc.nextInt();
				a = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println("xe thu " + (i + 1));
					a[i] = new Vehicle();
					inputCar(a[i]);
				}
				break;
			case 2:
				System.out.printf( "idCar", "capacity", "cost", "nameCar", "describe",
						"tax");
				for (int i = 0; i < n; i++) {
					a[i].tax();
				}
				break;
			default:
				System.out.println("Thoat");
				flag=false;
				break;
			}
		} while (flag);
	}
}
