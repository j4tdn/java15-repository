package Ex01;

public class Student {
	private String id;
	private String name;
	private AcademicRank level;
	
	public Student() {
		
	}

	public Student(String id, String name, AcademicRank level) {
		this.id = id;
		this.name = name;
		this.level = level;
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

	public AcademicRank getLevel() {
		return level;
	}

	public void setLevel(AcademicRank level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
}
