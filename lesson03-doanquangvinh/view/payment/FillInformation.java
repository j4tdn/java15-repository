package payment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FillInformation {
	private static Scanner ip = new Scanner(System.in);
    
	public static void importVehicle(Vehicle vehicle) {
        ip.nextLine();
		System.out.print("Vui long nhap day du ho va ten :");
		vehicle.setVehicleOwner(ip.nextLine());
		System.out.print("Vui long nhap mau ma cua phuong tien :");
		vehicle.setModel(ip.nextLine());
		System.out.print("Vui long nhap phan khoi cua phuong tien :");
		vehicle.setCubicCapacity(ip.nextInt());
		System.out.print("Vui long nhap gia tri cua phuong tien : ");
		vehicle.setValue(ip.nextDouble());
	}
		
	public static void export(Vehicle vehicle) {
		DecimalFormat df = new DecimalFormat("#,###");
		df.format(vehicle.getValue());
		df.format(OrderUtils.caculatingTax(vehicle));
		System.out.println(vehicle.getVehicleOwner() + "\t" + vehicle.getModel() + " \t " + vehicle.getCubicCapacity()
				+ "\t" + vehicle.getValue() + "\t" + OrderUtils.caculatingTax(vehicle));
	}
}
