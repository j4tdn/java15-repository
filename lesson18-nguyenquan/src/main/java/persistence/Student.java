package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name ="student")
public class Student {
	
	
@Id	
@Column(name="id")	
private String id;
@Column(name ="name")
private String name;
@Column(name ="gender")
private String gender;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "class_id", referencedColumnName = "id")
private Class class1;

public Student() {
	// TODO Auto-generated constructor stub
}

public Student(String id, String name, String gender, Class class1) {
	
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.class1 = class1;
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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Class getClass1() {
	return class1;
}

public void setClass1(Class class1) {
	this.class1 = class1;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", class1=" + class1 + "]";
}

}
