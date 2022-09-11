package online.exercises;

import java.util.Objects;

public class Transaction implements Comparable<Transaction>{
	private Trader trader;
	private int year;
	private double value;
	
	public Transaction() {
	}

	public Transaction(Trader trader, int year, double value) {
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
	public boolean equals(Object obj) {
		 if(this == obj) {
			 return true;
			 
		 }
		 if(!(obj instanceof Transaction)) {
			 return false;
		 }
		Transaction that = (Transaction)obj;
		return this.getValue() == that.getValue();
	}
	@Override
	public int hashCode() {
		return Objects.hash(getValue());
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

	@Override
	public int compareTo(Transaction o) {
		return Double.compare(this.getValue(), o.getValue());
	}
	
	
}
