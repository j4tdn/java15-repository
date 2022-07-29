package Ex01;

import java.awt.Point;

public class Student {
	private String id;
	private String name;
	private Point level;
	
	public Student() {
		
	}

	public Student(String id, String name, Point level) {
		super();
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
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
