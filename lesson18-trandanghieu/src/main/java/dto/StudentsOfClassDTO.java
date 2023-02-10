package dto;

public class StudentsOfClassDTO {
	public static final String SQL_CLASS_ID = "classId";
	public static final String SQL_CLASS_NAME = "className";
	public static final String SQL_CLASS_QUANTITY = "quantity";
	
	private Integer classId;
	private String className;
	private Integer quantity;
	public StudentsOfClassDTO() {
		
	}
	public StudentsOfClassDTO(Integer classId, String className, Integer quantity) {
		this.classId = classId;
		this.className = className;
		this.quantity = quantity;
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
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "\n StudentsOfClassDTO [classId=" + classId + ", className=" + className + ", quantity=" + quantity + "]";
	}
	
	

}
