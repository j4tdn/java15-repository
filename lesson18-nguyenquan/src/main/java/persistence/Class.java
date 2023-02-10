package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name ="Class")
public class Class {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name ="name")
	private String name;
	@Column(name="teacher")
	private String teacher;
	
	@OneToMany(mappedBy = "class1")
	List<Student> students;
	public Class() {
		// TODO Auto-generated constructor stub
	}
	public Class(int id, String name, String teacher, List<Student> students) {
		
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.students = students;
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
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", teacher=" + teacher + ", students=" + students + "]";
	}
	
	

}
