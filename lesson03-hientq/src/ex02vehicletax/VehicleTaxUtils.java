package ex02vehicletax;

import bean.Vehicle;
import bean.VehicleTaxInfo;

public class VehicleTaxUtils {
	public static void export(VehicleTaxInfo vt) {
		System.out.printf("Owner\t\tModel\t\tEngine Displacement\t\tPrice\t\tTax\n");
		System.out.println("=======================================================================================");
		for(Vehicle v : vt.getVehicles()) {
			double tax = 0f;
			if(v.getEngineDisplacement() > 200) {
				tax = v.getPrice() * 0.05;
				System.out.println("Vo day ne 200! " + tax);
			} else if(v.getEngineDisplacement() >= 100 && v.getEngineDisplacement() <= 200) {
				tax = v.getPrice() * 0.03;
			} else {
				tax = v.getPrice() * 0.01;
			}
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\n",vt.getOwner().getName(),v.getName(),v.getEngineDisplacement(),v.getPrice(),tax);
		}
	}
}
