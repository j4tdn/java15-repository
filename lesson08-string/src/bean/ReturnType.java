package bean;

public class ReturnType {
	private int numberOfUcLetter;
	private int numberOfLcLetter;
	private int numberOfDigits;

	public ReturnType() {

	}

	public ReturnType(int numberOfUcLetter, int numberOfLcLetter, int numberOfDigits) {
		super();
		this.numberOfUcLetter = numberOfUcLetter;
		this.numberOfLcLetter = numberOfLcLetter;
		this.numberOfDigits = numberOfDigits;
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

	public int getNumberOfDigits() {
		return numberOfDigits;
	}

	public void setNumberOfDigits(int numberOfDigits) {
		this.numberOfDigits = numberOfDigits;
	}

	@Override
	public String toString() {
		return "ReturnType [numberOfUcLetter=" + numberOfUcLetter + ", numberOfLcLetter=" + numberOfLcLetter
				+ ", numberOfDigits=" + numberOfDigits + "]";
	}

}
