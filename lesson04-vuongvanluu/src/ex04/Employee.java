package ex04;

import java.time.LocalDate;

public class Employee extends Person{
	private String group;
	public Employee() {
	}
	
	public Employee(String name, LocalDate dayOfBirth, double coefficientsSalary, String group) {
		super(name, dayOfBirth, coefficientsSalary);
		this.group = group;
	}

	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Employee: " + super.toString()+ "   Group: " + group;
	}
	
}
