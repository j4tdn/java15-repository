package company;

public class Staff extends Human {
	private String departmentName;

	public Staff(String name, int birthDate, float wageRatio, String departmentName) {
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
		return "Staff [toString()=" + super.toString() + "]";
	}

}
