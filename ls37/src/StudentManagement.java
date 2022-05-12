
public class StudentManagement {
	private String studentNumber;
	private String studentName;
	private Date dateOfBirth;
	public double average;
	private Course course;
	public StudentManagement(String studentNumber, String studentName, Date dateOfBirth, double average,
			Course course) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.average = average;
		this.course = course;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	public String takeCourseName() {
		return this.course.getCourseName();
		
	}
	public boolean testExam() {
		return this.average >=5;
	}
	public boolean testDate(StudentManagement otherStudentManagement) {
		return this.dateOfBirth.equals(otherStudentManagement.dateOfBirth);
	}
	@Override
	public String toString() {
		return "ten hoc sinh " +this.studentNumber+ ", " +this.studentName+ ", " +this.dateOfBirth+ ", " +this.average+ ", " +this.course; 
	}
	
	

}
