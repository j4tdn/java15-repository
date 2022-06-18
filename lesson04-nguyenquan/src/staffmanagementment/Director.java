package staffmanagementment;

import java.time.LocalDate;

public class Director extends Person {
	private float positionCoefficient;

	public Director() {
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return "Director [positionCoefficient=" + positionCoefficient + ", toString()=" + super.toString() + "]";
	}
	@Override
	public float calculationOfWages() {
		return getCoefficientsSalary()*3000000 * positionCoefficient;
		
	} 
		
	

}
