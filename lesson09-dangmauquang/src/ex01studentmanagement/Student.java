package ex01studentmanagement;

public class Student {
	private int studentId;
	private String name;
	private Scores scores;
	
	public Student() {
	}

	public Student(int studentId, String name, Scores scores) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.scores = scores;
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

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", scores=" + scores + "]";
	}
	
}
