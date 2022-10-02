package common;

public class Student {
	private int id;
	private String name;
	private double grade;
	private gender gender;

   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", gender=" + gender + "]";
	}

	public Student(int id, String name, double grade, common.gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public gender getGender() {
		return gender;
	}

	public void setGender(gender gender) {
		this.gender = gender;
	}

public Student() {
	// TODO Auto-generated constructor stub
}
}
