package Ex04;

public class Manager extends Person {
	private float employeeNumber;

	public Manager(String name, String birthDate, float salaryNumber, float employeeNumber) {
		super(name, birthDate, salaryNumber);
		this.employeeNumber = employeeNumber;
	}

	public float getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(float employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	@Override
	float salary() {
		return getSalaryNumber() * 2200000;
	}
	
}