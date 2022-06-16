package cityA;

public class Director {
	private String name;
	private String date;
	private int HSL;
	private int HSCV;
	
	public Director() {

	}

	public Director(String name, String date, int hSL, int hSCV) {
		this.name = name;
		this.date = date;
		HSL = hSL;
		HSCV = hSCV;
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

	public int getHSCV() {
		return HSCV;
	}

	public void setHSCV(int hSCV) {
		HSCV = hSCV;
	}

	@Override
	public String toString() {
		return "name=" + name + ", date=" + date + ", HSL=" + HSL + ", HSCV=" + HSCV;
	}
	
	public long salary() {
		return (HSL+HSCV)*3000000;
	}
	
}
