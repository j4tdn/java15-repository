package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle {

	private String name;
	private String type;
	private int cilin;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String name, String type, int cilin, double price) {
		this.name = name;
		this.type = type;
		this.cilin = cilin;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCilin() {
		return cilin;
	}

	public void setCilin(int cilin) {
		this.cilin = cilin;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String col = String.format("%-20s%-20s%-20s%-20s", name, type, cilin, price);
		return col;
	}

	public static double regis(Vehicle v) {
		if (v.getCilin() < 100) {
			return v.getPrice() - v.getPrice() * 0.01;
		} else if (v.getCilin() >= 100 && v.getCilin() <= 200) {
			return v.getPrice() - v.getPrice() * 0.03;
		}
		return v.getPrice() - v.getPrice() * 0.05;
	}

	public static void show(Vehicle[] record) {
		for (int i = 0; i < record.length; i++) {
			String col = String.format("%-20s%-20s%-20s%-20s%-20s", record[i].getName(), record[i].getType(), record[i].getCilin(), record[i].getPrice(), regis(record[i]));
			System.out.println(col);
		}
	}

	public static void input(Vehicle v) {
		System.out.print("Nhập tên chủ xe: ");
		String nameDriver = ip.nextLine();
		v.setName(nameDriver);
		System.out.print("Nhập loại xe: ");
		String type = ip.nextLine();
		v.setType(type);
		System.out.print("Nhập dung tích: ");
		int cilin = ip.nextInt();
		v.setCilin(cilin);
		System.out.print("Nhập giá: ");
		double price = ip.nextDouble();
		v.setPrice(price);
	}

	public static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyễn Văn Toàn", "BMW", 5000, 500000);
		Vehicle v2 = new Vehicle("Quế Ngọc Hải", "Toyota", 2000, 200000);
		Vehicle v3 = new Vehicle("Nguyễn Tiến Linh", "Mada", 100, 1000);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		while (true) {
			System.out.println("===================================================");
			System.out.println("1. Nhập thông tin xe");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("3. Thoát chương trình");
			System.out.println("===================================================");
			Scanner ip = new Scanner(System.in);
			System.out.print("Nhập lựa chọn: ");
			int k = ip.nextInt();
			switch (k) {
			case 1: {
				Vehicle v = new Vehicle();
				input(v);
				vehicles.add(v);
				break;
			}
			case 2: {
				System.out.println();
				String header = String.format("%-20s%-20s%-20s%-20s%-20s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải trả");
				System.out.println(header);
				System.out.println(
						"==================================================================================================");
				Vehicle[] arr = new Vehicle[vehicles.size()];
				arr = vehicles.toArray(arr);
				show(arr);
				System.out.println();
				break;
			}
			case 3:
				System.out.println("EXIT");
				System.exit(-1);
			}
		}
	}

}