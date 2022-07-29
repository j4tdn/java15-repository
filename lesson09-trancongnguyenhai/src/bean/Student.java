package bean;

public class Student {
	private int id;
	private String name;
	private Ranking rank;
	
	public Student() {

	}

	public Student(int id, String name, Ranking rank) {
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

	public Ranking getRank() {
		return rank;
	}

	public void setRank(Ranking rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", rank = " + rank + "]";
	}
	
	
}
