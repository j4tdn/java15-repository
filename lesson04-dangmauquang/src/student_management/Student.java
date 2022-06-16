package student_management;

public class Student {
	private int studentId;
	private String name;
	private float theoryScores;
	private float practiceScores;
	
	public Student() {
	}

	public Student(int studentId, String name, float theoryScores, float practiceScores) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.theoryScores = theoryScores;
		this.practiceScores = practiceScores;
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

	public float getTheoryScores() {
		return theoryScores;
	}

	public void setTheoryScores(float theoryScores) {
		this.theoryScores = theoryScores;
	}

	public float getPracticeScores() {
		return practiceScores;
	}

	public void setPracticeScores(float practiceScores) {
		this.practiceScores = practiceScores;
	}
	
	public float averageScore() {
		return (theoryScores + practiceScores)/2;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", theoryScores=" + theoryScores
				+ ", practiceScores=" + practiceScores + ", averageScore=" + averageScore() + "]";
	}
	

	
}
