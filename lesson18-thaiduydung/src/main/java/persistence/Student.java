package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "gender")
	private String gender;
	
	
	
	private Class ClassId;
	
	public Student() {
	}

	public Student(int id, String name, String gender, Class ClassId) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.ClassId = ClassId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Class getClassId() {
		return ClassId;
	}

	public void setClassId(Class ClassId) {
		this.ClassId = ClassId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", ClassId=" + ClassId + "]";
	}
	
}
