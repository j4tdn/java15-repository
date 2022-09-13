package online.exercises;

public class Trader {
	private String name;
	private String city;

	public Trader(String n, String c) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	public String toString() {
		return "Trader:" + this.name + " in " + this.city;
	}
}
