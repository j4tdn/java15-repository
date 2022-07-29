package bean;

public class StringCounter {
	public int numberOfUcLetters;
	public int numberOfLcLetters;
	public int numberOfDigitLetters;
	
	
	
	public StringCounter() {
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

	@Override
	public String toString() {
		return "StringCounter [numberOfUcLetters=" + numberOfUcLetters + ", numberOfLcLetters=" + numberOfLcLetters
				+ ", numberOfDigitLetters=" + numberOfDigitLetters + "]";
	}
	
	
	
	
}
