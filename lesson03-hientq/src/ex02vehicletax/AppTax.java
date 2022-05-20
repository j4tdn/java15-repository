package ex02vehicletax;

import java.util.Scanner;

import bean.Owner;
import bean.Vehicle;
import bean.VehicleTaxInfo;

public class AppTax {
	private final static Scanner sc = new Scanner(System.in);
	private static VehicleTaxInfo inputTaxInfo(int numberOfVehicle) {
		Vehicle[] vehicles = new Vehicle[numberOfVehicle];
		Owner owner = new Owner();
		System.out.print("Enter owner name: ");
		owner.setName(sc.nextLine());
		
		for(int i = 0; i < vehicles.length; i++) {
			Vehicle vehicle = new Vehicle();
			System.out.print("Enter model name: ");
			vehicle.setName(sc.nextLine());
			System.out.print("Enter price: ");
			vehicle.setPrice(Double.parseDouble(sc.nextLine()));
			System.out.print("Enter engine displacement: ");
			vehicle.setEngineDisplacement(Integer.parseInt(sc.nextLine()));
			vehicles[i] = vehicle;
		}
		
		return new VehicleTaxInfo(owner, vehicles);
	}
	private static void menu() {
		System.out.println("1. Enter new tax info.");
		System.out.println("2. Export tax info.");
		System.out.println("3. Exit");
	}
	public static void main(String[] args) {
		int choice = 0;
		VehicleTaxInfo temp = null;
		do {
			menu();
			System.out.print("Your choice? ");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				System.out.print("Enter number of vehicle: ");
				int numberOfVehicle = Integer.parseInt(sc.nextLine());
				temp = inputTaxInfo(numberOfVehicle);
			} else if(choice == 2) {
				if(temp == null) {
					System.out.println("No data to export!");
					continue;
				} else {
					VehicleTaxUtils.export(temp);
				}
			} else {
				break;
			}
		}while(true);
		System.out.println("-----Goodbye!------");
	}
}
