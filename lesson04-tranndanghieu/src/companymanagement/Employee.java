package companymanagement;

import java.sql.Date;

public class Employee extends Staff {
	private String nameofteam;
	public Employee() {
		
	}
	
	
	public Employee(String name, Date birthday, float coefficientsalary, String nameofteam) {
		super(name, birthday, coefficientsalary);
		this.nameofteam = nameofteam;
	}


	public String getNameofteam() {
		return nameofteam;
	}
	public void setNameofteam(String nameofteam) {
		this.nameofteam = nameofteam;
	}
	
	
	
	
	

}
