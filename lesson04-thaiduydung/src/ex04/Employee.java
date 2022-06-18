package ex04;

public class Employee extends People {
	private String department;

	public Employee(String fullname, String dateOfBirth, int salaryFactor, int positionFactor, String department) {
		super(fullname, dateOfBirth, salaryFactor, positionFactor);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int salary() {
		return super.salary() * 1250000;
	}

	@Override
	public String toString() {
		return super.getFullname() + " - " + getDateOfBirth() + " - " + getSalaryFactor() + " - Nhân viên ("
				+ department + "): Salary = " + salary();
	}
}