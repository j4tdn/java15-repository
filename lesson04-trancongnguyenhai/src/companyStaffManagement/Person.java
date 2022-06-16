package companyStaffManagement;

public class Person {
	private String fullName;
	private String birthday;
	private float coefficientsSalary;

	public Person() {
	}

	public Person(String fullName, String birthday, float coefficientsSalary) {
		super();
		this.fullName = fullName;
		this.birthday = birthday;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", birthday=" + birthday + ", coefficientsSalary=" + coefficientsSalary
				+ "]";
	}

	public float Salary() {
		return 0;
	}
}
