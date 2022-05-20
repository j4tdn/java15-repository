package TaxVehicle;

public class Vehicle {
	private String nameOwner;
	private String nameCar;
	private int capacity;
	private int price;
	
	public Vehicle() {
	}
	
	public Vehicle(String nameOwner, String nameCar, int capacity, int price) {
		super();
		this.nameOwner = nameOwner;
		this.nameCar = nameCar;
		this.capacity = capacity;
		this.price = price;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [nameOwner=" + nameOwner + ", nameCar=" + nameCar + ", capacity=" + capacity + ", price="
				+ price + "]";
	}
	
	
	
	
}
