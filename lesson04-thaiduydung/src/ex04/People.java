package ex04;

public class People {
	private String fullname;
	private String dateOfBirth;
	private int salaryFactor;
	private int positionFactor;

	public People(String fullname, String dateOfBirth, int salaryFactor, int positionFactor) {
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.salaryFactor = salaryFactor;
		this.positionFactor = positionFactor;
	}

	public int getPositionFactor() {
		return positionFactor;
	}

	public void setPositionFactor(int positionFactor) {
		this.positionFactor = positionFactor;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSalaryFactor() {
		return salaryFactor;
	}

	public void setSalaryFactor(int salaryFactor) {
		this.salaryFactor = salaryFactor;
	}

	public int salary() {
		return salaryFactor + positionFactor;
	}

	@Override
	public String toString() {
		return "" + fullname + " - " + dateOfBirth + " - " + salaryFactor;
	}
}