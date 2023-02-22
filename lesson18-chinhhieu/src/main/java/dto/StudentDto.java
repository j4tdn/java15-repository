package dto;

public class StudentDto {
	
	public static final String PROP_CLASS_NAME = "clName";
	public static final String PROP_STUDENT_NAME = "stName";
	public static final String PROP_AMOUNT = "amount";
	
	private String clName;
	private String stName;
	private int amount;
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	public StudentDto(String clName, String stName, int amount) {
		super();
		this.clName = clName;
		this.stName = stName;
		this.amount = amount;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "StudentDto [clName=" + clName + ", stName=" + stName + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
}
