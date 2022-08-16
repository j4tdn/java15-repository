package ex04.utils;

public class Student {
	public String id;
	public String name;
	public int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
