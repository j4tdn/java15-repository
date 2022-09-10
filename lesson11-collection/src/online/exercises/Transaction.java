package online.exercises;

public class Transaction {
	private Trader trader;
	private int year;
	private double price;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(Trader trader, int year, double price) {
		super();
		this.trader = trader;
		this.year = year;
		this.price = price;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    private void compare() {
		// TODO Auto-generated method stub
       
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", price=" + price + "]";
	}
	
}
