package studentmanagement;

public class Student {
	private int id;
	private String name;
	private float theoryscore;
	private float practicescore;
	
	public Student() {
	}

	public Student(int id, String name, float theoryscore, float practicescore) {
		this.id = id;
		this.name = name;
		this.theoryscore = theoryscore;
		this.practicescore = practicescore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoryscore() {
		return theoryscore;
	}

	public void setTheoryscore(float theoryscore) {
		this.theoryscore = theoryscore;
	}

	public float getPracticescore() {
		return practicescore;
	}

	public void setPracticescore(float practicescore) {
		this.practicescore = practicescore;
	}
	

	
	
	@Override
	public String toString() {
		return id+"  "+ name + "  " + theoryscore + "  " + practicescore;
	}

	public static float MediumScore(float theoryscore, float practicescore) {
		float mediumscore = theoryscore/practicescore;
		
		return mediumscore;
		
	}

	
	
	
	

}
