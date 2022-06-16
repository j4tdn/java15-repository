package Ex04;

public class Employee extends Person{
	private String department;

	public Employee(String name, String birthDate, float salaryNumber, String department) {
		super(name, birthDate, salaryNumber);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	float salary() {
		return getSalaryNumber() * 1250000;
	}
	
}