package bkit.java15.bean;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import bkit.java15.validation.StartsWith;

public class Student {

	@NotNull(message = "id is required")
	@Size(min = 10, message = "is not less than 10")
	private String id;
	
	@NotNull(message = "name is required")
	private String name;
	
	@NotNull(message = "age is required")
	@Min(value = 10, message = "min is 10")
	@Max(value = 40, message = "max is 40")
	private Integer age;
	
	@NotNull(message = "country is required")
	private Integer country;
	
	@NotNull(message = "operatingSystems is required")
	private List<String> operatingSystems;

	@StartsWith(prefixes = {"BKIT", "DUT"}, message = "CourseCode should be started with {BKIT, DUT}")
	private String courseCode;
	
	public Student() {
	}
	
	public Student(String id, String name, Integer age, Integer country, List<String> operatingSystems) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
		this.operatingSystems = operatingSystems;
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
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", operatingSystems="
				+ operatingSystems + "]";
	}
	
	
}
