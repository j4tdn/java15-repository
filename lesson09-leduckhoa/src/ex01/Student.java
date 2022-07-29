package ex01;

public class Student {
	int id;
	String Name;
	Type type;
	public Student() {
		
	}
	public Student(int id, String name, Type type) {
		this.id = id;
		Name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", type=" + type + "]";
	}
	
}
