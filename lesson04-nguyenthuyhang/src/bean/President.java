package bean;

import java.time.LocalDate;

public class President extends Personnel{
	private float positionCoefficient;
	
	public President() {
		// TODO Auto-generated constructor stub
	}

	

	public President(String name, String dateOfBirth, float coefficientssalary, float positionCoefficient) {
		super(name, dateOfBirth, coefficientssalary);
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
		return super.toString() + "positionCoefficient=" + positionCoefficient;
	}
	public float salary() {
		return(this.getCoefficientssalary()+this.getPositionCoefficient()) * 300000;
	}
	

	
}
