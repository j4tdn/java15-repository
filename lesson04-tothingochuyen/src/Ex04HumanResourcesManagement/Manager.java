package Ex04HumanResourcesManagement;

import java.time.LocalDate;

public class Manager extends HumanResource{
	private int numberOfEmployees;
	
	public Manager() {
		
	}

	public Manager(String name, LocalDate dateOfBirth, float coefficientsSalary, int numberOfEmployees) {
		super(name, dateOfBirth, coefficientsSalary);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	
	
	@Override
	public double salary() {
		return super.coefficientsSalary * 2200000; 
	}

	@Override
	public String toString() {
		return "Manager: " + super.toString() + ", numberOfEmployees=" + numberOfEmployees +  "]";
	}

	
}
