package utils;

public class Student {
	private int studentId;
	private String name;
	private Grade grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, Grade grade) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
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

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
	}
	
}
