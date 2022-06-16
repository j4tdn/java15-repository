package company;

import java.time.LocalDate;

public class Employee extends User {
	private String departmentName;

	public Employee() {
	}

	public Employee(String name, LocalDate dateTime, float coefficientSalary, String departmentName) {
		super(name, dateTime, coefficientSalary);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Employee [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}
	
}
