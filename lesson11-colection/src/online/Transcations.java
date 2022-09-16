package online;

public class Transcations {
	private double value;
	private int year;
	private String trader;
	
	public Transcations() {
		
	}

	public Transcations(double value, int year, String trader) {
		super();
		this.value = value;
		this.year = year;
		this.trader = trader;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrader() {
		return trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}

	@Override
	public String toString() {
		return "Transcations [value=" + value + ", year=" + year + ", trader=" + trader + "]";
	}
	
}
