
public class Plane extends Stransportation {
	private String fuel;

	public Plane(Producer producer, String fuel) {
		super("Plane", producer);
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public double speed() {
		
		return 450;
	}
	public void fly() {
		System.out.println("tòn tón tòn");
	}
	public void land() {
		System.out.println("ối dồi ôi");
	}
	

}
