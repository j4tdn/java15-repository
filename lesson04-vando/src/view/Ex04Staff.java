package view;

public class Ex04Staff extends Ex04People{
	private String departmentName;
	
	public Ex04Staff() {
		
	}

	public Ex04Staff(String name, int birthDate, float wageRatio, String departmentName) {
		super(name, birthDate, wageRatio);
		this.departmentName = departmentName;
	}
	

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Ex04Staff [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}
}
