package been;


import view.Point;

public class Students {
	private String id;
	private String name;
	private Point level;
	
	public Students() {
		
	}

	public Students(String id, String name, Point level) {
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

	public Point getLevel() {
		return level;
	}

	public void setLevel(Point level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
}