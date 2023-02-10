package dto;

public class StudentDto {
	
	public static final String PROP_CLASS_ID = "clId";
	public static final String PROP_CLAAS_NAME = "clName";
	public static final String PROP_STUDENT_NAME = "stName";
	
	private Integer clId;
	private String clName;
	private String stName;
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	public StudentDto(Integer clId, String clName, String stName) {
		super();
		this.clId = clId;
		this.clName = clName;
		this.stName = stName;
	}
	public Integer getClId() {
		return clId;
	}
	public void setClId(Integer clId) {
		this.clId = clId;
	}
	public String getClName() {
		return clName;
	}
	public void setClName(String clName) {
		this.clName = clName;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	@Override
	public String toString() {
		return "StudentDto [clId=" + clId + ", clName=" + clName + ", stName=" + stName + "]";
	}
	
	
}
