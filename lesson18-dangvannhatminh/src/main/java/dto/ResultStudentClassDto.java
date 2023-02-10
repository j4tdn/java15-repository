package dto;

public class ResultStudentClassDto {
	
	public static final String SQL_CLASS_ID = "classId";
	public static final String SQL_CLASS_NAME = "className";
	public static final String SQL_STUDENT_NAME = "studentName";
	public static final String SQL_MAX_AVG_SCORE = "maxAvgScore";
	
	private Integer classId;
	private String className;
	private String studentName;
	private Double maxAvgScore;
	public ResultStudentClassDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ResultStudentClassDto(Integer classId, String className, String studentName, Double maxAvgScore) {
		this.classId = classId;
		this.className = className;
		this.studentName = studentName;
		this.maxAvgScore = maxAvgScore;
	}

	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getMaxAvgScore() {
		return maxAvgScore;
	}
	public void setMaxAvgScore(Double maxAvgScore) {
		this.maxAvgScore = maxAvgScore;
	}

	@Override
	public String toString() {
		return "\nResultStudentClassDto [classId=" + classId + ", className=" + className + ", studentName=" + studentName
				+ ", maxAvgScore=" + maxAvgScore + "]";
	}
	
	
}
