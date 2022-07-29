package ex01;

public class Student {
	private int id;
	private String name;
	private RankEnum rank;
	
	public Student() {
	}
	
	public Student(int id, String name, RankEnum rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
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

	public RankEnum getRank() {
		return rank;
	}

	public void setRank(RankEnum rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
	
	
}