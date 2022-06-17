package bean;

import java.time.LocalDate;

public class Director extends People{
	private int coefficientSalary;	

	public Director() {
	}

	public Director(String name, LocalDate birthday, int coefficoen, int coefficientSalary) {
		super(name, birthday, coefficoen);
		this.coefficientSalary = coefficientSalary;
	}

	public int getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(int coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	@Override
	public String toString() {
		return "Director "+super.toString()+" coefficientSalary=" + coefficientSalary + "]";
	}
	
	@Override
	public float salary() {
		return (this.getCoefficoen() + this.getCoefficientSalary()) * 300000;
	}
	
	
}
