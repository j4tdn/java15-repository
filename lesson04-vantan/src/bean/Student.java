package bean;

public class Student {
	private String name;
	private int id;
	private float pointLT;
	private float pointTH;
	
	public Student() {
	}

	public Student(String name, int id, float pointLT, float pointTH) {
		this.name = name;
		this.id = id;
		this.pointLT = pointLT;
		this.pointTH = pointTH;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPointLT() {
		return pointLT;
	}

	public void setPointLT(float pointLT) {
		this.pointLT = pointLT;
	}

	public float getPointTH() {
		return pointTH;
	}

	public void setPointTH(float pointTH) {
		this.pointTH = pointTH;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", pointLT=" + pointLT + ", pointTH=" + pointTH + "]";
	}
	public float average() {
		return (this.pointLT + this.pointTH) / 2;
	}
	
}	
