package bean;

public class vehicle {
	private String name;
	private String model;
	private int capacity;
	private double price;
	private double tax;

	public vehicle() {

	}

	public vehicle(String name, String model, int capacity, double price, double tax) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax(int capacity) {
		double result;
		if(this.capacity < 100) result=0.01;
		else if(this.capacity > 100 && this.capacity < 200) result=0.02;
		else result = 0.05;
		this.tax = this.price * result;
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Tên chủ xe: "  + name + " Loại xe: " + model + " Dung tích: " + capacity
				+ " Giá: " + price + " thuế phải nộp: " + this.tax + "";
	};
    
}