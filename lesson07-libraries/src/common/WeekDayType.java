package common;

public enum WeekDayType {
	SUNDAY("Chủ nhật"),
	MONDAY("Thứ Hai"),
	TUESDAY("Thứ Ba"),
	WEDNESDAY("Thứ Tư"),
	THURSDAY("Thứ Năm"),
	FRIDAY("Thứ Sáu"),
	SATURDAY("Thứ Bảy");
	
	
	private String wdAsString;
	
	private WeekDayType(String wdAsString) {
		this.wdAsString = wdAsString;
	}
	@Override
	public String toString() {
		return wdAsString;
	}
}
