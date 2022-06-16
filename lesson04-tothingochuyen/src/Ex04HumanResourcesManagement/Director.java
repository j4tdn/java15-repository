package Ex04HumanResourcesManagement;

import java.time.LocalDate;

public class Director extends HumanResource{
	private float positionCoefficient;
	
	public Director() {
		
	}

	public Director(String name, LocalDate dateOfBirth, float coefficientsSalary, float positionCoefficient) {
		super(name, dateOfBirth, coefficientsSalary);
		this.positionCoefficient = positionCoefficient;
	}

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public double salary() {
		return (super.coefficientsSalary + positionCoefficient) * 3000000;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", positionCoefficient=" + positionCoefficient + "]";
	}
	
	
}
