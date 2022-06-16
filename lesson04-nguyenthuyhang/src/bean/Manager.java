package bean;

import java.time.LocalDate;

public class Manager extends Personnel{
	private int numberOfStaff;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	
	public Manager(String name, String dateOfBirth, float coefficientssalary, int numberOfStaff) {
		super(name, dateOfBirth, coefficientssalary);
		this.numberOfStaff = numberOfStaff;
	}


	public int getNumberOfStaff() {
		return numberOfStaff;
	}

	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}

	@Override
	public String toString() {
		return super.toString() + "numberOfStaff =" + numberOfStaff;
	}
	public float salary() {
		return this.getCoefficientssalary()*2200000;
	}
}
