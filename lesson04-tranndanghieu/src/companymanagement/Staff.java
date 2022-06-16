package companymanagement;

import java.sql.Date;

public class Staff {
	private String name;
	private Date birthday;
	private float coefficientsalary;
	
	
	public Staff() {
	}

	public Staff(String name, Date birthday, float coefficientsalary) {
		
		this.name = name;
		this.birthday = birthday;
		this.coefficientsalary = coefficientsalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public float getCoefficientsalary() {
		return coefficientsalary;
	}

	public void setCoefficientsalary(float coefficientsalary) {
		this.coefficientsalary = coefficientsalary;
	}

	@Override
	public String toString() {
		return name+"   " +birthday+"   "+ coefficientsalary;
	}
	
	
	
	
	
	

}
