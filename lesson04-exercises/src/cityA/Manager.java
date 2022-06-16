package cityA;

public class Manager {
	private String name;
	private String date;
	private int HSL;
	private int amount;
	
	public Manager() {

	}

	public Manager(String name, String date, int hSL, int amount) {
		this.name = name;
		this.date = date;
		HSL = hSL;
		this.amount = amount;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "name=" + name + ", date=" + date + ", HSL=" + HSL + ", amount=" + amount;
	}
	
	public long salary() {
		return (HSL)*2200000;
	}
	
}
