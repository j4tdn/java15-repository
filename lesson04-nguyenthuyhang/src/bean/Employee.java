package bean;

import java.time.LocalDate;

public class Employee extends Personnel{
	private String nameOfUnit;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public Employee(String name, String dateOfBirth, float coefficientssalary, String nameOfUnit) {
		super(name, dateOfBirth, coefficientssalary);
		this.nameOfUnit = nameOfUnit;
	}



	public String getNameOfUnit() {
		return nameOfUnit;
	}

	public void setNameOfUnit(String nameOfUnit) {
		this.nameOfUnit = nameOfUnit;
	}

	@Override
	public String toString() {
		return super.toString() + "nameOfUnit= " + nameOfUnit;
	}
	public float salary() {
		return this.getCoefficientssalary() * 1250000;
	}
}
