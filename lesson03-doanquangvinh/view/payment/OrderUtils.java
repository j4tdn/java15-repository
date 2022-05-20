package payment;

public class OrderUtils {
   
	public static double caculatingTax(Vehicle vehicle) {
		double totalOfTax = 0;
		double idCost = vehicle.getValue();
		if (vehicle.getCubicCapacity()<100) {
			idCost*=0.01;
		} else if (vehicle.getCubicCapacity()>=100 & vehicle.getCubicCapacity()<=200) {
			idCost*=0.03;
		} else {
			idCost*=0.05;
		}
		totalOfTax+= idCost;
		return totalOfTax;
	}
}
