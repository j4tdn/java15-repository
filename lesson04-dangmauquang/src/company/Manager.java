package company;

import java.time.LocalDate;

public class Manager extends User {
	private int numberOfEmployees;

	public Manager() {
	}

	public Manager(String name, LocalDate dateTime, float coefficientSalary, int numberOfEmployees) {
		super(name, dateTime, coefficientSalary);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", toString()=" + super.toString() + "]";
	}
	
}
