package vehicle;

public class Tax {
	public static double calTax(Vehicle vehicle) {
		double tax = vehicle.getPrice();
		if (vehicle.getCapacity()<100) {
			tax*=0.01;
		} else if (vehicle.getCapacity()>=100 & vehicle.getCapacity()<=200) {
			tax*=0.03;
		} else {
			tax*=0.05;
		}
		return tax;
	}
}
