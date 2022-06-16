package studentManagement;

public class Student {
	private int id;
	private String fullName;
	private float theoryScore;
	private float practiceScore;

	public Student() {
	}

	public Student(int id, String fullName, float theoryScore, float practiceScore) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(float theoryScore) {
		this.theoryScore = theoryScore;
	}

	public float getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(float practiceScore) {
		this.practiceScore = practiceScore;
	}

	@Override
	public String toString() {
		return "Student [id = " + id + ", fullName = " + fullName + ", theoryScore = " + theoryScore
				+ ", practiceScore = " + practiceScore + "]";
	}

	public static float averageScore(Student sv) {
		return (sv.theoryScore + sv.practiceScore) / 2;
	}

}
