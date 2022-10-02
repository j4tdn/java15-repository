package online.exercises;

public class Transaction {
	private Trader trader;
	private int year;
	private double value;

	public Transaction() {
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

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Transaction(Trader trader, int year, double value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Transaction)) {
			return false;
		}
		Transaction that = (Transaction) o;
		return getTrader().equals(that.getTrader());
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}
