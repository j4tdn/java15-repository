package ex05;

public class Student {
	
	private int studentId;
	private String name;
	private double dtb;
	private Gender gender;
	
	public Student() {
	}

	public Student(int studentId, String name, double dtb, Gender gender) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dtb = dtb;
		this.gender = gender;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(double dtb) {
		this.dtb = dtb;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "\nStudent [studentId=" + studentId + ", name=" + name + ", dtb=" + dtb + ", gender=" + gender + "]";
	}
	
}
