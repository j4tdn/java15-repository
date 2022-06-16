package companymanagement;

import java.sql.Date;

public class Manager extends Staff{
	private float coefficientposition;
	public Manager() {
	}
	
	
	
	public Manager(String name, Date birthday, float coefficientsalary, float coefficientposition) {
		super(name, birthday, coefficientsalary);
		this.coefficientposition = coefficientposition;
	}



	public float getCoefficientposition() {
		return coefficientposition;
	}
	public void setCoefficientposition(float coefficientposition) {
		this.coefficientposition = coefficientposition;
	}



	@Override
	public String toString() {
		return "Manager [coefficientposition=" + coefficientposition + ", Staff=" + super.toString() + "]";
	}
	
	
	
	
	

}
