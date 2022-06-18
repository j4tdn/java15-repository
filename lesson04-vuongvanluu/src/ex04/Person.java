package ex04;

import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dayOfBirth;
	private double coefficientSalary;
	public Person() {
	}
	public Person(String name, LocalDate dayOfBirth, double coefficientsSalary) {
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.coefficientSalary = coefficientsSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public double getCoefficientsSalary() {
		return coefficientSalary;
	}
	public void setCoefficientsSalary(double salary) {
		this.coefficientSalary = salary;
	}
	@Override
	public String toString() {
		return name + "   Day of Birth: "+dayOfBirth+ "   Coefficient Salary: "+coefficientSalary;
	}
	
}
