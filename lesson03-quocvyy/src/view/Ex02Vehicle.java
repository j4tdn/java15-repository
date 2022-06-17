package view;
import view.Vehicle;
import java.util.Scanner;

public class Ex02Vehicle {



	public static void input(Vehicle a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin: Tên ");
		a.setName(sc.nextLine());
		System.out.println("Nhập thông tin: Car ");
		a.setCar(sc.nextLine());
		System.out.println("Nhập thông tin: Capacity ");
		a.setCapacity(sc.nextInt());
		System.out.println("Nhập thông tin: Price ");
		a.setPrice(sc.nextInt());
	}
	

}
