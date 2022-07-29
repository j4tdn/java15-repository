package bean;

public class Count {
	private int countUpperCase;
	private int countLowerCase;
	private int countNumber;
	public Count() {
	
	}
	
	public Count(int countUpperCase, int countLowerCase, int countNumber) {
		this.countUpperCase = countUpperCase;
		this.countLowerCase = countLowerCase;
		this.countNumber = countNumber;
	}

	public int getCountUpperCase() {
		return countUpperCase;
	}
	public void setCountUpperCase(int countUpperCase) {
		this.countUpperCase = countUpperCase;
	}
	public int getCountLowerCase() {
		return countLowerCase;
	}
	public void setCountLowerCase(int countLowerCase) {
		this.countLowerCase = countLowerCase;
	}
	public int getCountNumber() {
		return countNumber;
	}
	public void setCountNumber(int countNumber) {
		this.countNumber = countNumber;
	}
	@Override
	public String toString() {
		return "Count [countUpperCase=" + countUpperCase + ", countLowerCase=" + countLowerCase + ", countNumber="
				+ countNumber + "]";
	}
	
	
}
