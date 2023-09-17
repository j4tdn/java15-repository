package bkit.java15.bean;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull(message = "id is required")
	@Size(min = 10, message = "min is 10 letters")
	private String id;
	
	@NotNull(message = "name is required")
	private String name;
	
	@NotNull(message = "age is required")
	private Integer age;
	
	@NotNull(message = "country is required")
	private Integer country;
	
	@NotNull(message = "operatingSystems is required")
	private List<String> operatingSystems;
	
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", operatingSystems=" + operatingSystems +"]";
	}
}
