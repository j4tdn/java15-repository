package bean;

public class StringCounter {
	private int numberOfUcLetter;
	private int numberOfLcLetter;
	private int numberOfDiLetter;
	
	public StringCounter() {
	}

	public StringCounter(int numberOfUcLetter, int numberOfLcLetter, int numberOfDiLetter) {
		this.numberOfUcLetter = numberOfUcLetter;
		this.numberOfLcLetter = numberOfLcLetter;
		this.numberOfDiLetter = numberOfDiLetter;
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

	public int getNumberOfDiLetter() {
		return numberOfDiLetter;
	}

	public void setNumberOfDiLetter(int numberOfDiLetter) {
		this.numberOfDiLetter = numberOfDiLetter;
	}

	@Override
	public String toString() {
		return "StringCounter [numberOfUcLetter=" + numberOfUcLetter + ", numberOfLcLetter=" + numberOfLcLetter
				+ ", numberOfDiLetter=" + numberOfDiLetter + "]";
	}
	
}
