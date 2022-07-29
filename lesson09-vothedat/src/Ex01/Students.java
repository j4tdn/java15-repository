package Ex01;

public class Students {
	private int id;
	private String name;
	private Score score;

	public Students() {
	}

	public Students(int id, String name, Score score) {
		this.id = id;
		this.name = name;
		this.score = score;
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
	
	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "id: " + id + " " + "name: " + name ;
	}
	

}
