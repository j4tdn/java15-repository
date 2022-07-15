package common;

public enum WeekDayType {
	SUNDAY("Chủ nhật"), // WeekDayType SUNDAY = new WeekDayType("Chủ nhật")
	MONDAY("Thứ hai"),
	TUESDAY("Thứ ba"),
	WEDNESDAY("Thứ tư"),
	THURSDAY("Thứ năm"),
	FRIDAY("Thứ sáu"),
	SATURDAY("Thứ bảy");
	
	// mặc định là private
	
	private String wdAsString;
	
	WeekDayType(String wdAsString){
		this.wdAsString = wdAsString;
	}
	@Override
	public String toString() {
		return wdAsString;
	}
}
