package view;

import java.util.Scanner;
import bean.vehicle;

public class Ex02 {
	public static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		vehicle a[] = null;
		
		int n = 0;
		do {
			System.out.println("\n1: Nhập thông tin và tạo n đối tượng xe");
			System.out.println("\n2: Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("\n3: Thoát chương trình");
			System.out.println("Mời bạn chọn:");
			n = Integer.parseInt(ip.nextLine());
			if (n == 1) {
				System.out.println("Nhập số lượng: ");
				int k = Integer.parseInt(ip.nextLine());
                a = new vehicle[k];
                for(int i = 0; i < k; i++) {
                	a[i] = new vehicle();
                	input(a[i]);
                }
				break;
			}
		} while (n != 3);
	}
	public static void input(vehicle a) {
		System.out.println("Tên chủ xe: ");
		a.setName(ip.nextLine());
		System.out.println("Loại xe: ");
		a.setModel(ip.nextLine());
		System.out.println("Dung tích: ");
		a.setCapacity(Integer.parseInt(ip.nextLine()));
		System.out.println("Trị giá: ");
		a.setPrice(ip.nextDouble());
	}
}
