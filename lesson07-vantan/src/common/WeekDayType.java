package common;

public enum WeekDayType {
	SUNDAY("SUNDAY"),
	MONDAY("MONDAY"),
	TUESDAY("TUESDAY"),
	WEDNESDAY("WEDNESDAY"),
	THURSDAY("THURSDAY"),
	FRIDAY("FRIDAY"),
	SATURDAY("SATURDAY");
	
	private String wdAString;
	
	private WeekDayType(String wdString) {
		this.wdAString = wdString;
	}
	@Override
	public String toString() {
		return wdAString;
	}
}
