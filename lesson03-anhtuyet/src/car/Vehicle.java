package car;

public class Vehicle {
	private int idCar;
	private int capacity;
	private double cost;
	private String nameCar;
	private String describe;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int idCar, int capacity, double cost, String nameCar, String describe) {
		super();
		this.idCar = idCar;
		this.capacity = capacity;
		this.cost = cost;
		this.nameCar = nameCar;
		this.describe = describe;
	}

	public int getIdCar() {
		return idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(String string) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public double tax() {
		double tax;
		if(capacity<100) tax=cost*0.01;
		else if(capacity >= 100 && capacity <=200) tax = cost * 0.03;
		else tax = cost * 0.05;
		return tax;
	}

	@Override
	public String toString() {
		return "Vehicle [idCar=" + idCar + ", capacity=" + capacity + ", cost=" + cost + ", nameCar=" + nameCar
				+ ", describe=" + describe + "]";
	}
	void inTax() {
		System.out.printf("idCar", "capacity", "cost", "nameCar", "describe",
				"tax");
	}
}
