package dto;

public class StudentOfClassDto {
	public static final String SQL_CLASS_ID = "classId";
	public static final String SQL_CLASS_NAME = "className";
	public static final String SQL_CLASS_amount = "amount";
	
	private Integer classId;
	private String className;
	private Integer amount;
	public StudentOfClassDto() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentOfClassDto(Integer classId, String className, Integer amount) {
		this.classId = classId;
		this.className = className;
		this.amount = amount;
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
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "\nStudentOfClassDto [classId=" + classId + ", className=" + className + ", amount=" + amount + "]";
	}
	
	
}
