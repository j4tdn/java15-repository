package company;

import java.time.LocalDate;

public class Director extends User{
	private float positionCoefficient;
	
	public Director() {
	}

	public Director(String name, LocalDate dateTime, float coefficientSalary, float positionCoefficient) {
		super(name, dateTime, coefficientSalary);
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "Director [positionCoefficient=" + positionCoefficient + ", toString()=" + super.toString() + "]";
	}

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
}
