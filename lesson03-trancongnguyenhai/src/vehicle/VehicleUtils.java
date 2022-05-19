package vehicle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class VehicleUtils {
	public static Scanner ip = new Scanner(System.in);

	public static double regisTax(Vehicle v) {
		if (v.getCylin() < 100) {
			return v.getPrice() - v.getPrice() * 0.01;
		} else if (v.getCylin() >= 100 && v.getCylin() <= 200) {
			return v.getPrice() - v.getPrice() * 0.03;
		}
		return v.getPrice() - v.getPrice() * 0.05;
	}

	public static void showRecord(Vehicle[] record) {
		for (int i = 0; i < record.length; i++) {
			String col = String.format("%-25s%-25s%-25s%-25s%-25s", record[i].getNameDriver(), record[i].getType(),
					record[i].getCylin(), record[i].getPrice(), regisTax(record[i]));
			System.out.println(col);
		}
	}

	public static void writeRecord(Vehicle v) {
		System.out.print("Nhập tên tài xế: ");
		String nameDriver = ip.nextLine();
		v.setNameDriver(nameDriver);
		System.out.print("Nhập loại xe: ");
		String type = ip.nextLine();
		v.setType(type);
		System.out.print("Nhập dung tích: ");
		int cylin = ip.nextInt();
		v.setCylin(cylin);
		System.out.print("Nhập giá: ");
		double price = ip.nextDouble();
		v.setPrice(price);
	}
}
