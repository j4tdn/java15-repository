package ex01;

public class Student {
	private int ID;
	private String fullname;
	private double theoreticalScore;
	private double practicalScore;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public double getTheoreticalScore() {
		return theoreticalScore;
	}

	public void setTheoreticalScore(double theoreticalScore) {
		this.theoreticalScore = theoreticalScore;
	}

	public double getPracticalScore() {
		return practicalScore;
	}

	public void setPracticalScore(double practicalScore) {
		this.practicalScore = practicalScore;
	}

	public Student() {

	}

	public Student(int ID, String fullname, double theoreticalScore, double practicalScore) {
		this.ID = ID;
		this.fullname = fullname;
		this.theoreticalScore = theoreticalScore;
		this.practicalScore = practicalScore;
	}

	public double meanScore() {
		return (double) Math.round(((theoreticalScore + practicalScore) / 2) * 100) / 100;
	}

	@Override
	public String toString() {
		return "ID: " + ID + "\tFull name: " + fullname + "\tTheoretical Score: " + theoreticalScore
				+ "\tPractical Score: " + practicalScore + "\tMean Score: " + meanScore();
	}

}