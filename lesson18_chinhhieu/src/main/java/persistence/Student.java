package persistence;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student { 
	
	@Id
	@Column(name = "Id")
	private Integer id;
	@Column(name  = "Name")
	private String name;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Class_Id")
	private Integer class_Id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Class_Id", referencedColumnName = "Id",insertable = false, updatable = false)
	private Class classse;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name, String gender, Integer class_Id) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.class_Id = class_Id;
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


	public Integer getClass_Id() {
		return class_Id;
	}


	public void setClass_Id(Integer class_Id) {
		this.class_Id = class_Id;
	}


	public Class getClassse() {
		return classse;
	}


	public void setClassse(Class classse) {
		this.classse = classse;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", class_Id=" + class_Id + "]";
	}
	
	
}
