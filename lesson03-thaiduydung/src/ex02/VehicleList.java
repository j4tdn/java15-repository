package ex02;

public class VehicleList {
	private Vehicle[] vehicleList = new Vehicle[100];
	private int count;

	public void add() {
		if (count > 100) {
			System.out.println("full memory");
		}

		vehicleList[count] = new Vehicle();
		vehicleList[count].input();
		count++;
	}

	public void display() {
		System.out.println("Owner" + "\t\t\t" + "Type" + "\t\t" + "Capacity" + "\t" + "Price" + "\t\t" + "Tax");
		System.out.println("----------------------------------------------------------------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.println(vehicleList[i]);
		}
	}
}