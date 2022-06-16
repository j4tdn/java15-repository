package Ex04HumanResourcesManagement;

import java.time.LocalDate;

public class Staff extends HumanResource{
	private String department;

	public Staff(String name, LocalDate dateOfBirth, float coefficientsSalary, String department) {
		super(name, dateOfBirth, coefficientsSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public double salary() {
		return super.coefficientsSalary * 1250000; 
	}
	
	@Override
	public String toString() {
		return "Staff: " + super.toString() + ", department=" + department + "]";
	}
	
	
}
