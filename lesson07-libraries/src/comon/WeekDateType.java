package comon;

public enum WeekDateType {
	SUNDAY("CHU NHAT"),
	MONDAY("THU HAI"),
	TUESDAY("THU BA"),
	WEDNESDAY("THU TU"),
	THURSDAY("THU NAM"),
	FRIDAY("THU SAU"),
	SATURDAY("THU BAY");
	
	private String wdAsString;
	
	
	
	WeekDateType(String wString) {
		this.wdAsString = wString;
	}
	@Override
	public String toString() {
		return wdAsString;
	}
	
	
}