package vehicle;

public class VehicleUtils {
	public static double regisTax(Vehicle v) {
		if (v.getCylin() < 100) {
			return v.getPrice() - v.getPrice() * 0.01;
		} else if (v.getCylin() >= 100 && v.getCylin() <= 200) {
			return v.getPrice() - v.getPrice() * 0.03;
		}
		return v.getPrice() - v.getPrice() * 0.05;
	}
	
	public static String importRecord(Vehicle v) {
			String col = String.format("%-25s%-25s%-25s%-25s%-25s", v.getNameDriver(), v.getType(),v.getCylin(), v.getPrice(), regisTax(v));
			return col;
	}
}
