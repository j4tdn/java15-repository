package company;

import java.time.LocalDate;

public class User {
	private String name;
	private LocalDate dateTime;
	private float coefficientSalary;
	
	public User() {
	}

	public User(String name, LocalDate dateTime, float coefficientSalary) {
		super();
		this.name = name;
		this.dateTime = dateTime;
		this.coefficientSalary = coefficientSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDate dateTime) {
		this.dateTime = dateTime;
	}

	public float getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(float coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", dateTime=" + dateTime + ", coefficientSalary=" + coefficientSalary + "]";
	}
	
}
