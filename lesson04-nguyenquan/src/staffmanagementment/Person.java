package staffmanagementment;

import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dateOfBirth;
	private float coefficientsSalary;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, LocalDate dateOfBirth, float coefficientsSalary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ "]";
	}
	public float calculationOfWages() {
		float salary;
		salary = coefficientsSalary *100;
		return salary;
		
	}
	
	
	

}
