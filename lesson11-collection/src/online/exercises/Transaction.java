package online.exercises;



public class Transaction {
	private Trader traders;
	private int year;
	double value;
	public Transaction(Trader traders, int year, int value) {
		this.traders = traders;
		this.year = year;
		this.value = value;
	}
	public Trader getTraders() {
		return traders;
	}
	public void setTraders(Trader traders) {
		this.traders = traders;
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
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [traders=" + traders + ", year=" + year + ", value=" + value + "]\n";
	}
	
	
	
	
	
}
