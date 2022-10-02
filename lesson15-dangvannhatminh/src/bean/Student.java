package bean;

public class Student {
	private String id;
	private String name;
	private double point;
	private String gender;
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
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String id, String name, double point, String gender) {
		this.id = id;
		this.name = name;
		this.point = point;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", point=" + point + ", gender=" + gender + "]";
	}
	public static Student transfer(String line)
	{
		String[] elements = line.split(", ");
		if (elements.length != 4) {
			System.out.println(line + " ... has ... wrong format !!!");
			return null;
		}
		return new Student(elements[0],elements[1],Double.parseDouble(elements[2]),elements[3]);
	}
	
}
