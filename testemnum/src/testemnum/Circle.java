package testemnum;

public enum Circle {
	OUTSIDE("ben ngoai duong tron"), INSIDE("ben trong duong tron"), ONSIDE("ben tren duong tron");

	String value;

	private Circle(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
