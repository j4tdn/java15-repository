package Ex01;

public class Student {
	private int idStudent;
	private String fullName;
	private float theoreticalPoint;
	private float practicePoint;
	
	public Student() {
		idStudent = 0;
		fullName = null;
		theoreticalPoint = 0;
		practicePoint = 0;
	}
	
	public Student(int idStudent, String fullName, float theoreticalPoint, float practicePoint) {
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.idStudent + "\nFull name: " + this.fullName 
				+ "\nTheoretical point: " + this.theoreticalPoint + "\nPractice point: " + this.practicePoint;
	}

}