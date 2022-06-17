package bean;

import java.time.LocalDate;

public class Employee extends People {
	private String division;

	public Employee() {
	}

	public Employee(String name, LocalDate birthday, int coefficoen, String division) {
		super(name, birthday, coefficoen);
		this.division = division;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "Employee " + super.toString() + " division=" + division + "]";
	}

	@Override
	public float salary() {
		return this.getCoefficoen() * 125000;
	}
}
