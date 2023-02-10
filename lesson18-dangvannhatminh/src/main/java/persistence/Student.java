package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private Integer id;

	@Column
	private String name;

	@Column
	private String gender;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
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

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

}
