package bean;

public class Student {
	private String id;
	private String name;
	private double gpa;
	private String gender;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, double gpa, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static Student transfer(String line) {
		String[] components = line.split(", ");
		if (components.length != 4) {
			return null;
		}
		return new Student(components[0], components[1], Double.parseDouble(components[2]), components[3]);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student that = (Student) obj;
		return getId().equals(that.getId());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", gender=" + gender + "]";
	}
}