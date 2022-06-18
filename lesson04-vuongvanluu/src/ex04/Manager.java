package ex04;

import java.time.LocalDate;

public class Manager extends Person{
	private int numberOfPloyees;
	public Manager() {
	}
	
	public Manager(String name, LocalDate dayOfBirth, double coefficientsSalary, int numberOfPloyees) {
		super(name, dayOfBirth, coefficientsSalary);
		this.numberOfPloyees = numberOfPloyees;
	}

	public int getNumberOfPloyees() {
		return numberOfPloyees;
	}
	public void setNumberOfPloyees(int numberOfPloyees) {
		this.numberOfPloyees = numberOfPloyees;
	}
	@Override
	public String toString() {
		return "Manager: " +super.toString()+ "   number Of Ployees: " + numberOfPloyees;
	}
	
}
