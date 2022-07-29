package bean;

public class StringCounter {
	private int numberOfUppercaseLetter;
	private int numberOfLowercaseLetter;
	private int numberOfDigitLetter;
	
	//constructor
	public StringCounter() {
		
	}

	public StringCounter(int numberOfUppercaseLetter, int numberOfLowercaseLetter, int numberOfDigitLetter) {
		this.numberOfUppercaseLetter = numberOfUppercaseLetter;
		this.numberOfLowercaseLetter = numberOfLowercaseLetter;
		this.numberOfDigitLetter = numberOfDigitLetter;
	}

	//getter,setter
	public int getNumberOfUppercaseLetter() {
		return numberOfUppercaseLetter;
	}

	public void setNumberOfUppercaseLetter(int numberOfUppercaseLetter) {
		this.numberOfUppercaseLetter = numberOfUppercaseLetter;
	}

	public int getNumberOfLowercaseLetter() {
		return numberOfLowercaseLetter;
	}

	public void setNumberOfLowercaseLetter(int numberOfLowercaseLetter) {
		this.numberOfLowercaseLetter = numberOfLowercaseLetter;
	}

	public int getNumberOfDigitLetter() {
		return numberOfDigitLetter;
	}

	public void setNumberOfDigitLetter(int numberOfDigitLetter) {
		this.numberOfDigitLetter = numberOfDigitLetter;
	}

	//toString
	@Override
	public String toString() {
		return "StringCounter \n[numberOfUppercaseLetter=" + numberOfUppercaseLetter + "\n numberOfLowercaseLetter="
				+ numberOfLowercaseLetter + "\n numberOfDigitLetter=" + numberOfDigitLetter + "]";
	}
}
