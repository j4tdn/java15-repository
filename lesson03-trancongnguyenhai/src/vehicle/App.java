package vehicle;

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Diluc", "Mercedes G65", 5980, 600000);
		Vehicle v2 = new Vehicle("Kazuha", "BMW i9", 1499, 163000);
		Vehicle v3 = new Vehicle("Zhongli", "Dream", 100, 900);
		Vehicle v4 = new Vehicle("Shogun", "Cub 50", 50, 700);
		
		
		String header = String.format("%-25s%-25s%-25s%-25s%-25s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải trả");
//		System.out.println("Tên chủ xe \t" + "Loại xe \t" + ", \t" + "Trị giá \t" 
//							+ "Thuế phải trả");
		System.out.println(header);
		System.out.println("=================================================================================================================");
		System.out.println(VehicleUtils.importRecord(v1));
		System.out.println(VehicleUtils.importRecord(v2));
		System.out.println(VehicleUtils.importRecord(v3));
		System.out.println(VehicleUtils.importRecord(v4));	
	}
}
