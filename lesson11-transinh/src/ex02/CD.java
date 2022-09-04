package ex02;

public class CD {
	private int code;
	private String name;
	private String singer;
	private int number;
	private double price;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}

	public CD(int code, String name, String singer, int number, double price) {
		super();
		this.code = code;
		this.name = name;
		this.singer = singer;
		this.number = number;
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [code=" + code + ", name=" + name + ", singer=" + singer + ", number=" + number + ", price=" + price
				+ "]";
	}
	
	
	
}
