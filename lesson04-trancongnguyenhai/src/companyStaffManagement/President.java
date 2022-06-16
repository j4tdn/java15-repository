package companyStaffManagement;

public class President extends Person {
	private float positionCoefficient;

	public President() {
	}

	public President(String fullName, String birthday, float coefficientsSalary, float positionCoefficient) {
		super(fullName, birthday, coefficientsSalary);
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
		return super.toString() + " Position Coefficient = " + positionCoefficient;
	}
	
	@Override
	public float Salary() {
		return (this.getCoefficientsSalary() + this.getPositionCoefficient()) * 3000000;
	}

}
