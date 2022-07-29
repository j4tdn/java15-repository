package bean;

public class Student {
	private int mssv;
	private String name;
	private AcademicType level;
	 public Student() {
		
	}
	 
	


	public Student(int mssv, String name, AcademicType level) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.level = level;
	}

	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AcademicType getLevel() {
		return level;
	}
	public void setLevel(AcademicType level) {
		this.level = level;
	}
	 
	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", name=" + name + ", level=" + level + "]";
	}

}
