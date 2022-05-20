package tax;

import java.util.Scanner;

public class App {

	static Scanner sc = new Scanner(System.in);

	static void getInfomation(Vehicle v) {
		System.out.print("Nhập chủ xe: ");
		v.setName(sc.nextLine());
		sc.nextLine();
		System.out.print("Nhập loại xe: ");
		v.setType(sc.nextLine());sc.nextLine();

		System.out.print("Nhập dung tích xe: ");
		v.setCapacity(sc.nextInt());
		sc.nextLine();

		System.out.print("Nhập trị giá xe: ");
		v.setPrice(sc.nextDouble());
		sc.nextLine();

	}

	public static void main(String[] args) {
		Vehicle[] v = null;
		int a, n = 0;
		boolean flag = true;
		do {
			System.out.println("Chức năng bạn cần thực hiện?");
			System.out.println("1.Nhập thông tin và tạo N đối tượng xe \n"
					+ "2.Xuất bảng kê khai tiền thuế trước bạ của các xe \n" + "3.Thoát chương trình");
			a = sc.nextInt();

			switch (a) {
			case 1:
				System.out.print("Nhập số lượng xe: ");
				n = sc.nextInt();
				v = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Xe thứ" + (i + 1));
					v[i] = new Vehicle();
					getInfomation(v[i]);
				}
				break;
			case 2:
				System.out.printf("%15s %30s %30s %30s %30s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
						"Thuế phải nộp");
				for (int i = 0; i < n; i++) {
					v[i].printTax();
				}
				break;
			default:
				System.out.println("Thoát");
				flag = false;
				break;

			}
		} while (flag);
	}
}
