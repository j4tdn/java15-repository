package Ex04HumanResourcesManagement;

import java.time.LocalDate;

public abstract class HumanResource {
	protected String name;
	protected LocalDate dateOfBirth;
	protected float coefficientsSalary;
	
	public HumanResource() {
		
	}

	public HumanResource(String name, LocalDate dateOfBirth, float coefficientsSalary) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	abstract double salary();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary="
				+ coefficientsSalary + ", Salary: " + salary()  + "]";
	}
	
	
}
