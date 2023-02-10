package dto;

public class ClassDto {
	private String name;
	private Integer numOfStudents;
	
	public ClassDto() {

	}

	public ClassDto(String name, Integer numOfStudents) {
		this.name = name;
		this.numOfStudents = numOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumOfStudents() {
		return numOfStudents;
	}

	public void setNumOfStudents(Integer numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	@Override
	public String toString() {
		return "ClassDto [name=" + name + ", numOfStudents=" + numOfStudents + "]";
	}
	
	
}
