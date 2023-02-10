package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@Column(name = "StudentId")
	private Integer id;
	
	@Column(name = "StudentName")
	private String name;
	
	@Column(name = "Gender")
	private String gender;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ClassId", referencedColumnName = "ClassId")
	private Class classX;
	
	@OneToMany(mappedBy = "student")
	List<Result> results;

	public Student() {
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

	public Class getClassX() {
		return classX;
	}

	public void setClassX(Class classX) {
		this.classX = classX;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", classX=" + classX + ", results="
				+ results + "]";
	}

	
	
	

}