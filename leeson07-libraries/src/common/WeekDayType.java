package common;

public enum WeekDayType {
	SUNDAY("chủ nhật"),
	MONDAY("thứ hai"),
	TUESDAY("thứ ba"),
	WEDNESDAY("thứ tư"),
	THURSDAY("thứ năm"),
	FRIDAY("thứ sáu"),
	SATURDAY("thứ bảy");
	
	 private String wdAsString;
	 private WeekDayType(String wdAsString) {
		this.wdAsString = wdAsString;
		
	}@Override
	public String toString() {
		return wdAsString;
	}
	 

}
