package immutable.exercises;

public class StringCounter {
	private int numberOfUcletters;
	private int numberOfLcletters;
	private int numberOfDigitletters;
	public int getNumberOfUcletters() {
		return numberOfUcletters;
	}
	public StringCounter(){
		
	}
	
	@Override
	public String toString() {
		return "StringCounter [numberOfUcletters=" + numberOfUcletters + ", numberOfLcletters=" + numberOfLcletters
				+ ", numberOfDigitletters=" + numberOfDigitletters + "]";
	}
	public StringCounter(int numberOfUcletters, int numberOfLcletters, int numberOfDigitletters) {
		super();
		this.numberOfUcletters = numberOfUcletters;
		this.numberOfLcletters = numberOfLcletters;
		this.numberOfDigitletters = numberOfDigitletters;
	}
	public void setNumberOfUcletters(int numberOfUcletters) {
		this.numberOfUcletters = numberOfUcletters;
	}
	public int getNumberOfLcletters() {
		return numberOfLcletters;
	}
	public void setNumberOfLcletters(int numberOfLcletters) {
		this.numberOfLcletters = numberOfLcletters;
	}
	public int getNumberOfDigitletters() {
		return numberOfDigitletters;
	}
	public void setNumberOfDigitletters(int numberOfDigitletters) {
		this.numberOfDigitletters = numberOfDigitletters;
	}
}
