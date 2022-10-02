package ex05.bean;

public class Student {
	private String id;
	private String name;
	private float score;
	private boolean gender;
	
	public Student() {
	
	}

	public Student(String id, String name, float score, boolean gender) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", gender=" + gender + "]";
	}
	
	
	
	
}
