package bean;

import java.time.LocalDate;

public class Personnel {
	private String name;
	private String dateOfBirth;
	private float Coefficientssalary;
	
	public Personnel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Personnel(String name, String dateOfBirth, float coefficientssalary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		Coefficientssalary = coefficientssalary;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public float getCoefficientssalary() {
		return Coefficientssalary;
	}


	public void setCoefficientssalary(float coefficientssalary) {
		Coefficientssalary = coefficientssalary;
	}


	@Override
	public String toString() {
		return "Personnel [name=" + name + ", dateOfBirth=" + dateOfBirth + ", Coefficientssalary=" + Coefficientssalary
				+ "]";
	}


	public float payRoll() {
		return 0;
	}
}
	
