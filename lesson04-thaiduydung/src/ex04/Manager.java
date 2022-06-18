package ex04;

public class Manager extends People {
	private int numberOfEmployee;

	public Manager(String fullname, String dateOfBirth, int salaryFactor, int positionFactor, int numberOfEmployee) {
		super(fullname, dateOfBirth, salaryFactor, positionFactor);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public int salary() {
		return super.salary() * 2200000;
	}

	@Override
	public String toString() {
		return super.getFullname() + " (Manager) - " + super.getDateOfBirth() + " - " + numberOfEmployee
				+ "(employees): Salary = " + salary();
	}
}