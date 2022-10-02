package bean;

public class Students {
	private int idStudent;
	private String nameStudent;
	private double point;
	private String gender;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(int idStudent, String nameStudent, double point, String gender) {
		super();
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.point = point;
		this.gender = gender;
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

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Students [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", point=" + point + ", gender="
				+ gender + "]";
	}
	
}
