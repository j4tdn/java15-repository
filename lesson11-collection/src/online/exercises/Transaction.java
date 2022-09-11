package online.exercises;

public class Transaction {
	private Trader trader;
	private int year;
	private double value;
	
	public Transaction() {
	}

	public Transaction(Trader trader, int year, double value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
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

	@Override
	public String toString() {
		return "\nTransaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
//	public boolean equals(Object o) {
//		if(this == o) {
//			return true;
//		}
//		if(!(o instanceof Transaction)) {
//			return false;
//		}
//		Transaction that = (Transaction) o;
//		return getTrader().equals(that.getTrader());
//	}
}
