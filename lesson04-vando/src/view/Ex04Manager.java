package view;

public class Ex04Manager extends Ex04People {
	 private int numberOfStaffs;
	 
	 public Ex04Manager() {

	 }

	public Ex04Manager(String name, int birthDate, float wageRatio, int numberOfStaffs) {
		super(name, birthDate, wageRatio);
		this.numberOfStaffs = numberOfStaffs;
	}

	public int getNumberOfStaffs() {
		return numberOfStaffs;
	}

	public void setNumberOfStaffs(int numberOfStaffs) {
		this.numberOfStaffs = numberOfStaffs;
	}

	@Override
	public String toString() {
		return "Ex04Manager [numberOfStaffs=" + numberOfStaffs + ", toString()=" + super.toString() + "]";
	}
	 
}
