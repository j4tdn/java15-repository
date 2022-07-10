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
	
	WeekDayType(String wdAsSring){
		this.wdAsString = wdAsSring;
		
}

	@Override
	public String toString() {
		return wdAsString;
		
	}
	
	}