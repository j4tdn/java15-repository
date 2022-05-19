package vehicle;

public class Vehicle {
	private String nameDriver;
	private String type;
	private int cylin;
	private double price;
	
	public Vehicle() {
	}

	public Vehicle(String nameDriver, String type, int cylin, double price) {
		super();
		this.nameDriver = nameDriver;
		this.type = type;
		this.cylin = cylin;
		this.price = price;
	}

	public String getNameDriver() {
		return nameDriver;
	}

	public void setNameDriver(String nameDriver) {
		this.nameDriver = nameDriver;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCylin() {
		return cylin;
	}

	public void setCylin(int cylin) {
		this.cylin = cylin;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String col = String.format("%-25s%-25s%-25s%-25s", nameDriver, type,cylin, price );
		return col;
	}
	
	
}
