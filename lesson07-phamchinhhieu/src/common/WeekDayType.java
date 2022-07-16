package common;

public enum WeekDayType {
	SUNDAY("SUNDAY"),
	MONDAY("MONDAY"),
	TUESDAY("TUESDAY"),
	WEDNESDAY("WEDNESDAY"),
	THURSDAY("THURSDAY"),
	FRIDAY("FRIDAY"),
	SATURDAY("SATURDAY");
	
	
	private String wdAsString;
	
	private WeekDayType(String wdAsString) {
		this.wdAsString = wdAsString;
	}
	@Override
	public String toString() {
		return wdAsString;
	}
}