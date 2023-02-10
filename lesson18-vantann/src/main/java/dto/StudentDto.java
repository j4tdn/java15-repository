package dto;

public class StudentDto {
	private String className;
	private Integer numberOfStudents;
	private String studentName;
	
	public StudentDto() {
	}

	public StudentDto(String className, Integer numberOfStudents, String studentName) {
		this.className = className;
		this.numberOfStudents = numberOfStudents;
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(Integer numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentDto [className=" + className + ", numberOfStudents=" + numberOfStudents + ", studentName="
				+ studentName + "]";
	}
	
	
}
