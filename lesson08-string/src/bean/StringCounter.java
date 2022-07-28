package bean;

public class StringCounter {
	private int numberOfUcLetters;
	private int numberOfLcLetters;
	private int numberOfDigitLetters;
	
	public StringCounter() {
	}

	public StringCounter(int numberOfCapital, int numberOFLowercase, int numberNumber) {
		super();
		this.numberOfUcLetters = numberOfCapital;
		this.numberOfLcLetters = numberOFLowercase;
		this.numberOfDigitLetters = numberNumber;
	}

	public int getNumberOfCapital() {
		return numberOfUcLetters;
	}

	public void setNumberOfCapital(int numberOfCapital) {
		this.numberOfUcLetters = numberOfCapital;
	}

	public int getNumberOFLowercase() {
		return numberOfLcLetters;
	}

	public void setNumberOFLowercase(int numberOFLowercase) {
		this.numberOfLcLetters = numberOFLowercase;
	}

	public int getNumberNumber() {
		return numberOfDigitLetters;
	}

	public void setNumberNumber(int numberNumber) {
		this.numberOfDigitLetters = numberNumber;
	}

	@Override
	public String toString() {
		return "Ex06Count [numberOfCapital=" + numberOfUcLetters + ", numberOFLowercase=" + numberOfLcLetters
				+ ", numberNumber=" + numberOfDigitLetters + "]";
	}
	
	
}
