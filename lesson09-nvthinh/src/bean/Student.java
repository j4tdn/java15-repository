package bean;


public class Student {
	public int idStudent;
	public String nameStudent;
	public Type type ;
	public Student() {
		
	}
	
	
	public Student(int idStudent, String nameStudent, Type type) {
		
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.type = type;
	}


	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", type=" + type + "]";
	}
	
	
	
}
