package ex04;

import java.time.LocalDate;

public class Leader extends Person{
	private int positionCoefficient;
	public Leader() {
	}
	
	public Leader(String name, LocalDate dayOfBirth, double coefficientsSalary, int positionCoefficient) {
		super(name, dayOfBirth, coefficientsSalary);
		this.positionCoefficient = positionCoefficient;
	}

	public int getPositionCoefficient() {
		return positionCoefficient;
	}
	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	@Override
	public String toString() {
		return "Leader: " + super.toString()+ "   Position Coefficient: " + positionCoefficient;
	}
	
}
