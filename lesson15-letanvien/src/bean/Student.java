package bean;

public class Student {
	private String id;
	private String name;
	private Double point;
	private String sex;
	
	public Student() {
		
	}

	public Student(String id, String name, Double point, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.sex = sex;
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

	public Double getPoint() {
		return point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + ", sex=" + sex + "]";
	}
	

}