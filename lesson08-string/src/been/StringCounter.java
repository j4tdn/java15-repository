package been;

public class StringCounter {
	private int numberOfUcLetter;
	private int numberOfLcLetter;
	private int numberOfDigit;
	
	public StringCounter() {

	}
	

	public StringCounter(int numberOfUcLetter, int numberOfLcLetter, int numberOfDigit) {
		super();
		this.numberOfUcLetter = numberOfUcLetter;
		this.numberOfLcLetter = numberOfLcLetter;
		this.numberOfDigit = numberOfDigit;
	}


	public int getNumberOfUcLetter() {
		return numberOfUcLetter;
	}

	public void setNumberOfUcLetter(int numberOfUcLetter) {
		this.numberOfUcLetter = numberOfUcLetter;
	}

	public int getNumberOfLcLetter() {
		return numberOfLcLetter;
	}

	public void setNumberOfLcLetter(int numberOfLcLetter) {
		this.numberOfLcLetter = numberOfLcLetter;
	}

	public int getNumberOfDigit() {
		return numberOfDigit;
	}

	public void setNumberOfDigit(int numberOfDigit) {
		this.numberOfDigit = numberOfDigit;
	}


	@Override
	public String toString() {
		return "StringCounter [numberOfUcLetter=" + numberOfUcLetter + ", numberOfLcLetter=" + numberOfLcLetter
				+ ", numberOfDigit=" + numberOfDigit + "]";
	}
	
	
}
