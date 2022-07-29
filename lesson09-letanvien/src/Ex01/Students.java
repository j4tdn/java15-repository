package Ex01;

public class Students {

	private String id;
	private String name;
	private Enum level;
	
	public Students() {
	}

	public Students(String id, String name, Enum level) {
		this.id = id;
		this.name = name;
		this.level = level;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Enum getLevel() {
		return level;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(Enum level) {
		this.level = level;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
	
}