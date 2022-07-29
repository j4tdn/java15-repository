package bean;

public class Student {
	private int id;
	private String name;
	private RankedAcademic rankacademic;
	
	public Student() {
	}

	public Student(int id, String name, RankedAcademic rankacademic) {
		this.id = id;
		this.name = name;
		this.rankacademic = rankacademic;
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

	public RankedAcademic getRankacademic() {
		return rankacademic;
	}

	public void setRankacademic(RankedAcademic rankacademic) {
		this.rankacademic = rankacademic;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rankacademic=" + rankacademic + "]";
	}
	
	
}