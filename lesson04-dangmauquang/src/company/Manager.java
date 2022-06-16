package company;

import java.sql.Date;

public class Manager extends User {
	private int numberOfEmployees;

	public Manager() {
	}

	public Manager(String name, Date dateTime, float coefficientSalary, int numberOfEmployees) {
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
