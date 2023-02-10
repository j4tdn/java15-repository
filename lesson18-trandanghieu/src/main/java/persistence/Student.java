package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String Gender;
	@Column(name="class_id")
	private Integer class_id;
	public Student() {
	}
	public Student(Integer id, String name, String gender, Integer class_id) {
		this.id = id;
		this.name = name;
		Gender = gender;
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
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "\n Student [id=" + id + ", name=" + name + ", Gender=" + Gender + ", class_id=" + class_id + "]";
	}
	
	
	
}
