package cityA;

public class Staff {
	private String name;
	private String date;
	private int HSL;
	private String unit;
	
	public Staff() {
	}

	public Staff(String name, String date, int hSL, String unit) {
		this.name = name;
		this.date = date;
		HSL = hSL;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHSL() {
		return HSL;
	}

	public void setHSL(int hSL) {
		HSL = hSL;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "name=" + name + ", date=" + date + ", HSL=" + HSL + ", unit=" + unit;
	}

	public long salary() {
		return (HSL)*1250000;
	}
	
}
