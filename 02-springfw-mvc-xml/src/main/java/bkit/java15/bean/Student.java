package bkit.java15.bean;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import bkit.java15.validation.StartsWith;

public class Student {
	
	@NotNull(message = "id is required")
	@Size(min = 10, message = "id required min is 10 letters")
	private String id;
	
	@NotNull(message = "name is required")
	private String name;
	
	@NotNull(message = "age is required")
	@Min(value = 10, message = "min age is 10")
	@Max(value = 30, message = "max age is 30")
	private Integer age;
	
	@NotNull(message = "country is required")
	private Integer country;
	
	@NotNull(message = "operatingSystems is required")
	private List<String> operatingSystems;
	
	@StartsWith(prefixes = {"BKIT", "J4T"}, message = "CourseCode shoud be started with {BKIT, J4T}")
	private String courseCode;
	
	public Student() {
	}
	
	public Student(Integer country) {
		this.country = country;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getCountry() {
		return country;
	}
	
	public void setCountry(Integer country) {
		this.country = country;
	}
	
	public List<String> getOperatingSystems() {
		return operatingSystems;
	}
	
	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", operatingSystems=" + operatingSystems +"]";
	}
}
