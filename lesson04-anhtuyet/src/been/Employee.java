package been;

public class Employee extends People {
	private String unitname;
	
	public Employee() {
	}

	public Employee(String name, String date, float cosalary, String unitname) {
		super(name, date, cosalary);
		this.unitname = unitname;
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	@Override
	public String toString() {
		return super.toString() + "unitname=" + unitname ;
	}
	public float payRoll() {
		return this.getCosalary() * 1250000;
	}
	
	
}
