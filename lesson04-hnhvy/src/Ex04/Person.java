package Ex04;

public abstract class Person {
	private String name;
	private String birthDate;
	private float salaryNumber;
	
	public Person(String name, String birthDate, float salaryNumber) {
		this.name = name;
		this.birthDate = birthDate;
		this.salaryNumber = salaryNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public float getSalaryNumber() {
		return salaryNumber;
	}

	public void setSalaryNumber(float salaryNumber) {
		this.salaryNumber = salaryNumber;
	}
	
	abstract float salary();

	@Override
	public String toString() {
		return "" + salary();
	}
	
	
	
	
}