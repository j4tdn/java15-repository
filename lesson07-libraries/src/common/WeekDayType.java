package common;

public enum WeekDayType {
	SUNDAY("Sunday"), MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"),
	FRIDAY("Friday"), SATURDAY("Saturday");

	private String wdAsString;

	WeekDayType(String wdAsString) {
		// TODO Auto-generated constructor stub
		this.wdAsString = wdAsString;
	}

	public String toString() {
		return wdAsString;
	}
}
