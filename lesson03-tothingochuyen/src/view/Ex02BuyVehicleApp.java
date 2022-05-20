package view;

import java.util.Scanner;

import bean.Vehicle;

public class Ex02BuyVehicleApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, N = 0;
		Vehicle[] vehicle = null;
		
		do {
			System.out.println("1. Enter information and create N vehicle objects.");
			System.out.println("2. Export registration tax declaration of vehicles.");
			System.out.println("3. Exit.");
			System.out.print("Please enter number from 1 to 3: ");
			number = Integer.parseInt(input.nextLine());
			switch (number) {
			case 1: {
				System.out.print("Enter the number of vehicles: ");
				N = Integer.parseInt(input.nextLine());
				vehicle = new Vehicle[N];
				for(int i = 0; i < N; i++) {
					vehicle[i] = new Vehicle();
					System.out.println("Enter vihcle information " + (i+1) + ": ");
					System.out.print("Name: ");
					vehicle[i].setName(input.nextLine());
					System.out.print("Model: ");
					vehicle[i].setModel(input.nextLine());
					System.out.print("Capacity: ");
					vehicle[i].setCapacity(Integer.parseInt(input.nextLine()));
					System.out.print("Price: ");
					vehicle[i].setPrice(Double.parseDouble(input.nextLine()));
				}
				break;
			}
			case 2: {
				System.out.println("Name \t" + "Model \t" +"Capacity \t" + "Price \t" + "Tax");
				System.out.println("==============================================");
				for(int i = 0; i < N; i++) {
					System.out.println(vehicle[i].toString());
				}
				break;
			}
			case 3: {
				System.out.println("Exit!!!");
				System.exit(0);
			}
			default:
				System.out.println("Invalid number!!!");
				return;
			}
		} while(number != 3);
		
	}

}
