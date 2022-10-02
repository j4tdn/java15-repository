package ex05;

import java.util.Objects;

public class Student {
	private long id;
	private String name;
	private double point;
	private Gentle gentle;
	
	public Student() {
	}

	public Student(long id, String name, double point, Gentle gentle) {
		this.id = id;
		this.name = name;
		this.point = point;
		this.gentle = gentle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public Gentle getGentle() {
		return gentle;
	}

	public void setGentle(Gentle gentle) {
		this.gentle = gentle;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student that = (Student)obj;
		return getId() == that.getId();
		
	}
	@Override
	public int hashCode() {
		// Objects.hash
		return Objects.hash(getId());
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + ", gentle=" + gentle + "]";
	}
	
	
	
	
}
