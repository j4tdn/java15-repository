package ex04;

public class Director extends People {
	public Director(String fullname, String dateOfBirth, int salaryFactor, int positionFactor) {
		super(fullname, dateOfBirth, salaryFactor, positionFactor);
	}

	@Override
	public int salary() {
		return super.salary() * 3000000;
	}

	@Override
	public String toString() {
		return super.getFullname() + " (Director) - " + getDateOfBirth() + " - " + getSalaryFactor() + " - "
				+ getPositionFactor() + ": Salary = " + salary();
	}
}