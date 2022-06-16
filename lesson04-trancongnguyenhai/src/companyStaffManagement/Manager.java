package companyStaffManagement;

public class Manager extends Person{
	private int employeeManage;
	public Manager() {
	}
	public Manager(String fullName, String birthday, float coefficientsSalary, int employeeManage) {
		super(fullName, birthday, coefficientsSalary);
		this.employeeManage = employeeManage;
	}
	public int getEmployeeManage() {
		return employeeManage;
	}
	public void setEmployeeManage(int employeeManage) {
		this.employeeManage = employeeManage;
	}
	@Override
	public String toString() {
		return super.toString() + " Number of employee managed: " + employeeManage;
	}
	
	@Override
	public float Salary() {
		return this.getCoefficientsSalary() * 2200000;
	}
	
}
