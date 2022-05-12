
public class Car extends Stransportation {
	

	private String fuel;

	public Car(Producer producer, String fuel) {
		super("Car", producer);
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
		
		return 60;
	}
	
	

}
