package common;

public enum WeekDayType {
	SUNDAY("Chủ Nhật"),
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
	public String toString() {
		return wdAsString;
	}
}