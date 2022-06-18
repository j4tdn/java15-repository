package staffmanagementment;

import java.time.LocalDate;

public class Staff extends Person {
	private String Department;

	public Staff() {
		// TODO Auto-generated constructor stub
	}
	

	public Staff(String name, LocalDate dateOfBirth, float coefficientsSalary, String department) {
		super(name, dateOfBirth, coefficientsSalary);
		Department = department;
	}


	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}


	@Override
	public String toString() {
		return "Staff [Department=" + Department + ", toString()=" + super.toString() + "]";
	}
	@Override
	public float calculationOfWages() {
		return getCoefficientsSalary()*1250000;
	}
}
