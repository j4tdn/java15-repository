package persistence;

public class Student {

	private Integer id;
	private String name;
	private String gender;
	private String class_id;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String gender, String class_id) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.class_id = class_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClass_id() {
		return class_id;
	}

	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", class_id=" + class_id + "]";
	}

}
