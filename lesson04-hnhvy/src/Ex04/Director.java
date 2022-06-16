package Ex04;

public class Director extends Person{
	private float positionNumber;

	public Director(String name, String birthDate, float salaryNumber, float positionNumber) {
		super(name, birthDate, salaryNumber);
		this.positionNumber = positionNumber;
	}

	public float getPositionNumber() {
		return positionNumber;
	}

	public void setPositionNumber(float positionNumber) {
		this.positionNumber = positionNumber;
	}
	
	@Override
	float salary() {
		return (positionNumber + getSalaryNumber())*3000000;
		
	}

}