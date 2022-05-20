package ex02;

public class Utils {
	public Utils() {
	}
	public static double export(Order order) {
		double tax = 0; 
		CarDetail[] cds = order.getCarDetails();
		for (CarDetail cd : cds) {
			Car c = cd.getCar();
			int quantity = cd.getQuantity();
			double tmp = c.getCost() * quantity;
			
			if (c.getCylinderCapacity() < 100) {
				tmp *= 0.01;
			}
			if (c.getCylinderCapacity() >= 100 && c.getCylinderCapacity() <= 200) {
				tmp *= 0.03;
			}
			if (c.getCylinderCapacity() > 200) {
				tmp *= 0.05;
			}
			tax = tmp;
           
		}
		return tax;
	}
	
}
