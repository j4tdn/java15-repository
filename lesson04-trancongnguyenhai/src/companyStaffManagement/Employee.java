package companyStaffManagement;

public class Employee extends Person{
	private String workUnit;
	public Employee() {
	}
	public Employee(String fullName, String birthday, float coefficientsSalary, String workUnit) {
		super(fullName, birthday, coefficientsSalary);
		this.workUnit = workUnit;
	}
	public String getWorkUnit() {
		return workUnit;
	}
	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}
	@Override
	public String toString() {
		return super.toString() + " Work at Unit: " + workUnit;
	}
	@Override
	public float Salary() {
		return this.getCoefficientsSalary() * 1250000;
	}
	
}
