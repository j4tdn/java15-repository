package bean;

public class Student {
	private int id;
	private String name;
	private float pointLT, pointTH;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float pointLT, float pointTH) {
		super();
		this.id = id;
		this.name = name;
		this.pointLT = pointLT;
		this.pointTH = pointTH;
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
		return "Student [id=" + id + ", name=" + name + ", pointLT=" + pointLT + ", pointTH=" + pointTH + "]";
	}
	
	
}
