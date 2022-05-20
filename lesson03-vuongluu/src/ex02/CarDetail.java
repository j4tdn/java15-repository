package ex02;

public class CarDetail {
	private Car car;
	private int quantity;
	public CarDetail() {
	}
	public CarDetail(Car car, int quantity) {
		super();
		this.car = car;
		this.quantity = quantity;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return ""+ car ;
	}
	
	
	
}
