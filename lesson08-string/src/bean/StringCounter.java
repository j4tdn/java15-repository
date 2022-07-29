package bean;

public class StringCounter {
	private int numberOfUcLetters;
	private int numberOfLcLetters;
	private int numberOfDigitLetters;
	
	
	public StringCounter() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StringCounter [numberOfUcLetters=" + numberOfUcLetters + ", numberOfLcLetters=" + numberOfLcLetters
				+ ", numberOfDigitLetters=" + numberOfDigitLetters + "]";
	}
	public StringCounter(int numberOfUcLetters, int numberOfLcLetters, int numberOfDigitLetters) {
		super();
		this.numberOfUcLetters = numberOfUcLetters;
		this.numberOfLcLetters = numberOfLcLetters;
		this.numberOfDigitLetters = numberOfDigitLetters;
	}
	public int getNumberOfUcLetters() {
		return numberOfUcLetters;
	}
	public void setNumberOfUcLetters(int numberOfUcLetters) {
		this.numberOfUcLetters = numberOfUcLetters;
	}
	public int getNumberOfLcLetters() {
		return numberOfLcLetters;
	}
	public void setNumberOfLcLetters(int numberOfLcLetters) {
		this.numberOfLcLetters = numberOfLcLetters;
	}
	public int getNumberOfDigitLetters() {
		return numberOfDigitLetters;
	}
	public void setNumberOfDigitLetters(int numberOfDigitLetters) {
		this.numberOfDigitLetters = numberOfDigitLetters;
	}

	//constructor
	//getter
	//setter
}
